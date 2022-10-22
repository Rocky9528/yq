package practice25;

public class Window implements  Runnable {
//	static int tickets = 100;
	int tickets = 3800;
	
	@Override
	public  void run() {
		while(tickets>0) {
			System.out.println(Thread.currentThread().getName() +"正在售票，第"+ tickets-- +"张" );
		}
	}
	
	public static void main(String[] args) {
		Window w = new Window();
		
		Thread t1 = new Thread(w);
		Thread t2 = new Thread(w);
		Thread t3 = new Thread(w);
		Thread t4 = new Thread(w);
		Thread t5 = new Thread(w);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		
		
	}
	
	
}
