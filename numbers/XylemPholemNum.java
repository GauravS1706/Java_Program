package numbers;

import java.util.Scanner;

public class XylemPholemNum {

    public static  boolean checkNum(int n)
    {
        int temp, mean_sum=0,extreme_sum=0;
          temp=n ;
          while (temp!=0)
        {
            if(n==temp||temp<10)
            {
                extreme_sum=extreme_sum+temp%10;
            }
            else {
                mean_sum=mean_sum+temp%10;
            }
            temp /=10;
        }
        if (extreme_sum== mean_sum)
        {
            return  true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        boolean ret=checkNum(n);
        System.out.println(ret?"Num is Xylem":"Num is Pholem");

        for (int i=0; i<n;i++)
        {
            if(checkNum(i))
            {
                System.out.print(i+" ");
            }
        }
    }

}
