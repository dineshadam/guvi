package guvi;

import java.util.Scanner;

public class Prymaid {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=read.nextInt();
		for(int i=0;i<num;i++)
			{ 
			for(int j=0;j<num-i;j++) 
				{ 
			System.out.print(" ");
				}
		for (int k=0;k<=i;k++) 
				{
			System.out.print("* "); 
				} 
		System.out.println();
		} 
	}
}

