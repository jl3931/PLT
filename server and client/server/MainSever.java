/*Written by Bohong Zhao*/

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class MainSever {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket;
		while (true) {
			serverSocket = new ServerSocket(4002);
			Socket socket = serverSocket.accept();
			new ServerInputThread(socket).start();
			new ServerOutputThread(socket).start();
			serverSocket.close();
		}

		
	}
}
