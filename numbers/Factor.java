package numbers;

public class Factor {
    // The 
    public static void  factor(int n)
    {
        for (int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                    System.out.print(i + " ");

            }
        }

    }

    public static void main(String[] args) {
//        Factor f=new Factor();
        factor(60);

    }
    
}
