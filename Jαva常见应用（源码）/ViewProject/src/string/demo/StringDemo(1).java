package string.demo;

public class StringDemo {
	public static void main(String[] args) {
//		int num = 10 ;
//		num =11 ;
//		System.out.println(num);
//		String str = "a" ;
//		str = "b" ;
		
		String str1= "hello" ;
		String str2 = "hello" ;
//		System.out.println(str1 == str2);
		String str3 = new String("hello");
		String str4 = new String("hello");
		String str5 = new String("hello");
		
		System.out.println("str1==str2"+ (str1==str2));
		System.out.println("str3==str4"+ (str3==str4));
		System.out.println("str1==str4"+ (str1==str4));
		
		String str6 = new String("abc") +"abc" ;
		System.out.println(str6);
		str4 = str4.intern() ;//String中的inter()方法，可以让 引用直接指向常量池
		
		System.out.println("str1==str4"+ (str1==str4));
		
		
		
	}
}
