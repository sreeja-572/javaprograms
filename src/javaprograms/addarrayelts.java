package javaprograms;

public class addarrayelts {

	public static void main(String[] args) {


		int a[]= {1,2,3,4};
		int s=0;
//		for(int i=0;i<4;i++)
//		{
//			s=s+a[i];
//		}
		//System.out.println(s);
		//using enhanced forloop
		
		for(int b:a) {
			s=s+b;
			
		}
		System.out.println(s);
		
		
		
		
		
		
		
	}

}
