package strings;

import java.util.Scanner;

public class UpperLower {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A String");
        String s=sc.nextLine();
        StringBuffer s1=new StringBuffer(s);
        for (int i=0;i<s.length();i++)
        {
            if(Character.isLowerCase(s.charAt(i)))
            {
                s1.setCharAt(i,Character.toUpperCase(s.charAt(i)));
            }
            else if(Character.isUpperCase(s.charAt(i))) {
                s1.setCharAt(i,Character.toLowerCase(s.charAt(i)));
            }
        }
        System.out.println("String after Conversion " + s1);

    }

}
