package arrays;

import java.util.Arrays;

public class SplitArray {
    public static void main(String[] args) {
        int[] arr={ 12,2,21,34,54,12,65};
        int mid= (arr.length)/2;
        int[] split1= Arrays.copyOfRange(arr,0, mid);
        int [] split2=Arrays.copyOfRange(arr,mid,arr.length);

        System.out.print(" Original array ");
        for (int i:arr
             ) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("1st half array ");
        for (int i:split1
             ) {
            System.out.print(i+" ");

        }
        System.out.println();
        System.out.print("2nd half array ");
        for (int i:split2
             ) {
            System.out.print(i+" ");
        }
    }
}
