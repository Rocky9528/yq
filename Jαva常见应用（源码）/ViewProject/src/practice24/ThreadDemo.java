package practice24;

public class ThreadDemo  implements Runnable{	//继承：会增加耦合度
	int num = 1 ;
	
	@Override
	public  synchronized void run() {//  A-B  1
		while(num<=100) {
			notify();
			System.out.println( Thread.currentThread().getName() +  num++);
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		//2个线程 交替打印1-100         
		ThreadDemo th1 = new ThreadDemo();
		Thread t1 = new Thread(th1) ;
		t1.setName("A");
		Thread t2 = new Thread(th1) ;
		t2.setName("B");
		t1.start();
		t2.start();
		
 		
		
		
	}


}
