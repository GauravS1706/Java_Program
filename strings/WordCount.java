package strings;

import java.util.Scanner;

public class WordCount {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String s= sc.nextLine();
    s=s.trim();
    String[]word=s.split("\\s+");
    System.out.println("Number of word "+word.length);
    System.out.println(word[word.length-1].length());//return the length of last words
    int number = 20; // Example number

    // Array to store "Even" and "Odd"
    String[] result = {"Even", "Odd"};

    // Using bitwise AND to determine if the number is odd or even
    System.out.println(result[number & 1]);
}
}
