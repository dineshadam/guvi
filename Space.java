package tech;

import java.util.Scanner;

public class Space {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("enter the string");
		String str=read.nextLine();
			System.out.println(str.trim().replaceAll("\\s{2,}", " "));
  		
	}

}
