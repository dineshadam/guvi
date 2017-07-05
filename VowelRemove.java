package guvi;

import java.util.Scanner;

public class VowelRemove {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=read.next();
		StringBuffer s=new StringBuffer(str);
		String str1=s.reverse().toString();
		String str2=str1.replaceAll("[aeiouAEIOU]" ,"");
		System.out.println(str2);
	}

}
