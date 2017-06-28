package guvi;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=read.nextInt();
		int fact=1;
		if(num>=0){
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+num+" is "+fact);
	}else 
	{
		System.out.println("enter the positive number");
	}
}
}
