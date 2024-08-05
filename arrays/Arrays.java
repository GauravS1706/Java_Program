package arrays;



public class Arrays {

    public static void main(String[] args) {
        int arr1[] = new int[5];
        arr1[0] = 2;
        arr1[1] = 5;
        arr1[2] = 7;
        arr1[3] = 8;
        arr1[4] = 12;
        int[] arr2 = {5, 43, 11, 52, 12};
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
        }
        System.out.println();
        for (int i : arr2) {
            System.out.print(i + " ");
        }

    }

}
