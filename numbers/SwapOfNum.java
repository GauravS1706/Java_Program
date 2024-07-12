package numbers;

import java.util.Scanner;

public class SwapOfNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1");
        int a=sc.nextInt();
        System.out.println("Enter num 2");
        int b=sc.nextInt();
        System.out.println("Before Swapping "+a+ " "+ b);
        int temp =a;
         a= b;
         b= temp;
        System.out.println("After Swapping "+ a+ " "+ b);

        System.out.println("before Swap without using 3rd variable"+a+" " +b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping "+ a+ " " +b);

        System.out.println("Before Swapping without using 3rd variable and + Operator"+a +" "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After Swapping "+a +" "+b);
    }
}
