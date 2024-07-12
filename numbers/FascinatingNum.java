package numbers;

import java.util.Scanner;

public class FascinatingNum {
    public static boolean isFascinating(int n) {
        int temp = n, cnt = 0 ,fcnt=0;
        while (temp>0){
            temp = temp / 10;
            cnt++;
        }
        if(n <3){
            return false;
        }
        else {
            int n1 = n * 2;
            int n2 = n * 3;
            String s = n + "" + n1 + n2;
            boolean found = true;
            for (char c = '1'; c <= '9'; c++) {
                int count = 0;
                for (int i = 0; i < s.length(); i++) {
                    char ch = s.charAt(i);
                    if (ch == c)
                        count++;
                }
                if (count > 1 || count == 0) {
                    found = false;
                    break;
                }
            }
            if (found)
                return true;
            else
                return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        boolean ret=isFascinating(n);
        System.out.println(ret?"Num is Fascinating":"Num is Not Fascinating");

        int cnt=0;
        for(int i=1;i<=n;i++)
        {
            if(isFascinating(i))
            {
                System.out.print(i+" ");
                cnt++;
            }
        }
        System.out.println();
        System.out.println(cnt);

    }




}
