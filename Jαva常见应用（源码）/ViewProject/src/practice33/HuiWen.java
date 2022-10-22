package practice33;

import java.util.Stack;

public class HuiWen {
	public static void main(String[] args) {
		//回文数
		//abcba  ->翻转abcba
//		String str = "abcba" ;
//		StringBuffer sb = new StringBuffer(str);
//		sb = sb.reverse() ;
//		System.out.println(str.equals(sb.toString()  )   );
		Stack<Character> stack = new Stack();
//		String huiWen = "abcba" ;
		char[] huiwen = {'a','b','c','c','b','a'} ;
		//将前一半入栈
		int i=0 ;
		for(;i<huiwen.length/2 ;i++) {
			stack.push(huiwen[i]) ;
		}
		
		if(huiwen.length%2 != 0) {//忽略中间元素
			i++ ;
		}
		
		for( ;i<huiwen.length;i++) {
			if( stack.peek() ==    huiwen[i] ) {
				stack.pop() ;
			}
		}
		
		System.out.println(   stack.isEmpty()          );
		
		
		
		
		
		
		
	}
}
