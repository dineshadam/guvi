package guvi;

import java.util.Scanner;

class Dayss{
	
	//String day;
	boolean days(String day){
			if(day.equalsIgnoreCase("sunday")||day.equalsIgnoreCase("saturday")){
				return false;
			}
			else if(day.equalsIgnoreCase("monday")||day.equalsIgnoreCase("tuesday")||day.equalsIgnoreCase("wednesday")||day.equalsIgnoreCase("thursday")||day.equalsIgnoreCase("friday")){
				{
				return true;
			}
			}
			return false;
}
	}
public class Holiday {
			public static void main(String args[]){
				Dayss dayss=new Dayss();
				Scanner read=new Scanner(System.in);
				System.out.println("Enter the day");
				String day=read.next();
				System.out.println(dayss.days(day));
		}
	

}
