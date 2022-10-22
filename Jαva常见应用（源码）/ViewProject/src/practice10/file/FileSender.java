package practice10.file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
//客户端：用户上传文件
public class FileSender {
	public static void main(String[] args) throws UnknownHostException, IOException {
//		Socket socket = new Socket("127.0.0.1",9999);
		InetAddress address = InetAddress.getByName("127.0.0.1");
		Socket socket = new Socket(address,9999);
		System.out.println("客户端发起连接");
		
		//流程： 文件->读入内存in->网络发送out->网络接收in->写入硬盘out
		
		//in： 讲本地文件 读入内存的
		InputStream in = new FileInputStream("d:\\jky.rar"); 
		
		//out：用户网络传输的（给服务端发送的）
		OutputStream out = socket.getOutputStream() ;
		//发送一个文件
		byte[] bs = new byte[1024] ;//1byte ->1kb
		int len = -1 ;
		while( (len=in.read(bs)) !=-1  )  {
			out.write(bs);//网络发送
		}
		
	
		
		out.close();
		in.close();
		
	}
}
