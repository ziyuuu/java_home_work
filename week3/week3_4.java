import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] number =new int[6];
        int i=0 ;
        if (num<0)
        {
            System.out.print("fu ");
            num = -num;
        }
        if (num==0)
        {
            System.out.println("ling");
        }else{
            while(num!=0)
            {
            number[i] = num%10;
            num/=10;
            i++;
            }
            for (int j=i-1;j>=0;j--){
                switch (number[j])
                {
                    case 0:
                        System.out.print("ling");
                        break;
                    case 1:
                        System.out.print("yi");
                        break;
                    case 2:
                        System.out.print("er");
                        break;
                    case 3:
                        System.out.print("san");
                        break;
                    case 4:
                        System.out.print("si");
                        break;
                    case 5:
                        System.out.print("wu");
                        break;
                    case 6:
                        System.out.print("liu");
                        break;
                    case 7:
                        System.out.print("qi");
                        break;
                    case 8:
                        System.out.print("ba");
                        break;
                    case 9:
                        System.out.print("jiu");
                        break;
                }
                if (j!=0)
                {
                 System.out.print(" ");
                }
            }
        }
    }
}
