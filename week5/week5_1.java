import java.util.Scanner;

public class Main {
    public static boolean isPrime(int i)
    {
        boolean isPrime = true;
        for(int j=2;j<i;j++)
        {
            if (i%j==0)
            {
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number=in.nextInt();
        if (isPrime(number))
        {
            System.out.println(number+"="+number);
        }
        else
        {
            System.out.print(number+"=");
            while (number!=1){
                for (int i=2;i<=number;i++){
                    if (!isPrime(i))
                    {
                        continue;
                    }
                    if (number%i==0){
                        number/=i;
                        if (number!=1){
                            System.out.print(i+"x");
                            break;
                        }else
                        {
                            System.out.print(i);
                            break;
                        }
                    }
                }
            }
        }
    }
}
