package numbers;

import java.util.Scanner;

public class Fibonacci {

//	recursively
	static int fib(int n)
    {
        // Base Case
        if (n <= 1)
            return n;

        // Recursive call
        return fib(n - 1) + fib(n - 2);
    }

	static void fibo(int n) {
		int n1 = 0, n2 = 1;
		for (int i = 0; i < n; i++) {
			System.out.print(n1 + " ");
			int n3 = n2 + n1;
			n1 = n2;
			n2 = n3;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		fibo(n);
		System.out.println();
		System.out.println("Enter a number");
		int x = sc.nextInt();
		for (int i = 0; i < x; i++) {

            System.out.print(fib(i) + " ");
        }


	}
}
