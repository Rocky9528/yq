package practice.view;


public class Test {
	public static void main(String[] args) {
		for(int i=1;i<100;i++) {
			int sum = 0 ; 
			for(int j=i;j>0;j--) { //1    i:今年吹的蜡烛书（今年）
	//		for(int j=1;j<28;j++) {1+2+3+...+27
				sum += j ; // 1-27之和，1-27岁共吹的蜡烛数量
				if(sum == 236) {
					System.out.println(i+"--"+j);
					break ; 
				}
			}
		
		}
	}
}
