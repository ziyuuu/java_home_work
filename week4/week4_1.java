import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        int[] one =new int[101];
        int[] two= new int[101];
        boolean isfirst = true;
        do {
            a =in.nextInt();
            one[a]=in.nextInt();
        }while (a!=0);
        do {
            b =in.nextInt();
            two[b]=in.nextInt();
        }while (b!=0);
        for(int i=one.length-1;i>=0;i--)
        {
            if (one[i]+two[i]!=0)
            {
                if (!isfirst)
                {
                    if (one[i]+two[i]>0)
                    {
                        System.out.print("+");
                    }
                }
                if(i>1)
                {
                    if (one[i]+two[i]!=1)
                    {
                        System.out.print((one[i] + two[i]) + "x" + i);
                    }
                    else
                    {
                        System.out.print("x"+i);
                    }
                }
                else if (i==1)
                {
                    if (one[i]+two[i]!=1)
                    {
                        System.out.print((one[i]+two[i])+"x");
                    }
                    else
                    {
                        System.out.print("x");
                    }
                }
                else if (i==0)
                {
                    System.out.print(one[i]+two[i]);
                }
                isfirst = false;
            }
        }
        if (isfirst)
        {
         System.out.print(0);
        }
    }
}
