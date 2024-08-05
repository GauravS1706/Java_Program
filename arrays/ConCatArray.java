package arrays;

import java.util.Scanner;

public class ConCatArray {
    public static int []getConCatArr(int[] num)
    {
        int n= num.length;
        int [] ans= new int  [2*n];
        for (int i=0;i<n;i++)
        {
            ans[i]=num[i];
            ans[i+n]=num[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n= sc.nextInt();
        int num[]= new int[n];
        for(int i=0;i<n;i++)
        {
            num[i]=sc.nextInt();
        }
        int ans[]=getConCatArr(num);
        for (int i :
             ans) {
            System.out.print(i+" ");
        }
    }


}
