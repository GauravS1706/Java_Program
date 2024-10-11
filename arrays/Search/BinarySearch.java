package arrays.Search;

public class BinarySearch {
    public static void binarySearch(int[]arr,int fisrt,int last,int key)
    {
        int mid=(fisrt+last)/2;
        while (fisrt<=last)
        {
            if(arr[mid]<key)
            {
                fisrt=mid+1;
            } else if (arr[mid]==key) {
                System.out.println("elenent found"+mid);
                break;
            }
            else {
                last=mid-1;

            }
            mid=(fisrt+last)/2;
        }
       
            System.out.println("element not found");
        
    }

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        int key=30;
        int last= arr.length-1;
        binarySearch(arr,0,last,key);
    }

}
