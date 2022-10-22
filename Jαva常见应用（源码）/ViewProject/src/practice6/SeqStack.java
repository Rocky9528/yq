package practice6;

import java.util.Arrays;

public class SeqStack  implements MyStack{
	final int SIZE = 10 ;//栈的总容量
	int currentSize ; //当前时刻 栈中元素的个数
	Object[] elements ;//栈中存放的元素
	int top ;//指向栈顶元素的上一位
	
	public SeqStack() {
		init() ;
	}
	
	public void init() { 
		//初始化
		top = 0;
		currentSize = 0 ;
		elements = new Object[SIZE];  
	}
	
	@Override
	public void push(Object element) throws Exception{
		if(top == SIZE) {
			throw new Exception("栈已满！");
		}
		elements[top++]  = element;
	}

	@Override
	public boolean isEmpt() {
		return   top==0?true:false   ;
	}

	@Override
	public Object pop() throws Exception {//取出，再“删除”(这里的删除是指 将元素置为 遗忘状态)
		if(top == 0) {
			throw new Exception("栈已空！");
		}
		return elements[--top];
	}

	@Override
	public Object peek() throws Exception{
		if(top == 0) {
			throw new Exception("栈已空！");
		}
		return elements[top-1];
	}
	
	
	public void showEachElement() {
		for(int i=0;i<top;i++) {
			System.out.print(elements[i]+"\t");
		}
		System.out.println();
	}
	

}
