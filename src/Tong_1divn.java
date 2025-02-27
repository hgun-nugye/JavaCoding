import java.util.*;

public class Tong_1divn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        do
        {
            System.out.println("Nhập vào số lượng phần tử từ 5 đến 10: ");
            n=sc.nextInt();
        } while(n<5 || n>10);

        double sum=0;
        for(int i=1; i<=n; i++)
        {
            sum+=1/(double) i;
        }

        System.out.println("Tong cac gia tri 1/n vua nhap la: " + sum);
    }
}
