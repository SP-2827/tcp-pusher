package org.sick.tcp.connector.client;

import org.sick.tcp.connector.server.TcpServer;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class TcpClient {

    public static final int PRODUCER_COUNT = 2;
    public static final int CONSUMER_COUNT = 3;
    public static final int TOTAL_PAYLOAD_SIZE = 100000;
    private final BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(1000);

    public static final String HOSTNAME = "127.0.0.1";

    public void connect() throws IOException, InterruptedException {

        final ExecutorService producerExecutorService = Executors.newFixedThreadPool(PRODUCER_COUNT);
        final ExecutorService consumerExecutorService = Executors.newFixedThreadPool(CONSUMER_COUNT);


        try {
            for (int i = 0; i < PRODUCER_COUNT; i++) {
                producerExecutorService.submit(new Producer(blockingQueue));
            }

            Thread.sleep(3000);
            final AtomicInteger counter = new AtomicInteger();
            final CountDownLatch countDownLatch = new CountDownLatch(CONSUMER_COUNT);
            final Instant startDate = Instant.now();
            for (int i = 0; i < CONSUMER_COUNT; i++) {
                final Consumer runnable = new Consumer(blockingQueue, countDownLatch, counter);
                consumerExecutorService.submit(runnable);
            }

            Thread.sleep(3000);

            int lastCount = 0;
            while (true) {
                final int count = counter.get();
                if (!(lastCount < TOTAL_PAYLOAD_SIZE)) {
                    break;
                }
                final long between = ChronoUnit.SECONDS.between(startDate, Instant.now());
                System.out.println("Stats ------------- PAYLOAD " + count + "  time taken in seconds " + between + " payload/sec = " + (count - lastCount));
                Thread.sleep(1000);
                lastCount = count;
            }

            countDownLatch.await();
        } finally {
            producerExecutorService.shutdown();
            consumerExecutorService.shutdown();
        }

    }


    public static class Producer implements Runnable {

        private final BlockingQueue<String> blockingQueue;
        private final AtomicInteger counter = new AtomicInteger();

        public Producer(final BlockingQueue<String> blockingQueue) {
            this.blockingQueue = blockingQueue;
        }

        @Override
        public void run() {
            try {
                while (true) {

                    blockingQueue.put(SendSVPData.getXMLAsString());
                    if (counter.incrementAndGet() % 100 == 0) {
                        Thread.sleep(5000);
                        System.out.println("Producer current stage at " + counter.get());
                    }
                    if (counter.incrementAndGet() == TOTAL_PAYLOAD_SIZE) {
                        break;
                    }
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                System.out.println("Producer completed at " + counter.get());
            }
        }
    }


    public static class Consumer implements Runnable {

        private final BlockingQueue<String> blockingQueue;
        private final CountDownLatch countDownLatch;

        private final AtomicInteger counter;

        public Consumer(final BlockingQueue<String> blockingQueue, final CountDownLatch countDownLatch, final AtomicInteger counter) {
            this.blockingQueue = blockingQueue;
            this.countDownLatch = countDownLatch;
            this.counter = counter;
        }

        @Override
        public void run() {
            try (final Socket socket = new Socket(Proxy.NO_PROXY)) {
                final InetSocketAddress address = new InetSocketAddress(HOSTNAME, TcpServer.SERVER_PORT);
                socket.connect(address);
                socket.setSoLinger(true, 3);
                socket.setKeepAlive(true);
                socket.setTcpNoDelay(true);

                try (final OutputStreamWriter writer = new OutputStreamWriter(socket.getOutputStream())) {
                    while (true) {
                        writer.write(2);
                        writer.write(blockingQueue.take());
                        writer.write(3);
                        writer.flush();

                        final int count = counter.incrementAndGet();
                        if (count % 1000 == 0) {
                            Thread.sleep(1000);
                        }
                        if (counter.incrementAndGet() == TOTAL_PAYLOAD_SIZE) {
                            break;
                        }
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }


            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                countDownLatch.countDown();
                System.out.println("Consumer completed at " + counter.get());
            }
        }

    }
}


