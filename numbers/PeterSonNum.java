package numbers;

import java.util.Scanner;

public class PeterSonNum {
    public static int factorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact = fact*i;
        }
        return  fact;
    }
    public static boolean isPeterSon(int n)
    {
        int temp,sum=0;
        temp=n;
        while (temp>0)
        {
            int rem=temp%10;
            sum= sum+factorial(rem);
            temp /=10;
        }
        if(sum==n)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Num");
        int n=sc.nextInt();
        boolean ret=isPeterSon(n);
        System.out.println(ret?"It PeterSon Num":"Not PeterSum Num");

        int cnt=0;
        for(int i=0;i<n;i++)
        {
            if(isPeterSon(i))
            {
                System.out.print(i+" ");
                cnt++;
            }
        }
        System.out.println();
        System.out.println(cnt);
    }
}
