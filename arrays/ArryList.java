package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArryList {
    public static void main(String[] args) {
        ArrayList <Integer> n= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number & type 0 to finish");
        while (true)
        {    int i= sc.nextInt();
            if(i==0)
                break;
            n.add(i);
        }
        Collections.reverse(n);
        Collections.sort(n);
        for (int i:n ) {
            System.out.print(i+" ");
        }

    }
}
