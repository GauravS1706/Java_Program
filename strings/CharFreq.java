package strings;

public class CharFreq {
    public static void main(String[] args) {
        String str="picture perfect";
        int freq[]=new int[str.length()];
        int i,j;

        char[] ch=str.toCharArray();
        for (i=0;i<ch.length;i++)
        {
            freq[i]=1;
            for (j=i+1;j<ch.length;j++)
            {
                if(ch[i]==ch[j] )
                {
                    freq[i]++;
                    ch[j]='0';
                }
            }
        }
        for ( i=0;i< freq.length;i++)
        {
            if(ch[i]!='0' && ch[i]!=' ')
                System.out.println(ch[i]+" "+freq[i]);
        }
    }
}
