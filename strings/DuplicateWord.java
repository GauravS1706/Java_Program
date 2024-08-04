package strings;

public class DuplicateWord {
    public static void main(String[] args) {

        String str="big black bug bit a big black dog";
        str=str.toLowerCase();
        int cnt;
        String words[]=str.split("\\s+");
        for (int i=0;i< words.length;i++) {
            cnt = 1;

            for (int j=i+1;j< words.length;j++)
            {
                if (words[i].equals(words[j]))
                {
                    cnt++;

                    words[j]="0";
                }
            }
            if(cnt>1 && words[i]!="0" )
            {
                System.out.println(words[i]);
            }
        }



    }



}
