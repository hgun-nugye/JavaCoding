
public class Test_ViDu {
    public static int valueEnter(String x) {
        int value = 0;
        for(int i = 0; i < x.length(); i++)
            value = value*10 + (x.charAt(i)- '0');
        return value;
    }

    public static void main(String[] args) {
        Console c = new Console();

        //Đảo ngược xâu
        String line = c.readLine();
        c.print("Xâu đảo ngược là: ");
        for(int i = line.length()-1; i >=0 ; i--)
            c.print(line.charAt(i));

        //Nhập vào xâu số nguyên và đổi thành số int

        c.print("\nNhập vào số nguyên bất kì: ");
        String soInt = c.readLine();

        int a=valueEnter(soInt);
        c.print("Giá trị số nguyên biểu diễn chuyển đổi từ dạng xâu là: " + a);
    }
}
