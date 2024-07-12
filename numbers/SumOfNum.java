package numbers;

import java.util.Scanner;

public class SumOfNum {
    public static int numSum(int n)
    {
          int sum=0;

          while(n>0)
          {
            int x=n%10;
            sum +=x;
            n /=10;
          }
          return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println("The sum of "+n+" is : "+numSum(n));
    }

    
}
