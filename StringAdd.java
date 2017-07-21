package tech;

import java.util.Scanner;

public class StringAdd {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the number");
		String str=read.next();
		System.out.println(str);
		int sum=0;
		for(int i=str.length();i>0;i--)
		{
			for(int j=0;j<i;j++) {
				
				sum+=Integer.parseInt(String.valueOf((str.charAt(j))));
			}
			
		}
		System.out.println("sum="+sum);


	}

}
