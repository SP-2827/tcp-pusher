package org.sick.tcp.connector.client;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.Proxy;
import java.net.Socket;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import org.sick.tcp.connector.dataMapping.Objectdata_mapper;
import org.sick.tcp.connector.dto.Objectdata;

public class SendSVPData {

	static String tcpIpAddress = "10.102.11.117";
	static int tcpPort = 2008;
	Socket tcpSocket = new Socket(Proxy.NO_PROXY);
	String outfromServer;
	static String inputfile = "PA-simulator.bat" ;
	static String xmlfile ="xml.xml";
	
	public static void main(String[] args) throws IOException {

		System.out.println("Starting the execution");
		SendSVPData sendData = new SendSVPData();
//		String ip = args[0];	
//		String tunnel = args[];
//		String repeat = args[2];
//		int loopcount = Integer.parseInt(args[3]);
//		String file  = args[4];	
//		int port = Integer.parseInt(args[5]);
		sendData.writeXML(1,xmlfile);
		sendData.builder(tcpIpAddress,"10","false",10,xmlfile, tcpPort , 333 );
		System.out.println("Ending the execution");
	}

	public static String getXMLAsString() {
		Objectdata_mapper o = new Objectdata_mapper();

		String xmlString = null;
		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(Objectdata.class);

			Marshaller jaxbMarshaller;

			jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, false);
			jaxbMarshaller.setProperty(Marshaller.JAXB_NO_NAMESPACE_SCHEMA_LOCATION, "Logging.xsd");
			jaxbMarshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);

			StringWriter sw = new StringWriter();
			jaxbMarshaller.marshal(o.data, sw);
			xmlString = sw.toString();
//			System.out.println(xmlString);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
//		System.out.println("Sending data via system " + o.data.getDevicename());
		return xmlString;

	}

/*	public void sendDataViaTCP(int loopcount, String ip, int port, int delay) {
		try {

			InetSocketAddress address = new InetSocketAddress(ip, port);
			tcpSocket.connect(address, 10000);
			tcpSocket.setSoLinger(true, 3);
			tcpSocket.setKeepAlive(true);
			tcpSocket.setTcpNoDelay(true);
			DataOutputStream wr = new DataOutputStream(tcpSocket.getOutputStream());
			DataInputStream in = new DataInputStream(tcpSocket.getInputStream());
			SendSVPData sendData = new SendSVPData();

			for (int i = 1; i <= loopcount; i++) {
				System.out.println("Sending data " + i);
				wr.write(2);
				wr.writeBytes(sendData.get_XML_as_String());
				wr.write(3);
				wr.flush();
				Thread.sleep(delay);
			}
//        while((outfromServer = in.readLine()) != null) {
//            System.out.print(outfromServer);
//          }
			tcpSocket.shutdownInput();
			tcpSocket.shutdownOutput();
			tcpSocket.close();

		} catch (IOException ie) {
			System.out.println("IO Error occured : " + ie.toString());
		} catch (Exception e) {
			System.out.println("Error occured : " + e.toString());
		}

	} */

	public void writeXML(int loopcount,String xmlfile) {
		try {
		FileWriter filewriter = new FileWriter("TCPconnector/../xml.xml",false);
		try (BufferedWriter bufferwriter = new BufferedWriter(filewriter)) {
			for (int i = 1; i <= loopcount; i++) {
			System.out.println("Sending data " + i);
			bufferwriter.write(1);
			bufferwriter.write(SendSVPData.getXMLAsString());
			bufferwriter.write('\n');
			bufferwriter.write(2);
			bufferwriter.flush();
			Thread.sleep(500);
			}
		}	  
	} 
		catch (IOException ie) {
			System.out.println("IO Error occured : " + ie.toString());
		} catch (Exception e) {
			System.out.println("Error occured : " + e.toString());
		}
	}
	public void builder(String ip , String tunnel , String repeat,int loopcount , String xmlfile , int tcpPort , int delay)  {		
		try {
			ProcessBuilder pb = new ProcessBuilder("cmd.exe","/c","start");	
			pb.redirectErrorStream(true);
			Process start = pb.start();
			BufferedReader reader = new BufferedReader(new InputStreamReader(start.getInputStream()));
			for (int i = 1; i <= loopcount; i++) {
				StringBuilder output = new StringBuilder();
				String line ;
				while ((line = reader.readLine())!=null) {
					output.append(" line  :" +line);	
				}
				System.out.println(output);
				
			}	
		} catch (IOException e) {	
			System.out.println("IO Exception :"+e);
		}
	}
	
	}


	
	

