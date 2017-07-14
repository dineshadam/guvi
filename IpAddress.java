package tech;

import java.util.Scanner;

public class IpAddress {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the 11 digit number");
		String b=read.next();
		try {
		long a=Integer.parseInt(b);
		
		String ip=String.valueOf(a);

		if(ip.length()==11) {
				
			System.out.println(ip.substring(0,3)+"."+ip.substring(3,6)+"."+ip.substring(6,9)+"."+ip.substring(9,11));
			System.out.println("Ip address is valid");
		}
		else
			System.out.println("ip address is invalid");

		}
		catch(Exception e) {
				System.out.println("Enter the string in number");
		}
		}
		

}
