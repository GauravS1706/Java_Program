package strings;

import java.util.Locale;
import java.util.Scanner;

public class Vowels {

    public static void countVowels(String str)
    {
        str=str.toLowerCase();
        int vCount=0,cCount=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
            { vCount++;}
            else {
                cCount++;
            }
        }
        System.out.println("Num of Vowels are "+vCount);
        System.out.println("Num of Consonants are "+cCount);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String str=sc.nextLine();
        countVowels(str);
    }


}
