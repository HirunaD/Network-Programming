package ChatWithThread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import ServerClient.ServerThread;

public class ChatServerThread {

	static int port = 7744;

	public static void main(String[] args) throws IOException {
		System.out.println("\t\t Simple Socker Server");
		System.out.println("\t\t=====================\n\n");
		

		ServerSocket serversocket = new ServerSocket(port);
		
		int current_clients = 1;
		
		try {
			while (true) {
			//Listening for any client socket requests
			Socket client = serversocket.accept();
			System.out.println("Client is connected.....\n\n");
			
			ServerThread ct = new ServerThread(client, current_clients);
			ct.start();
			current_clients++;

//			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
//			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));   
//			
//			try {
//				out.println("Welcome to Chat Application");
//				while(true) {
//					input = in.readLine();
//					System.out.println("Client Says: "+ input);
//					
//					System.out.println("Server: ");
//					output = ScannerInput.nextLine();
//					out.println(output);
//				}
//			
//			} finally {
//				socket.close();
//				out.close();
//				in.close();
//			}
//		}
		}finally {
			serversocket.close();
		}
		
	}
}
