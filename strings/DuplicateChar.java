package strings;

public class DuplicateChar {
    public static void main(String[] args) {
        String str1="Great Responsiblity";
        str1=str1.toLowerCase();
        char ch[]=str1.toCharArray();
        int cnt;
        for(int i=0;i<ch.length;i++)
        {
            cnt=1;
            for (int j=i+1;j<ch.length;j++)
            {
                if(ch[i]==ch[j] && ch[i]!=' ')
                {
                    cnt++;
                    ch[j]=0;
                }

            }
            if(cnt>1 && ch[i]!='0')

                System.out.println(ch[i]);

        }
    }
}
