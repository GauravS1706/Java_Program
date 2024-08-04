package strings;

import java.util.Scanner;

public class DivideString {
    protected static void divideStr(String str,int n)
    {
        int len=str.length();
        int temp=0 , chars=len/n;
        String[]equalStr=new String[n];
        if(len%n !=0){
            System.out.println("String cannot divide in equal part");
        }
        else {
            for (int i=0;i<len;i+=chars)
            {
                String part=str.substring(i,i+chars);
                equalStr[temp]=part;
                temp++;
            }
            System.out.println(n+" equal parts of given String");
            for (String i:equalStr
                 ) {
                System.out.println(i);
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String");
        String str=sc.nextLine();
        System.out.println("Enter num to divide string in n part");
        int n=sc.nextInt();
        divideStr(str,n);
    }
}
