package arrays;

public class shift {
    public static void main(String[] args) {
        int arr[]={2,0,5,6,0,5,0,1,0};
        int temp=0;
        for (int i=0;i< arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]==0 &&  arr[i]<arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        for (int i:arr
             ) {
            System.out.print(i+" ");
        }
    }
}
