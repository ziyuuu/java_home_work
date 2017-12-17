import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int s=0;
        int d=0;
        while (num!=-1)
        {
            if (num%2==0)
            {
             d+=1;
            }else
            {
              s+=1;
            }
            num=in.nextInt();
        }
        System.out.println(s+" "+d);
    }
}
