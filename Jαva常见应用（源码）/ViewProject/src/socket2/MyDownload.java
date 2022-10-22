package socket2;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

//处理下载的线程
public class MyDownload  implements Runnable{

	private Socket socket ;
	public MyDownload(Socket socket) {
		this.socket = socket ;
	}
	@Override
	public void run() {//线程要做什么事！ -下载
		try {
			System.out.println("与客户端连接成功！");
			
			//服务端向客户端发送消息 Output
			OutputStream out = socket.getOutputStream() ;
			
			File file  = new File("E:\\msdia80.dll");
			//将此文件 从硬盘 读入到内存
			InputStream fileIn = new FileInputStream(file) ;
			byte[] fileBytes = new byte[1000] ; //定义 每次发送的文件大小
			int len = -1 ;
			//发送（因为 文件较大，不能一次发送完毕，因此需要通过循环来 分次发送）
			while( (len=fileIn.read(fileBytes)) !=-1   ) {
				out.write(fileBytes,0,len);
			}
			
			fileIn.close();
			out.close();
			socket.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
