package guvi;

import java.util.Scanner;

public class RegisterNo {

	public static void main(String[] args) {
		Scanner read =new Scanner(System.in);
		System.out.println("Enter the total number of register number");
        int num=read.nextInt();
        Integer reg_no[]=new Integer[num];
        int temp;
        for(int i=0;i<num;i++)
        {
        	System.out.println("enter the "+(i+1)+" register number");
        	reg_no[i]=read.nextInt();
        }
        for(int i=0;i<num;i++)
        {
        	for(int j=i+1;j<num;j++)
        	{
        		if(reg_no[j]!=null)
        		if(reg_no[i]==reg_no[j])
        		{
        			reg_no[j]=null;
        			System.out.println("Repeated register no is: "+reg_no[i]);
        			break;
        		}
        	}
        }
	}

}
