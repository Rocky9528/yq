package practice.view;

import java.util.Arrays;

/*
 * 思想： 
 *    每一趟： 当前元素a[j] 与下一个元素a[j+1]进行比较，   判断 a[j]>a[j+1],如果是，则交换；
 *    每一趟比较结束，都会找到一个最大值  -->下一次比较，少比较一次
 *    难点：第i趟，比较多少次？j=nums.length-1-i
 * 
 */
public class Test6 {
	public static void main(String[] args) {
		//冒泡排序、快速排序
		int[] nums = {22,17,2,3,8} ; 
		//思想： 每一趟，依次询问下一个元素：你是不是比我小，如果是，则交换
		//第0趟：(4)        17,2，3,8，[22]     -一轮结束，找到一个最大值22	
		//第1趟：(3)        2,3，  ,8，[17 ]  -一轮结束，找到一个最大值17
		//第2趟:(2)    2,3，  ,[8]
		//第3趟: (1)    2,【3】
		//j=nums.length-1-i
		
		//多少趟？1:0    2:1   3:2     n:n-1
		for(int i=0;i<nums.length-1;i++) {//多少趟
			for(int j=0;j<nums.length-1-i;j++) {//你是不是比我小，如果是，则交换
				if(nums[j]> nums[j+1]) {
					int temp = nums[j] ;
					nums[j] = nums[j+1] ;
					nums[j+1] = temp ;
				}
			}
		}
//		Arrays.sort(nums);  jdk内置排序
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
			
		}
	}
}
