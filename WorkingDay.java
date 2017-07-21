package string;

import java.util.Scanner;

public class WorkingDay {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the day");
		String str=read.next();
		if(str.equalsIgnoreCase("mon")||str.equalsIgnoreCase("tue")||str.equalsIgnoreCase("wed")||str.equalsIgnoreCase("thus")||str.equalsIgnoreCase("fri")||str.equalsIgnoreCase("monday")||str.equalsIgnoreCase("tuesday")||str.equalsIgnoreCase("wednesday")||str.equalsIgnoreCase("thursday")||str.equalsIgnoreCase("friday"))
		{
			System.out.println(str+"=true");
		}
		else if(str.equalsIgnoreCase("sat")||str.equalsIgnoreCase("sun")||str.equalsIgnoreCase("sunday")||str.equalsIgnoreCase("saturday"))
		{
			System.out.println(str+"=false");

		}
		else {
			System.out.println("The day is not valid");
		}
			
	}

}
