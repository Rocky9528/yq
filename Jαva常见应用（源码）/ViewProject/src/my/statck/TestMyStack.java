package my.statck;

public class TestMyStack {
	//建议main的异常，不要再往上抛，否则无法处理
	public static void main(String[] args) throws Exception {//JVM
		MyStack<String> stack = new MyStack<String>();
//		stack.init();
		
		stack.push("a");
		stack.push("x");
		stack.push("b");
		stack.push("c");
		stack.push("b");
		stack.push("c");
		stack.push("a");
		
		stack.showStack();
		
		System.out.println(  stack.search("x"));;
		
		/*
		System.out.println("====peek======");
		try {
			System.out.println(stack.peek()   );
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("====peek======");
		stack.showStack();
		System.out.println("====pop======");
		System.out.println(    stack.pop()       );
		System.out.println("====pop======");
		stack.showStack();
		stack.pop() ;
		System.out.println(  stack.empty());
		stack.pop() ;
		System.out.println(  stack.empty());
		*/
		
	}
}
