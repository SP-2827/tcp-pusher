package org.sick.tcp.connector.client;

import org.junit.Test;

import java.io.IOException;

public class TcpClientTest {


    @Test
    public void runPayloadSender() throws IOException, InterruptedException {
        new TcpClient().connect();
    }

}