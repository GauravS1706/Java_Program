package strings;

import java.util.Scanner;

public class SubSet {
    public static void possibleSubSet(String str)
    {
        int len=str.length();
        int temp=0;
        String arr[] = new String[len*(len+1)/2];
        for (int i=0;i<len;i++)
        {
            for (int j=i;j<len;j++)
            {
                arr[temp]=str.substring(i,j+1);
                temp++;
            }

        }
        System.out.println("All possible subset are :");
        for (String s:arr)
        {
            System.out.print(s+" ");
        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter  a Sting");
        String str= sc.nextLine();
        possibleSubSet(str);
    }
}
