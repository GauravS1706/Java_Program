package arrays;

import java.util.Arrays;

public class SumOfArrays {
    public static void main(String[] args) {
        int arr[]={12,21,15,5,32,17};
        int s=0;
        for (int i=0;i< arr.length;i++)
        {
            s +=arr[i];
        }
        System.out.println("The sum of array is "+s);

        int x=Arrays.stream(arr).sum();
        System.out.println(x);
    }
}
