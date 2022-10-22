package practice33;

import java.util.Stack;
//{{}[]()[]}
public class BalanceDemo {
	
	//输入一些括号，判断是匹配
	public   static boolean isBalance(String line) {
	//{[()]}	 -> '{','[','('    	
		char[] lineChs = new char[line.length()];
		for(int i=0;i<line.length();i++) {
			lineChs[i] = line.substring(i, i+1).charAt(0) ;// "{","["
		}
		//以上，等价于lineChs = line.toCharArray()
		Stack<Character> stack = new Stack<>();
		for(char ch :lineChs) {//lineChs:{}{}[]{}()
//		for(int i=0;i<lineChs.length;i++) {//lineChs:{}{}[]{}()
			if(ch=='{' ||ch=='[' ||ch=='(' ) {
				stack.push(ch) ;//lineChs[i] -- ch
				continue ;
			}
			if( stack.isEmpty()  &&  (  ch=='}' ||ch==']' ||ch==')'  )) {
				stack.push(ch) ; //](){}	  
				break ;
			}
			if( stack.peek()=='{' &&    ch=='}'     ) {
				stack.pop() ;// {]}
				continue  ;
			}else if( stack.peek()=='{' && (   ch==']' ||   ch==')')  ){
				break ; 
			}
			if( stack.peek()=='[' &&    ch==']'     ) {
				stack.pop() ;
				continue  ;
			}else if( stack.peek()=='[' && (   ch=='}' ||   ch==')')  ){
				break ; 
			}
			if( stack.peek()=='(' &&    ch==')'     ) {
				stack.pop() ;
				continue  ;
			}else if( stack.peek()=='(' && (   ch==']' ||   ch=='}')  ){
				break ; 
			}
		}
		
		return stack.isEmpty() ;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(   BalanceDemo.isBalance("{[{]}}")  );
		
		
	}
	
}
