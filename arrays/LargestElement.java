package arrays;

import java.util.Arrays;
import java.util.OptionalInt;

public class LargestElement {
    public static void main(String[] args) {
        int [] arr={11,23,34,56,67,3,32};
        int max=arr[0];
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println(max);
        int x=Arrays.stream(arr).max().getAsInt();
        System.out.println(x);
    }
}
