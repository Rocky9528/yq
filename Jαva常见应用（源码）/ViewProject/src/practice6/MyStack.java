package practice6;

public interface MyStack {
	void push(Object element) throws Exception;
	boolean isEmpt() ;
	Object pop() throws Exception;
	Object peek() throws Exception;
}
