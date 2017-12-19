import java.util.Scanner;

public class Main {
    public static boolean isWan(int i)
    {
        boolean isWan =false;
        int sum=0;
        for (int j=1;j<i;j++)
        {
            if (i%j==0)
            {
                sum+=j;
            }
            if (sum>i){
                break;
            }
        }
        if (i==sum)
        {
            isWan=true;
        }
        return isWan;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        boolean getwan = false;
        for (int i=n;i<=m;i++)
        {
            if (isWan(i)&&i!=1){
                if (!getwan)
                {
                    System.out.print(i);
                }else
                {
                    System.out.print(" "+i);
                }
                getwan=true;
            }
        }
        if (!getwan){
            System.out.print("NIL");
        }
    }
}
