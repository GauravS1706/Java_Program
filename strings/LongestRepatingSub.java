package strings;

import java.util.Scanner;

public class LongestRepatingSub {
   public static String lcp(String s,String t)
   {
       int n=Math.min(s.length(),t.length());
       {
           for(int i=0; i<n;i++)
           {
               if(s.charAt(i)!=t.charAt(i))
                   return s.substring(0,i);
           }
       }
       return s.substring(0,n);
   }
   public static String longestString(String str)
   {
       int len=str.length();
       System.out.println(len);
       String lrs="";
       for (int i=0;i<len;i++)
       {
           for (int j=i+1;j<len;j++)
           {
               String x= lcp(str.substring(i,len),str.substring(j,len));
               if(x.length()>lrs.length())
                   lrs=x;
           }
       }
       return lrs;
   }



    public static void main(String[] args) {
        Scanner sc=    new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        System.out.println("the longestest "+longestString(s));

    }
}
