import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int cnt = 0;
        int result = 0;
        int num = 2;
        while (cnt <m) {
            boolean isPrime =true;
            for(int i=2;i<num;i++)
            {
                if (num%i==0)
                {
                  isPrime=false;
                  break;
                }
            }
            if (isPrime)
            {
                cnt+=1;
            }
            if (isPrime&&cnt>=n){
                result+=num;
            }
            num+=1;
        }
        System.out.println(result);
    }
}
