package numbers;

import java.util.Scanner;

public class CountNum {
    // Count length of the number
    public static int count(int n) {
        int cnt = 0;
        while (n > 0) {
            n /= 10; // eg n= 521 ; 521/10 =52 cnt =1; 52/10=5 cnt=2 ; 5/10 =0 cnt=3; exit the loop
            cnt++;
        }
        return cnt;
    }

    // count lenght of even num
    public static int evenCnt(int n) {
        int cnt = 0;
        while (n > 0) {
            int x = n % 10;
            if (x % 2 == 0) 
            {
                cnt++;
            }
            n /= 10;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println("the total number in the " + n + " is :" + count(n));
        System.out.println("the total even number in the " + n + " is :" + evenCnt(n));
    }
}
