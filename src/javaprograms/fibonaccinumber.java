package javaprograms;

public class fibonaccinumber {

	public static void main(String[] args) {

		int a=0;int b=1; int s=0;

		for(int i=0;i<=3;i++)
		{
			s=a+b;
			a=b;
			b=s;
		}
		System.out.println(s);
		
		
	}

}
