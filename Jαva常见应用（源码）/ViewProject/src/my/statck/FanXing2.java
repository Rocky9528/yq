package my.statck;
//2:8  
//  用20%的时间，可以学习到80%的知识；剩下的20%知识 ，需要花80%的时间


public class FanXing2<T> {
	T obj ;//Character - char
	Object[] arr = new Object[10]; //java不支持泛型数组 T[] t = new T[5] 是错的
	
	public static void main(String[] args) {
		FanXing2<Character> fx = new FanXing2<Character>();
		
		
		fx.obj = 'a' ;//Object = 'a' ;
		
		char ch = 'a' ;//char ='a';
		System.out.println(  fx.obj  == ch );
							//Object == char
		
	}
}
