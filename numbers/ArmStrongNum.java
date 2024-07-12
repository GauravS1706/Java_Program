package numbers;

import java.util.Scanner;

public class ArmStrongNum {
	public static boolean isArmStrong(int n) {
		int temp, digit = 0, last = 0, sum = 0;
		temp = n;
		while (temp > 0) {
			temp = temp / 10;
			digit++;
		}
		temp = n;
		while (temp > 0) {
			last = temp % 10;
			sum += (Math.pow(last, digit));
			temp /= 10;
		}
		if (n == sum) {
			return true;

		} else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check whether number is ArmStrong or not");
		int n = sc.nextInt();
		boolean ret=isArmStrong(n);
		System.out.println(ret?"is Armstrong":"not an armstrong ");
		int cnt=0;
		for (int i=0;i<n;i++)
		{
			if(isArmStrong(i)) {
				System.out.print(i + " ");

				cnt++;
			}
		}
		System.out.println();
		System.out.println("total armstong num is "+cnt);
	}
}
