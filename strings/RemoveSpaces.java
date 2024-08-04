package strings;

public class RemoveSpaces {
    public static void main(String[] args) {
        String str= "Remove all the white spaces ";
        str=str.replaceAll("\\s+","");
        System.out.println(str);
    }
}
