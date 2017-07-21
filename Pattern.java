package tech;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println(" enter the nummber");
		int num=read.nextInt();
	    for(int i=0;i<num;i++)
	    {
	    	for(int j=i+1;j<=num;j++)
	    	{
	    	System.out.print("*");
	    	}	System.out.print(" ");
	    	for(int j=i+1;j<=num;j++)
	    	{
	    	System.out.print("*");
	    	}	
	    	System.out.println();

	    }
	}

}
