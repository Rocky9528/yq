package my.statck.huiwen;

/*
 * 1.栈
 * 2.一：回文数	
 * 				-->二、泛型 
 * 				// 如果遇到新知识点，且不重要。
 * 				讲：可能会晕，怀疑今天的学习质量。
 * 				不讲：感觉不错，但是可能漏点东西。
 * 
 * 		难、不重要的、
 * 			
 * 			
 * 
 */

import my.statck.MyStack;
//泛型
/*
 * everthing is an object  
 * short int long  char boolean byte float double 
 * Short Integer Long Character Boolean Byte  Float  Double
 * 
 */
public class HuiWen {
	public static void main(String[] args) {
//Object:可以接受任何类型，但Object自身也是一个类型  char != Object
//T:可以接受任何类型，但T自身是一个动态类型： <Integer> ->t就是int类型
		//abccba
		//思路：将前一半入栈 
		MyStack<Character> stack = new MyStack<Character>();
		String word = "a1xy2y2yx1a" ;
		char[] letters = word.toCharArray() ;//"abcdcba" ->{a,b,c,d,c,b,a}
		int i=0 ;
		for(;i<letters.length/2 ;i++) {//i:d
			stack.push(  letters[i]  );
		}
		
		if(letters.length %2 !=0) {
			i++ ;
		}
		
		for(;i<letters.length;i++) {
			try {
				//任何类型遇到字符串，则转为字符串类型
				//Object->"a" ->{'a'}
				//char = (Object->String->char[]->char)
				//  x = x
				if(letters[i] ==   stack.peek()   ) {
					//char == char
					stack.pop() ;
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(stack.empty());
	}
}
