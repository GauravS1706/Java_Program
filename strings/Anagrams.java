package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static boolean isAnagram(String s1, String s2)
    {
        s1.toLowerCase();
        s2.toLowerCase();
        if(s1.length()!=s2.length())
        {
            return  false;

        }
        else {
            char str1[] = s1.toCharArray();
            char str2[] = s2.toCharArray();

            Arrays.sort(str1);
            Arrays.sort(str2);
            for (char c:str1) {
                System.out.print(c+" ");
            }
            System.out.println();
            for (char c:str2) {
                System.out.print(c+" ");
            }
            System.out.println();

            return  Arrays.equals(str1, str2);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String 1");
        String s1=sc.nextLine();
        System.out.println("Enter String 2");
        String s2=sc.nextLine();
        boolean ret=isAnagram(s1,s2);
        System.out.println((ret)?"Anagram":"Not Anagram");
        }
    }

