import java.util.Collection;
import java.util.Scanner;
import java.util.ArrayList;

public class Avg_Max_MinArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int input;
        while (true) {
            input = sc.nextInt();
            if (input == 0) {
                break;
            }
            arr.add(input); // Thêm số vào danh sách
        }

        System.out.println("Các phần tử đã nhập là " + arr);

        int max=0, min=0;
        for (int i : arr)
        {
            max=Math.max(max, i);
        }
        System.out.println("Giá trị lớn nhất của dãy là "+ max);
        for (int i : arr)
        {
            min=Math.min(min, i);
        }
        System.out.println("Giá trị lớn nhất của dãy là "+ min);
    }
}

