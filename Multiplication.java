package guvi;

import java.util.Scanner;

public class Multiplication {
		 public static void main(String []args) {
			 Scanner read =new Scanner(System.in);
			 System.out.println("Enter the str1 number");
			 String str1=read.next();
			 System.out.println("Enter the str2 number");
			String  str2=read.next();
			long str3=Integer.parseInt(str1)*Integer.parseInt(str2);
			    String str4=String.valueOf(str3);
			    System.out.println(str4);
	}

}
