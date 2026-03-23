package javaprograms;

import java.util.Scanner;

public class countthewords {

	public static void main(String[] args) {


		
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		int c=1;
		
		for(int i=0;i<str.length()-1;i++)
		{
		if((str.charAt(i)==' ') && (str.charAt(i+1)!=' '))
			
		{
			c++;
		}
		
		}
		System.out.println(c);
		
		
	}

}
