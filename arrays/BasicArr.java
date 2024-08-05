package arrays;

import java.util.Iterator;

public class BasicArr {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,6};
		for(int i=0; i<arr.length; i++)
		{
			System.out.print
			(arr[i]+" ");
		}
		System.out.println();
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}

}
