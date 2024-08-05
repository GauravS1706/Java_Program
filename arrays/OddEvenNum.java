package arrays;

import java.util.Arrays;

public class OddEvenNum {
    public static void main(String[] args) {


        int arr[]={12,21,14,22,17,2};
        System.out.println("Odd element");
        for (int i=0;i< arr.length;i++)
        {
            if(arr[i]%2 !=0)
                System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Even element");
        for (int i=0;i< arr.length;i++)
        {
            if(arr[i]%2 ==0)
                System.out.print(arr[i]+" ");
        }

    }
}
