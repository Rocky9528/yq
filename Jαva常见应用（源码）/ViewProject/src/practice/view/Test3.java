package practice.view;

public class Test3 {
//	有一堆煤球，堆成三角棱锥形。具体：
//	第一层放1个，
//	第二层3个（排列成三角形），
//	第三层6个（排列成三角形），
//	第四层10个（排列成三角形），
//	....
//	如果一共有100层，共有多少个煤球？
	public static void main(String[] args) {
		int eachLevel = 0;//每一层的个数
		//第i层多少个？  1+2+3+..+i
		//1: 1
		//2: 3=1+2
		//3: 1+2+3
		//i: 1+2+3+..+i
		int totalSum = 0 ;
		for(int j=1;j<=100;j++) {
			int sum = 0;
			for(int i=1 ;i<=j;i++) {//第8层多少个
				sum += i ;
			}
			totalSum += sum ;
//			sum:第[1-100]层的个数  
		}
		System.out.println(totalSum);
	}
}
