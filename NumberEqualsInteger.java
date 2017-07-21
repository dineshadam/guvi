package guvi;

import java.util.Scanner;

public class NumberEqualsInteger {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the array size");
		int a=read.nextInt();
		System.out.println("Enter the array");
		int[] arr=new int[a];
		for(int i=0;i<a;i++) {
			 arr[i]=read.nextInt();
			if(i==arr[i]) {
				System.out.println("The number "+arr[i]+" is equals its index"+i);
			}
		}
	}

}
