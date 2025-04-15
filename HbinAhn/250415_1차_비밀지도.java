package com.udp;

import java.io.IOException;
import java.net.*;

public class Server {

	public static void main(String[] args) {
		DatagramSocket sock=null;
		DatagramPacket pack=null;
		byte[] buf=new byte[11];
		
		try {
			sock=new DatagramSocket(7080);
			pack=new DatagramPacket(buf, buf.length);
			try {
				sock.receive(pack);
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		} catch (SocketException e) {
			e.printStackTrace();
		} finally {
			if(sock!=null) sock.close();
		}
		
		
	}

}


