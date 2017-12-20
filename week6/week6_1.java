import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s =in.nextLine();
        String[] x=s.split(" ");
        for (int i=0;i<x.length;i++){
            if (x[i].length()!=0) {
                char c=x[i].charAt(x[i].length()-1);
                if (c!='.')
                {
                System.out.print(x[i].length()+" ");
                }
                else
                {
                System.out.print(x[i].length()-1);
                }
            }
        }
    }
}
