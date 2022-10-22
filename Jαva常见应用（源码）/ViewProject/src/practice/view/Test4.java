package practice.view;

public class Test4 {
	public static void main(String[] args) {
//		某君从某年开始每年都举办一次生日party，并且每次都要吹熄与年龄相同根数的蜡烛。
//		现在算起来，他一共吹熄了236根蜡烛。
//		请问，他从多少岁开始过生日party的？
//		请填写他开始过生日party的年龄数。
		 
		//x-y  ，一共吹了sum
		for(int j=1;j<100;j++) {
			int sum = 0 ; 
	//		for(int i=x ;i<=y;i++) {
			for(int i=j ;i>0;i--) {//23+22+...+6 
				sum += i ; //
				if(sum == 236) {
					System.out.println("开始："+i+"结束"+j);
					break ; 
					
				}
			}
		}
	}
}
