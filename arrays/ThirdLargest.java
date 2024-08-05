package arrays;

public class ThirdLargest
{
    public static int getThridLargeEle(int a[],int total)
    {
        int temp;
        for(int i=0;i<a.length;i++)
        {
            for (int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a[total-3];
    }

    public static void main(String[] args) {
        int arr[]={1,4,5,3,6,2};
        System.out.println("Third largest num is "+getThridLargeEle(arr,6));
    }
}
