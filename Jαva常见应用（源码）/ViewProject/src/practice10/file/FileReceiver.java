package practice10.file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
//文件服务器： 接受用户上传的文件
public class FileReceiver {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(9999);//ip （127.0.0.1）:端口号
		
		Socket  socket = serverSocket.accept() ;//等待客户端连接
		System.out.println("服务端成功链接！");
		
		//in：用户接受客户端发来的文件
		InputStream in = socket.getInputStream() ;
		
		OutputStream out = new FileOutputStream("d:\\13.rar") ;
		
		byte[] bs = new byte[1024] ;
		int len = -1 ;
		while((len=in.read(bs)) != -1  ) {
			out.write(bs, 0, len);
		}
		
		//out:将受到的文件  写入硬盘
		in.close();
		out.close();
	}
	
	
	
}
