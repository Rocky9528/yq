package practice6;

public class TestStack {
	public static void main(String[] args) throws Exception {
		SeqStack stack = new SeqStack();
		System.out.println("初始情况：");
		stack.showEachElement();
		
		System.out.println( stack.isEmpt() );
		
		System.out.println("push....");
		stack.push("zs1");
		System.out.println( stack.isEmpt() );
//		stack.push("zs2");
//		stack.push("zs3");
//		stack.push("zs4");
//		stack.push("zs5");
//		stack.push("zs6");
//		stack.push("zs7");
//		stack.push("zs8");
//		stack.push("zs9");
//		stack.push("zs10");
//		stack.push("zs11");
		stack.showEachElement();
		
		System.out.println("peek.....");
		System.out.println(   stack.peek()   );
		System.out.println("pop....");
		Object topElement = stack.pop() ;
		System.out.println(topElement);
		stack.showEachElement();
	}
}
