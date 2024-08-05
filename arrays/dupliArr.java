package arrays;

import java.util.Arrays;

public class dupliArr {
public static void main(String[] args) {
	int arr[]= {0,1,1,2,3,4,5,3,2};
	System.out.println("print duplicate arr");
	for(int i=0;i<arr.length;i++) {
//		System.out.print(arr[i]+" ");
		
		for (int j=i+1;j<arr.length;j++) {
			
			if(arr[i]==arr[j])
			{
				System.out.print(arr[j]+" ");
			}
					}
		System.out.print("");
	}
	System.out.println();
	Arrays.sort(arr);
	for(int i:arr)
	{
		System.out.print(i);
	}

}
}
