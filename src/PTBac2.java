import java.util.Scanner;

public class PTBac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter the value of a, b, c: ");
        a = Integer.parseInt(sc.nextLine());
        b = Integer.parseInt(sc.nextLine());
        c = Integer.parseInt(sc.nextLine());

        if (a == 0)
        {
            if(b==0)
            {
                if(c==0)
                {
                    System.out.println("Phương trình vô số nghiệm");
                }
                else
                    System.out.println("Phương trình vô nghiệm");
            }
            else
            {
                System.out.println("Phương trình có nghiệm duy nhất: " + (float)-c/b);
            }
        }
        else
        {
            float delta=b*b - 4*a*c;
            float x1, x2;
            if(delta > 0)
            {
                System.out.println("Phương trình có 2 nghiệm phân biệt: ");
                x1=(float)(-b-Math.sqrt(delta))/(2*a);
                x2=(float)(-b+Math.sqrt(delta))/(2*a);
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
            else if(delta == 0)
            {
                System.out.println("Phương trình có nghiệm kép: ");
                x1=x2=(float)(-b)/(2*a);
                System.out.print("x1 = x2 = "+ x1);
            }
            else
                System.out.println("Phương trình vô nghiệm.");
        }
    }
}
