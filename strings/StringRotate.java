package strings;

public class StringRotate {
    public static void main(String[] args) {
        String str1="abcde";
        String str2="deabc";

        if(str1.length()!=str2.length())
        {
            System.out.println("Second String is not rotation of First String");
        }
        else
        {
            str1=str1.concat(str2);
            if(str1.contains(str2))
            {
                System.out.println("Second String is Rotation of First String");
            }
            else {
                System.out.println("Second String is not rotation of First String");
            }
        }
    }
}
