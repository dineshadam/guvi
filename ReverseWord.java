package string;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=read.nextLine();
		String str1[]=str.split(" ");
		for(int i=str1.length-1;i>=1;i--) {
			System.out.print(str1[i]+" ".toString());
			//System.out.print(str+" ");
		}
		System.out.print(str1[0]);
	}			

}
