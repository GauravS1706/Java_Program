package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortDescArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter element of array ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("Array before sorting");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("--------------------------");

        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Arrays after sorting");
        for (int i :
                arr) {
            System.out.print(i + " ");
        }
        
//        Arrays.stream(arr).sorted().forEach(System.out::println);
//
//        Arrays.sort(arr);
//        for(int i:arr)
//        {
//        	System.out.println(i);
//        }
    }
}
