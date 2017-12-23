class Display
{
    private int value;
    private int limit;
    public Display(int limit)
    {
        this.limit=limit;
    }
    void makevalue(int value)
    {
        this.value=value;
    }
    void incress()
    {
        value+=1;
        if (value==limit)
        {
            value=0;
        }
    }
    int getvalue()
    {
        return value;
    }
}
class Clock
{
    private Display hour = new Display(24);
    private Display minute = new Display(60);
    private Display second = new Display(60);
    public Clock(int h,int m,int s)
    {
        hour.makevalue(h);
        minute.makevalue(m);
        second.makevalue(s);
    }
    public void tick()
    {
        second.incress();
        if (second.getvalue()==0)
        {
            minute.incress();
            if (minute.getvalue()==0)
            {
                hour.incress();
            }
        }
    }
    public String toString()
    {
        int h = hour.getvalue();
        int m = minute.getvalue();
        int s = second.getvalue();
        return String.format("%02d:%02d:%02d",h,m,s);
    }
}
public class Main {

    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);

        Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());

        clock.tick();

        System.out.println(clock);

        in.close();
    }
}
