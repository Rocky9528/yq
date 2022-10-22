package practice5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Tets {
	public static void main(String[] args) throws IOException {
		//字节流、字符流   
		//复制：  文件jky->输入流->内存->输出流->文件hello
		
		//输入流：文件->输入流->内存
//		InputStream input = new FileInputStream("D:"+File.separator+"jky.rar") ;
		InputStream input = new FileInputStream(args[0]) ;
//		输出流：内存->输出流->文件
//		OutputStream out = new FileOutputStream("D:"+File.separator+"hello.rar") ;
		OutputStream out = new FileOutputStream(args[1]) ;
		
		byte[] bs = new byte[1024] ;
		
		int len = -1 ;
		while(( len= input.read(bs)) != -1    ) {
			out.write(bs, 0, len);  //  1024   :  200  0-200
		}
		
		out.close();
		input.close();
		System.out.println("复制完毕！");
		
		
		
		
		
		
		
		
		
	}
}
