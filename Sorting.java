package tech;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the Array size");
		int a=read.nextInt();
		System.out.println("Enter the Array element");
		int arr[]=new int[a];
		for(int i=0;i<a;i++)
		{
			arr[i]=read.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<a/2;i++) {
			if(a%2==0) {
		System.out.println(arr[arr.length-1-i]);
		System.out.println(arr[i]);
			}
			else  {
				System.out.println(arr[arr.length-1-i]);
			System.out.println(arr[i]);	
			}
		}
		if(a%2!=0)
			System.out.println(arr[a/2]);
		read.close();
	}
	

}
