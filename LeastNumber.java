package guvi;

import java.util.*;

public class LeastNumber {

	public static void main(String[] args) {
		Scanner read =new Scanner(System.in);
		System.out.println("Enter the array size");
		int a=read.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++)
		{
			arr[i]=read.nextInt();
		}
		System.out.println("How many digits you want to delete");
		int b=read.nextInt();
		Arrays.sort(arr);
		for(int i=0;i<a-b;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}

}
