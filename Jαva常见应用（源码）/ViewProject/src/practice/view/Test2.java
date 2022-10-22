package practice.view;

public class Test2 {
	public static void main(String[] args) {
		//1-100之和
		//1+2+3+...+100
		int sum = 0 ;
		for(int i=1 ;i<=100;i++) {//i:1-100
			//sum:  1+2+3+4+...+100
//			sum = sum + i ; //求和公式
			sum += i ; //求和公式
		}
	}
}
