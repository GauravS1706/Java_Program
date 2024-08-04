package strings;

import java.util.Scanner;

public class LengthOfString {
public static void main(String[] args) {
	String s="Hello";
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter String to Check its length");
	String s1=sc.nextLine();
	
	int length=s.length();
	System.out.println("The length of String "+s+ " is "+length);
    length=s1.length();
    System.out.println("The length of String "+s1+ " is "+length);
}
}
