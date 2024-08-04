package strings;

public class CapitalizeWord {
    public static void main(String[] args) {
        String input="gaurav rajesh shimpi";
        String result=capitalizeWord(input);
        System.out.println("input "+input);
        System.out.println("output "+result);

//        System.out.println(input.toUpperCase().substring(0,1).+input.substring(1,input.length()));
    }
    public static  String capitalizeWord(String str)
    {
        StringBuilder result= new StringBuilder(str.length());
        boolean capilatize= true;
        for (char c:str.toCharArray())
        {
            if(Character.isWhitespace(c))
            {
                capilatize=true;
            } else if (capilatize) {
                c=Character.toUpperCase(c);
                capilatize=false;
            }
            result.append(c);
        }
        return  result.toString();

    }
}
