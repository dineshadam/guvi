package guvi;
import java.util.Scanner;
public class Least {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		String str=read.next();
		int least=99;
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length()-1;j++)
			{
				int temp=Integer.parseInt(String.valueOf(str.charAt(j))+String.valueOf(str.charAt(j+1)));
				if(temp<least)
				{
					least=temp;
				}
			}
		}
		System.out.println(least);
				}
			}