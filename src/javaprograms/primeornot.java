package javaprograms;

public class primeornot {

	public static void main(String[] args) {

		
		int n=2;
		int c=0;
		
		if(n>1)
		{
			for(int i=1;i<=n;i++)
			{
				if(n%2==0)
				{
					c++;
				}
			}
			n=n/10;
			if(c==2)
			{
				System.out.println("prime");
			}
			else
			{
				System.out.println("not prime");
			}
			
		}
		else
		{
			System.out.println("not prime");
		}
		
		
		
	}

}
