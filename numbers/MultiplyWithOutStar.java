package numbers;

import java.util.Iterator;

public class MultiplyWithOutStar {
//	without using * Operator

	
	public static void main(String[] args) {
		int n=10;
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=n;j++)
//			{
//				System.out.print(multiply(i,j)+" ");
//			}
//			System.out.println();
//		} print table without * Operator
		
		int a=5;
		int b=4;
		int result=numMultiply(a, b);
		System.out.println(result);
		System.out.println(multiply(a,b));

	}

public static int multiply(int a, int b) {
	int result=0;
	 for (int i=0; i<b;i++) {
//		 i=1 r=0+5, i=2 r=5+5, i=3 r=10+5; ,i=4 r=15+5 =20, i=5 exit the loop
		 result +=a;
	}
	 return result;
}

public static int numMultiply(int a, int b)
{
	if(b==0)
	{
		return 0;
	}
	return a+numMultiply(a, b-1);
	
}
}
