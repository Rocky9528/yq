// 2种实现方式:继承Thread,实现Runnable


public class ThreadDemo  extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			//线程名0-5
			System.out.println(Thread.currentThread().getName()+i);
		}
	}
	
	public static void main(String[] args) {
		ThreadDemo t1 = new ThreadDemo();
		ThreadDemo t2 = new ThreadDemo();
		ThreadDemo t3 = new ThreadDemo();
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		
		t1.start();//start()-->run()
		t2.start();
		t3.start();
	}
}
