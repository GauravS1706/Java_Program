package numbers;

import java.util.Scanner;

//(a+2^0.b)+(a+2^0.b+2^1.b)+....+(a+2^0.b+2^1.b+2^n-1.b)
public class Series {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=sc.nextInt();
            int b= sc.nextInt();
            int n=sc.nextInt();

            int x=1,y=0;
            y= y+a;
            for(int j=0;j<n;j++)
            {
                x=(int) Math.pow(2,j);
                y= y+(b*x);
                System.out.print(y+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
