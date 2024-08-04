package strings;

import java.util.Scanner;

public class Palindrome {
	public static boolean isPalindrome(String str)
	{
		str=str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

		int left=0;

		int right=str.length()-1;
		while(left<right)
		{
			if(str.charAt(left)!=str.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;
			
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String to check whether it is Palindrome or not");
		String s= sc.nextLine();
		System.out.println(isPalindrome(s));

		System.out.println("Enter Sentence to check whether it is Palindrome or not");
		String s1= sc.nextLine();
		String word[]=s1.split("\\s+");
		int cnt=0;
		for (String st:word) {
			if (isPalindrome(st)){
				System.out.print(st+" ");
				cnt++;
			}
		}
		System.out.println();
		System.out.println(cnt);

	String Str= "Madam";
	String str1="";
     for (int i=Str.length()-1;i>=0;i--)
	 {
		 str1 +=Str.charAt(i);
	 }
	 if(Str.equalsIgnoreCase(str1))
	 {
		 System.out.println("Its palindrome");
	 }


	}

}
