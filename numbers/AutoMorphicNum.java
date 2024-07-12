package numbers;

import java.util.Scanner;

public class AutoMorphicNum {
    public static boolean isAutomorphic(int n)
    {
        int sq=n*n;
        while(n>0) {
            if (n % 10 != sq % 10) {
                return false;
            }
            sq /=10;
            n/=10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        boolean ret=isAutomorphic(n);
        System.out.println(ret?"It Automorphic":"Not Automorphic");
        int cnt=0;
        for(int i=1;i<=n;i++)
        {
            if(isAutomorphic(i))
            {
                System.out.print(i+" ");
                cnt++;
            }

        }
        System.out.println();
        System.out.println(cnt);
    }
}
