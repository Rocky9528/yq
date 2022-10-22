package practice10;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(9999);//ip （127.0.0.1）:端口号
		System.out.println("欢迎来到....请选择:");
		System.out.println("1.玩游戏");
		System.out.println("2.吃饭");
		System.out.println("3.看电影");
		
		
		Socket  socket = serverSocket.accept() ;//等待客户端连接
		System.out.println("服务端成功链接！");
		
		InputStream in = socket.getInputStream() ;
		int choice = in.read()  ;
		switch(choice) {
			case 1:
				System.out.println("进入游戏城..");
				break ;
			case 2:
				System.out.println("进入美食城..");
				break ;
			case 3:
				System.out.println("进入影视城..");
				break ;
			default:
				System.out.println("其他..");
				break ;
		}
		in.close();
	}
	
	
	
}
