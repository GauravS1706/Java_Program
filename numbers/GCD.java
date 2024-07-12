package numbers;

import java.util.Scanner;

public class GCD {
    public static int gcd(int a, int b) {
        int gd = 0;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                gd = i;
        }
        return gd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1");
        int a = sc.nextInt();
        System.out.println("Enter num 2");
        int b = sc.nextInt();
        System.out.println("The Greatest Common Divisor of " + a + " " + b + " is " + gcd(a, b));

    }
}
