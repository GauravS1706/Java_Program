package numbers;

import java.util.Scanner;

public class PalindromeNum {
	public static void totalPalindrome(int n)
	{
		int cnt = 0;
		for (int i = 1; i <= n; i++) {
			int temp = i;
			int reversed = 0;
			while (temp > 0) {
				int rem = temp % 10;
				reversed = reversed * 10 + rem;
				temp /= 10;
			}
			if (reversed == i) {
				System.out.print(reversed+" ");
				cnt++;
			}

		}
		System.out.println();
		System.out.println("Total palindrome numbers from 1 to " + n + " is " + cnt);
	}

		public static boolean isPalindrome(int n)
		{
			int sum=0,temp,rem;
			temp=n;
			while (temp>0)
			{
				rem= temp%10;
				sum= sum*10+rem;
				temp /=10;
			}
			if (sum==n)
			{
				return true;
			}
			return false;

		}
		
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter String to check whether it is Palindrome or not");
			int n= sc.nextInt();
			boolean ret=isPalindrome(n);
			System.out.println(ret?"It palindrome":"not a palindrome");
			totalPalindrome(n);


		
		}

}
