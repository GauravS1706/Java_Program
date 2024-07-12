package numbers;

import java.util.Scanner;

public class NumReverse {
     public static int revNUm(int n)
     {
         int num=0;
         while(n>0)
         {
             int x=n%10;
             num= num*10+x;
             n /=10;
         }
         return num;
     }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to reverse it");
        int n= sc.nextInt();
        System.out.println("The reverse of num "+n+ " is "+ revNUm(n));
    }
}
