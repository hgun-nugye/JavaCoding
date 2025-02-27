import java.util.*;

public class Array {
    public static void main(String[] args) {
        int[] arr= new int[20];
        double avg=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Nhập vào 20 phần tử của mảng: ");
        for(int i=0; i< arr.length; i++)
        {
            arr[i]=sc.nextInt();
            avg+=arr[i];
        }
        avg/=arr.length;

        System.out.println("Dãy vừa nhập là: ");
        for(int i: arr)
        {
            System.out.print(i +" ");
        }

        System.out.println("\nGiá trị trung bình của dãy là: " + avg);

        System.out.println("Các giá trị nhỏ hơn giá trị trung bình của dãy là: ");
        for(int i : arr)
        {
            if( i < avg) System.out.print(i+" ");
        }

        Arrays.sort((arr));
        System.out.println("\nDãy sau khi được sắp xếp tăng dần là: ");
        for(int i : arr)
        {
            System.out.print(i +" ");
        }
    }
}
