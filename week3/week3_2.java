import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int result=0;
        int cnt=1;
        while(num!=0)
        {
        int t=num%10;
        if (t%2==cnt%2)
        {
            result+=Math.pow(2,cnt-1);
        }
        num/=10;
        cnt+=1;
        };
        System.out.println(result);
    }
}
