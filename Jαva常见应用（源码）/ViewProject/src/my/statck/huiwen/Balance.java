package my.statck.huiwen;

import my.statck.MyStack;
//类似于   分类的题：先画图、理逻辑

public class Balance {
	public static void main(String[] args) throws Exception {
				//continue:  ( ->if  ()    |if
		String kuoHao = "(){}{[([   ]{}())]}()" ;
		char[] kuoHaos = kuoHao.toCharArray() ;
		MyStack<Character> stack = new MyStack<Character>();
		
//		for(int i=0;i<kuoHaos.length;i++) {
		for(char ch :kuoHaos) {
			if(ch=='{' ||ch=='[' ||ch=='(' ) {
				stack.push(ch) ;//lineChs[i] -- ch
				continue ;
			}
			if(stack.empty()  && ( ch=='}' ||ch==']'||ch==')'      ) ){
				//因为 如果最终的栈不为空，就说明 字符串不是平衡括号
				stack.push(ch);//人为将 栈设置为  不为空，目的就是 将结果设置为false
				break ; 
			}
//			(      ){}{[([]{}())]}()" ;
//			if(kh==')' &&  stack.peek()=='(') {
			
			//(  )
			if(ch==')'  &&  (stack.peek()=='(')) {
				stack.pop() ;
				continue ;
			}else if(ch==')'  &&  (stack.peek()=='[')  ||( stack.peek()=='{')) {//(  ]
				stack.push(ch) ;
				break ; //()[]{[("[")]}
			}
			if(ch==']'  &&  (stack.peek()=='[')) {
				stack.pop() ;
			}else if(ch==']'  &&  (stack.peek()=='(')  ||( stack.peek()=='{')) {//(  ]
				stack.push(ch) ;
				break ; 
			}
			if(ch=='}'  &&  (stack.peek()=='{')) {
				stack.pop() ;
				continue ;
			}else if(ch=='}'  &&  (stack.peek()=='[')  ||( stack.peek()=='(')) {//(  ]
				stack.push(ch) ;
				break ; 
			}
			
		}
		
		System.out.println(stack.empty());
		
		
	}
}
