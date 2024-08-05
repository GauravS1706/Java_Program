package arrays;

import java.util.Arrays;

public class RmvDupli {
    public static void main(String[] args) {
        int arr[] = {21, 2, 21, 14, 34, 54, 14};

        System.out.print("Before removing duplicate arrays ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        int[] uniqueArr = removeDuplicates(arr);
        System.out.println();
        System.out.print("After removing duplicates ");
        for (int i : uniqueArr) {
            System.out.print(i + " ");
        }
    }

    public static int[] removeDuplicates(int[] arr) {
        // Sort the array
        Arrays.sort(arr); //{2,14,14,21 21,34,54};

        // Initialize a variable to keep track of unique elements
        int j = 0;

        // Iterate through the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        // Return a copy of the array up to the index j
        return Arrays.copyOf(arr, j + 1);

    }
}
