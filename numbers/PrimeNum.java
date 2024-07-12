package numbers;

import java.util.*;

public class PrimeNum {


	public static void primtCount(int n)
	{
		int primeCnt=0;
		for (int i=2;i<=n;i++ ){
			boolean isPrime=true;
			for(int j=2;j*j<=i ;j++)
			{
				if(i%j==0)
				{
					isPrime=false;
					break;
				}
			}
			if (isPrime)
			{
				primeCnt++;
			}
		}
		System.out.println("Total number of Prime from to "+n+" is : "+primeCnt);
	}

public static boolean  primeNum(int n)
{int cnt=0;
	int flag=0;
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{cnt++;
			flag = 1;
			break;
		}
	}
	if (flag == 0)
	{
		return  true;
	}
	else
	{
		return false;
	}
}

public static void main(String[] args) {
//	PrimeNum pn= new PrimeNum();
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number");
	int n= sc.nextInt();
	boolean ret=primeNum(n);
	System.out.println(ret?"is prime":"not prime");


}
}
