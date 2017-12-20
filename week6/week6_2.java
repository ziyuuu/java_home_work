import java.util.Scanner;

public class Main {
    public static boolean notEnd(String s)
    {
        if (s.contentEquals("END"))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public static boolean makec(String s)
    {
        int result=0;
        int where=-1;
        for (int i=1;i<s.length();i++)
        {
            if (s.charAt(i)=='*')
            {
                where=i+1;
                break;
            }
            result^=s.charAt(i);
        }
        result=result%65536;
        if (where!=-1)
        {
            int result2 = Integer.parseInt(s.substring(where), 16);
            if (result2==result)
            {
                return true;
            }
            else
            {
                return false;
            }
            }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time =new String();
        boolean notEnd=true;
        do {
            String s = in.nextLine();
            String[] words = s.split(",");
            notEnd=notEnd(s);
            if (words[0].contentEquals("$GPRMC")&&words[2].contentEquals("A"))
            {
                if (makec(s))
                {
                   time = words[1];
                }
            }
        }while (notEnd);
        boolean ishour=true;
        for (int i=0;i<6;i+=2)
        {
            int c =Integer.parseInt(time.substring(i,i+2));
            if (!ishour)
            {
                System.out.print(":");
            }
            if (ishour)
            {
                ishour=false;
                if (c>16)
                {
                    c=c-16;
                }
                else
                {
                    c=c+8;
                }
            }
            if (c<10){
                System.out.print("0"+c);
            }
            else
            {
                System.out.print(c);
            }
        }
    }
}
