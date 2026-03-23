package javaprograms;

import java.util.Scanner;

public class palindromestring {

	public static void main(String[] args) {


		System.out.println("enter a string:");

		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
		
		
		
		
		String a=str;
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=
					rev+str.charAt(i);
		}
		System.out.println(rev);

		if(a.equals(rev))
		{
			System.out.println("entered string is palindrome");
		}
		else
		{
			System.out.println("entered string is not a palindrome");
		}
		
	}

}
