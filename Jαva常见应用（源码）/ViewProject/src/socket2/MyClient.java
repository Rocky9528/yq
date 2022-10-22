package socket2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//客户端 连接Server发布的服务
		Socket socket = new Socket("192.168.1.254",9998);
		
		//接受服务端发送的消息 InputStream
		InputStream in = socket.getInputStream() ;
		
		
		/*接受普通文字hello
		byte[] bs = new byte[100] ;
		in.read( bs) ;//读取发送来的数据
		*/
		
		byte[] bs = new byte[1000] ;//接受每次发来的文件切片（100byte）
		int len = -1 ;
		OutputStream fileOut = new FileOutputStream("e:\\a.dll") ;
		while( (len =in.read(bs))!=-1 ) {
			fileOut.write(bs,0,len);
		}
		System.out.println("下载成功！");
		
//		//byte[]->String  
//		System.out.println("client接受到的消息为："+  new String(bs));
//		
//		//客户端向服务端做出反馈（向服务端发送消息）
//		OutputStream out = socket.getOutputStream() ;
//		out.write("world".getBytes());
//		
		fileOut.close();
//		out.close();
		in.close();
		socket.close();
	}
	
}
