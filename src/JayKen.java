import java.util.*;
public class JayKen {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int player, computer, playerCount=0, computerCount=0;
        boolean game =true;
        computer=(int) (Math.random()*3)+1;
        System.out.println("WELCOME!");
        System.out.println("1-Scrissors, 2-Stone, 3-Bag");
        while(game)
        {
            System.out.println("Vui lòng nhập lựa chọn của bạn: ");
            player=sc.nextInt();
            if(player>3 || player < 0)
            {
                System.out.println("Nhập vào không đúng, vui lòng nhập lại!");
            }
            else
            {
                System.out.println("Máy chọn " + computer);
                if((player==1 && computer==3) || (player==2 && computer==1) || (player==3 && computer==2))
                {
                    System.out.println("Thắng!");
                    playerCount++;
                }
                else if(player==computer)
                {
                    System.out.println("Hòa lần này!");
                }
                else
                {
                    System.out.println("Thua!");
                    computerCount++;
                }
            }
            if(playerCount==3)
            {
                System.out.println("Bạn là người chiến thắng!");
                game=false;
            }
            else if(computerCount==3)
            {
                System.out.println("Máy là người chiến thắng!");
                game=false;
            }
        }
        sc.close();// Đóng Scanner để tránh rò rỉ tài nguyên
    }
}
