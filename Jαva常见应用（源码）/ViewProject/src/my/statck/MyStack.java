package my.statck;
/*
 * Object o = 'c' ;
 * 
 * char ch ='c' ;
 * 
 * 	if(o == ch){}
 * 		Object == char
 * 
 * -->泛型
 * 
 * MyStack<Character> stack = new MyStack<Character>();
 * Character t ;  //char t ;
 * if(t == ch)
 * char = char
 * 
 * public class MyStack<T>
 * {
 * 			T t ;
 * }
 * 
 */



//T - Object  -->T
public class MyStack<T> {//T可以是任意类型，通过T指定栈中元素的内容
	int maxsize ;//栈的最大容量
	
	//T：所有类型的基类，可以接受各种数据类型
	Object[] elements ;//栈中的所有元素
	
	//指向栈顶元素的 标识 （顶端元素的 上一个位置）
	int top ;
	
	public MyStack() {
		 init() ;
	}
	
	//init():产生栈时，自带一些元素
	public void init() {
		maxsize = 10 ;
		elements = new Object[maxsize] ;//java不支持泛型数组
		top = 0 ;
	}
	
	
	//push():增加
	public void push(T element) {     //  {x,x,x,x}
//		elements[top] = element ;
//		top ++ ;
		if(top == maxsize) {
			try {
				throw new Exception("栈已满！");//throw主动抛出异常，即产生了异常；如何处理异常：1.自己处理try ..catch..    2.抛给上一级 throws
				//主动抛出异常：throw
			}catch(Exception e) {
				//该异常，到底是什么信息？
				e.printStackTrace();//将异常信息打印。栈已满！
			}
		}
		
		
		elements[top++] = element ;
	}
	//public xxx 方法名():xxx代表返回值类型；如果没返回值，则写void
	//peek()
	public T peek( ) throws Exception{//抛给上一级?哪个方法调用peek()，则那个方法就是"上一级"
		if(top == 0 ) {//一个元素都没有
			throw new Exception("空栈！");//主动抛出异常
		}
		//T = Object
		return (T)elements[top-1] ;//elements[top-1]:获取顶端元素；return将顶端元素返回
	}
	//pop()
	public T pop() throws Exception{//top:1
//		T topElement = elements[top-1] ;//获取顶端元素
//		top--; //删除顶端元素(实质 是将该元素“遗忘”)
		if(top == 0 ) {//一个元素都没有
			throw new Exception("空栈！");//主动抛出异常
		}
		T topElement = (T)elements[--top] ;//获取顶端元素
		return topElement ;
	}
	
	//empty()
	public boolean empty() {
//		if(top==0)
//			return true ;
//		else 
//			return false ;
//		return top==0?true:false ;
		return top==0;
	}
	
	
	public int search(T element) {//a
		//	1.在elements数组中找到元素element的位置？
			/*
			 *   通过阅读JDK自带的Stack源代码发现 ，
			 *   search()中判断 2个元素是否相同，仅仅用了==
			 */
		int position = -1 ;//用于保存 带寻找element的位置
		//10  ->5
		//elements: {x,a,x,x,a,x,x  ,null,null,null
		//如何求a的lastIndeOf的值?
		for(int i=elements.length-1;i>=0;i--) {
			if(elements[i]!=null) {
				if(elements[i] == element) {
					position = i ;
					break ; 
				}
			}
		}
		return top-position ;
	}
	
	//展示当前栈中全部元素  
	public void showStack() {
		for(int i=0;i<top;i++) {
			System.out.print(elements[i]+"\t" );
		}
	}
	
	
}
