package guvi;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) 
	{
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=read.next();
		StringBuffer str1=new StringBuffer(str);
		System.out.println("Reversed String "+str1.reverse().toString());
	}

}
