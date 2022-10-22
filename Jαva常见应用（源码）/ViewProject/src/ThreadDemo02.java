
public class ThreadDemo02 implements Runnable {
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			//线程名0-5
			System.out.println(Thread.currentThread().getName()+i);
		}
	}
	
	public static void main(String[] args) {
		
		ThreadDemo02 demo = new ThreadDemo02();
		//Runnable-->Thread方式
		Thread t1 = new Thread(demo);
		Thread t2 = new Thread(demo);
		Thread t3 = new Thread(demo);
		
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		
		t1.start();//start()-->run()
		t2.start();
		t3.start();
	}
}	
