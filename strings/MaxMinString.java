package strings;

public class MaxMinString {
    public static void main(String[] args) {
        String str="Grass is greener";
        str =  str.toLowerCase();
        int [] freq= new int[str.length()];
        char minChar=str.charAt(0),maxChar=str.charAt(0);
        int i,j ,max ,min;

        char[] ch=str.toCharArray();
        for (i=0; i < ch.length;i++)
        {
            freq[i]=1;
            for(j=i+1;j<ch.length;j++)
            {
                if(ch[i]==ch[j] && ch[i]!=' '&&ch[j]!='0')
                {
                    freq[i]++;

                    ch[j]='0';
                }
            }
        }
        min = max = freq[0];
        for(i = 0; i <freq.length; i++) {

            if(min > freq[i] && freq[i] != '0') {
                min = freq[i];
                minChar = ch[i];
            }

            if(max < freq[i]) {
                max = freq[i];
                maxChar = ch[i];
            }
        }
        System.out.println("Minimum occuring char : "+minChar);
        System.out.println("Maximum occuring char : "+maxChar);
    }

}
