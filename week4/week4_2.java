import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pix=in.nextInt();
        int[][] jin =new int[pix][pix];
        for (int i=0;i<jin.length;i++)
        {
            for(int j=0;j<jin[i].length;j++)
            {
                jin[i][j]=in.nextInt();
            }
        }
        //读入井字棋数据
        int X=0;
        int O=0;
        for (int i=0;i<jin.length;i++)
        {
            int sum=0;
            for(int j=0;j<jin[i].length;j++)
            {
                sum+=jin[i][j];
            }
            if (sum==pix)
            {
                X+=1;
            }
            else if (sum==0)
            {
                O+=1;
            }
        }
        for (int i=0;i<jin.length;i++)
        {
            int sum=0;
            for(int j=0;j<jin[i].length;j++)
            {
                sum+=jin[j][i];
            }
            if (sum==pix)
            {
                X+=1;
            }
            else if (sum==0)
            {
                O+=1;
            }
        }
        int xie=0;
        for (int i=0;i<jin.length;i++)
        {
            xie+=jin[i][i];
        }
        if (xie==pix)
        {
            X+=1;
        }
        else if (xie==0)
        {
            O+=1;
        }
        int fanxie=0;
        for (int i=0;i<jin.length;i++)
        {
            fanxie+=jin[i][pix-i-1];
        }
        if (fanxie==pix)
        {
            X+=1;
        }
        else if (fanxie==0)
        {
            O+=1;
        }
        if (X>O)
        {
            System.out.println("X");
        }else if (X<O)
        {
            System.out.println("O");
        }
        else if (X==O)
        {
            System.out.println("NIL");
        }
    }
}
