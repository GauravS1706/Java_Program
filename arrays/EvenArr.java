package arrays;

public class EvenArr {
    public static void main(String[] args) {

        int [] arr={12,4,43,5,65,21,15,2,23,45,24};
        for (int i=1;i< arr.length;i+=2)
        {
            System.out.println(arr[i]);
        }
    }
}
