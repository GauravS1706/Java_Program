package strings;

public class TotalChar {
    public static void main(String[] args) {
        String s1="The world Best person";
        int cnt=0;
        for(int i=0;i<s1.length();i++)
        {
            if (s1.charAt(i)!=' ')
                cnt++;


        }
        System.out.println("Total num of char are : "+cnt);

//        cnt of 2 String
        String s2="The world Best person ";
        String s3="who knows java";
        StringBuilder s4= new StringBuilder(s2+s3);
        int count=0;
        for(int i=0;i<s4.length();i++)
        {
            if (s4.charAt(i)!=' ')
                count++;
        }
        System.out.println("Total num of char are : "+count);
//        int count1=1;
//        for (int i=0;i<s4.length();i++)
//        {
//            System.out.println(s4.charAt(i)+" "+count1);
//            count1++;
//        }
    }
}
