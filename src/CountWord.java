import java.util.Scanner;

public class CountWord {
    /* Viết một phương thức để đếm số từ của một xâu
    (từ là một tậphợp các ký tự không chứa khoảng trắng).
    Đọc vào 10 xâu từ bàn phímvà đếm xem có bao nhiêu từ trong 10  xâu đó.
     */
    public static int countWord(String sen)
    {
        int count=0;

        //nếu câu rỗng thì trả về 0
        if(sen.isEmpty())
        {
            return 0;
        }
        else
        {
            //loại bỏ khoảng trắng ở đầu và cuối chuỗi
            sen=sen.trim();

            // Thay thế nhiều khoảng trắng thành một khoảng trắng
            sen = sen.replaceAll("\\s+", " ");

            // Kiểm tra xem câu có kết thúc bằng dấu '.' không
            if (sen.endsWith("."))
            {
                sen = sen.substring(0, sen.length() - 1); // Xóa dấu '.' trước khi đếm
            }

            System.out.println(sen);

            for(int i=0; i<sen.length(); i++)
            {
                if(sen.charAt(i)==' ' && sen.charAt(i-1)!=' ')
                {
                    count++;
                }
            }

            // Đếm từ cuối cùng nếu chuỗi không kết thúc bằng khoảng trắng
            if (sen.length() > 0 && sen.charAt(sen.length() - 1) != ' ') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào câu để đếm từ (dấu '.' thể hiện kết thúc câu): ");
        for(int i=0; i<10; i++)
        {
            System.out.println("Câu thứ " + (i+1));
            String sen = sc.nextLine();
            int count= countWord(sen);
            System.out.printf("Số từ của câu thứ %d là %d.\n", i+1, count);
        }
        sc.close();// Đóng Scanner để tránh rò rỉ tài nguyên
    }
}
