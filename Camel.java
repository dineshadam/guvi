package guvi;

import java.util.Scanner;

public class Camel {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("enter the String: ");

		String str=read.nextLine();
		//StringBuffer sb=new StringBuffer(str);
		String []str1=str.split(" ");
		for(String k:str1){
			System.out.print(Character.toUpperCase(k.charAt(0))+(k.substring(1,k.length())));
		}
		
	}
}

	
