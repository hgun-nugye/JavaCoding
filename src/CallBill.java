import java.util.*;

public class CallBill {
    public static void main(String[] args) {
        /*Viết chương trình tính tiền điện thoại:
Tiền thuê bao hàng tháng là 27000 đ.
Từ phút gọi thứ nhất đến phút thứ 200 giá cước là 120 đ/phút.
Từ phút gọi thứ 201 đến phút thứ 400 giá cước là 80 đ/phút.
Từ phút gọi 401 đến phút cuối giá cước là 40 đ/phút.
*/
        Scanner sc=new Scanner(System.in);

        int minCall;
        System.out.println("Nhập vào số phút gọi: ");
        do
        {
            minCall=sc.nextInt();
        } while(minCall<=0);

        int bill=27000;
        if(minCall<=200)
        {
            bill+=minCall*120;
        }
        else if(minCall<=400)
        {
            bill+=(minCall-200)*120 + minCall*80;
        }
        else
        {
            bill+=(minCall-200)*120 + (minCall-200)*80 +minCall*40;
        }

        System.out.println("Tổng tiền điện thoại la: " + bill);
        sc.close();// Đóng Scanner để tránh rò rỉ tài nguyên
    }
}
