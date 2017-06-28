package guvi;

import java.util.Scanner;

public class StringToInt {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=read.next();
		int num=Integer.parseInt(str);
		System.out.println("Integer: "+num);

	}

}
