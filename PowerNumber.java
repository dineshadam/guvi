package string;

import java.util.Scanner;

public class PowerNumber {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the nummber");
		int num=read.nextInt();
		if(num>9) {
		String str=String.valueOf(num);
		num=0;
		for(int i=0;i<str.length();i++) {	
		num+=(int) Math.pow(Integer.parseInt(String.valueOf(str.charAt(i))),Integer.parseInt(String.valueOf(str.charAt(str.length()-1))));	
	}
		System.out.println("Power of "+str+" is "+num);
		}
		else
		{
			System.out.println("Enter the number greater than 9");
		}
	}

}
