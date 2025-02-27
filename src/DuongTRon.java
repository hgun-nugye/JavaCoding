import java.util.Scanner;

public class DuongTRon {
    public static void main(String[] args) {
        System.out.println("Nhap vao ban kinh duong tron: ");
        double r = new Scanner(System.in).nextFloat();
        double chuVi, dienTich;
        chuVi=2*r*Math.PI;
        dienTich=Math.PI*Math.pow(r,2);
        System.out.println("Chu vi cua duong tron la "+ chuVi);
        System.out.println("Dien tich cua duong tron la "+ dienTich);
    }
}
