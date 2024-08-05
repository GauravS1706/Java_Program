package arrays;

public class CpyArr {
public static void main(String[] args) {
	int arr1[]= {1,2,3,4,5,6,7};
	int arr2[]=new int[arr1.length];
	for(int i=0;i<arr1.length;i++)
	{
		arr2[i]=arr1[i];
	}
	System.out.println("Oringal array");
	for(int i:arr1) {
		System.err.print(i+" ");
	}
	System.out.println("");
	System.out.println("Copy array");
	for(int n:arr2) {
		System.out.print(n+" ");
	}
}
}
