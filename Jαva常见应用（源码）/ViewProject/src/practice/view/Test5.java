package practice.view;

public class Test5 {
	public static void main(String[] args) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<2-i;j++) {//空格
				System.out.print(" ");
			}
			for(int k=0;k<i*2+1;k++) {//*
				System.out.print("*" );
			}
			System.out.println();
		}
//		System.out.println("  *");  0-1
//		System.out.println(" ***"); 1-3
//		System.out.println("*****");2-5   *=行号*2+1
//									
	}
}
