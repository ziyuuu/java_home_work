import java.util.Scanner;


class Fraction{
    private int a;
    private int b;
    Fraction(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    int zhanzhuan(int a,int b) {
        int r;
        while (a%b!=0)
        {
            r=a%b;
            a=b;
            b=r;
        }
        return b;
    }
    double toDouble()
    {
        return (double)a/b;
    }
    Fraction plus(Fraction r)
    {
        int fenmu =this.b*r.b;
        int fenzi =this.a*r.b+this.b*r.a;
        int gongyueshu = zhanzhuan(fenmu,fenzi);
        fenmu/=gongyueshu;
        fenzi/=gongyueshu;
        Fraction plus = new Fraction(fenzi,fenmu);
        return plus;
    }
    Fraction multiply(Fraction r)
    {
        int fenmu = this.b*r.b;
        int fenzi = this.a*r.a;
        int gongyueshu=zhanzhuan(fenmu,fenzi);
        fenmu/=gongyueshu;
        fenzi/=gongyueshu;
        Fraction multiply = new Fraction(fenzi,fenmu);
        return multiply;
    }
    void print()
    {
        int gongyueshu=zhanzhuan(a,b);
        a/=gongyueshu;
        b/=gongyueshu;
        if (b==1)
        {
            System.out.println(a);
        }
        else if (a==b)
        {
            System.out.println(1);
        }
        else
        {
            System.out.println(a+"/"+b);
        }
    }
}
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Fraction a = new Fraction(in.nextInt(), in.nextInt());

        Fraction b = new Fraction(in.nextInt(),in.nextInt());

        a.print();

        b.print();

        a.plus(b).print();

        a.multiply(b).plus(new Fraction(5,6)).print();

        a.print();

        b.print();

        in.close();

    }



}

