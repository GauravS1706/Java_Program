package strings;

import java.util.Scanner;

public class PrintString {
	public static void first3(String s) {
//		System.out.println(s.substring(0, 3));
		if (s.length() >= 3) {
	        String firstThreeChars = s.substring(0,3);
	        System.out.println("First three characters: " + firstThreeChars);
	    } else {
	        System.out.println("The string is too short to get the first three characters.");
	    }
	}

public static void last3(String s)
{
	if (s.length() >= 3) {
        String lastThreeChars = s.substring(s.length() - 3);
        System.out.println("Last three characters: " + lastThreeChars);
    } else {
        System.out.println("The string is too short to get the last three characters.");
    }
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.nextLine();
		first3(s);
		last3(s);
	}
}
