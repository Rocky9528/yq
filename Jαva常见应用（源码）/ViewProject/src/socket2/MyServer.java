package socket2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	public static void main(String[] args) throws IOException {
		//绑定服务的端口，ip：为本机Ip
		//暴漏了一个 服务，该服务的地址： 本机ip:9999
		ServerSocket server = new ServerSocket(9998);
		while(true) {
			Socket socket =  server.accept() ;
			//下载的线程
//			MyDownload download = new MyDownload(socket) ;
//			//Runnable->Thread
//			Thread downLoadThread = new Thread(download);
//			downLoadThread.start();
			 new Thread(new MyDownload(socket)).start(); 
		}
	}
}
