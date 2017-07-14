package tech;

import java.io.IOException;
import java.util.Scanner;

public class IpAddress {

	public static void main(String[] args) throws IOException {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the Ip in 11 digit number");
		String ip=read.next();
		try {
			if(ip.length()==11) {
		int num=Integer.parseInt(ip.substring(0, 6));
		int num1=Integer.parseInt(ip.substring(5, 11));
		if(num>=0&&num1>=0)
		{ 
		
			System.out.println(ip.substring(0,3)+"."+ip.substring(3,6)+"."+ip.substring(6,9)+"."+ip.substring(9,11));
			System.out.println("Ip address is valid");
		}
			}
		else {
			System.out.println("ip address length is less");
		}
		}
		
		catch(Exception e) {
			System.out.println("Enter the ip in number");
		}
	}

}
