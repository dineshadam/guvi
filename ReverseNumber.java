package guvi;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the digit");
		long num=read.nextInt();
		if(num>=0){
		String str=String.valueOf(num);
		StringBuffer str1=new StringBuffer(str);
		long num1=Integer.parseInt(str1.reverse().toString());
		System.out.println("Revers digit: "+num1);
	}
		else
		{
			System.out.println("Enter the positive digit");
		}
	}
}
