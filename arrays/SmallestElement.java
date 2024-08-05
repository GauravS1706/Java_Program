package arrays;

import java.util.Arrays;

public class SmallestElement {
    public static void main(String[] args) {
        int[] arr={11,32,23,4,5,21};
        int min= arr[0];
        for (int i=0;i< arr.length;i++)
        {
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println(min);

        int x= Arrays.stream(arr).min().getAsInt();
        System.out.println(x);
    }
}
