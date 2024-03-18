package ChatWithThread;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.Buffer;
import java.util.Scanner;

public class ServerThread extends Thread {
	
	private Socket client;
	private int client_id;
	private PrintWriter out;
	private Buffer in;
	private Scanner ScannetInput;
	
	public ServerThread(Socket client_socket, int c_id) {
		this.client = client_socket;
		this.client_id = c_id;
		in = new BufferReader(new InputStreamReader(client.getInputStream()));
		out = new PrintWriter(client.getOutputStream(), true);
	}

	@Override
	public void run() {
		
//		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
//		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));   
		
		try {
			out.println("Welcome to Chat Application");
			while(true) {
				String input = in.readLine();
				System.out.println("Client "+ client_id + "says: " + input);
				
				System.out.println("Server: ");
				String output = ScannerInput.nextLine();
				out.println(output);
			}
		
		} finally {
			client.close();
			out.close();
			in.close();
		}
	}
}
