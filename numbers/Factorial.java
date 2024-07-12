package numbers;

import java.util.Scanner;

public class Factorial {
    public void factorial(int n) {
        int fact = 1;

        // loop run from 1 to n
        for (int i = 1; i <= n; i++) {
            fact *= i;
            /*
             * eg n=5; i=1 fact =1*1 =1 ;i=2 fact= 2*1=2; i=3 fact 2*3=6;
             * i=4 fact = 6*4=24; i=5 fact =24*5=120; i=6 exit the loop
             */

        }
        System.out.println("The factorial of " + n + " is :" + fact);

    }

    // recursivly
    public int recFact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return (n * recFact(n - 1));
        // n=5 ; 5*4=20; 20*3=60; 60*2=120; 120*1=120;

    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check factorial ");
        int n = sc.nextInt();
        f.factorial(n);
        int fact = f.recFact(n);
        System.out.println("The factorial of num " + n + " is : " + fact);
    }

}
