package strings;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.nextLine();

		for (int i = s.length()-1 ; i >=0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		for (char letter = 'a'; letter <= 'z'; letter++) {
			System.out.print(letter + " ");
		}
		System.out.println();
		for (char letter = 'z'; letter >= 'a'; letter--) {
			System.out.print(letter + " ");
		}
	}
}
