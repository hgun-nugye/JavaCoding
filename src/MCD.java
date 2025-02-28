public class MCD {
    public static int mcd(int x, int y)
    {
        while(y!=0)
        {
            int temp=y;
            y=x%y;
            x=temp;
        }
        return x;
    }
    public static void main(String[] args)
    {
        Console c = new Console();
        int a,b;
        do
        {
            c.print("type in the first number (>0): ");
            a = c.readInt();
        } while(a<=0);

        do
        {
            c.print("type in the second number (>0): ");
            b = c.readInt();
        } while(b<=0);

        c.println("the maximal common divider is "+ mcd(a,b));
    }
}
