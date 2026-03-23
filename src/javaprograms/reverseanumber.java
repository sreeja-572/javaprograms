package javaprograms;

import java.util.Scanner;

public class reverseanumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		
		
		//int rev=0;
		//using while loop
		/*
		 * while(num!=0) { rev=rev*10+num%10;
		 * 
		 * num=num/10; }
		 */
		
		
		
		//using string buffer class
		
		
		
		/*
		 * StringBuffer rev1;
		 * 
		 * StringBuffer sb=new StringBuffer(String.valueOf(num)); rev1=sb.reverse();
		 */
		
		//using stringbuilder class
		
		StringBuilder sb=new StringBuilder();
		sb.append(num);
		StringBuilder rev=sb.reverse();
		
		System.out.println("reverse of a number:"+rev);
		
		
	}

}
