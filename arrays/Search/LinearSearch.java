package arrays.Search;

public class LinearSearch {
    public static int linearSearch(int []arr,int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={10,20,40,30,50,60};
        int key=80;

        System.out.println(key+ "is found at index "+linearSearch(arr,key));
    }
}
