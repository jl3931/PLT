/*Written by Bohong Zhao*/

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


public class MainClient {
	public static void main(String[] args) throws Exception, IOException {
		
		Socket socket = new Socket("127.0.0.1", 4002);		
		new ClientInputStreamThread(socket).start();
		new ClientOutputStreamThread(socket).start();
	}
}
