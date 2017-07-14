package tech;

import java.util.Scanner;

public class Evenstr {

	public static void main(String[] args) {
			Scanner read=new Scanner(System.in);
			System.out.println("Enter the string");
			String str=read.next();
			String str1="";
			String str2="";
			String str3="";
			char[] ch=str.toCharArray();
			for(int i=0;i<str.length();i++)	{
				if(i%2==0)
				{
					str1+=String.valueOf(ch[i]);
				}
				else
				{
					str2+=String.valueOf(ch[i]);
				}
			}
			for(int i=0;i<str.length();i++) {
				
				if(i<str2.length()) {
					str3+=str2.charAt(i);
				}if(i<str1.length()) {
					str3+=str1.charAt(i);
					}
				}
System.out.println(str3);
			}
	}


