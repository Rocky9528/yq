package practice10;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
//		Socket socket = new Socket("127.0.0.1",9999);
		InetAddress address = InetAddress.getByName("127.0.0.1");
		Socket socket = new Socket(address,9999);
		System.out.println("客户端发起连接");
		
		OutputStream out = socket.getOutputStream() ;
		
		out.write(2);//吃饭
		
		out.close();
		
		
	}
}
