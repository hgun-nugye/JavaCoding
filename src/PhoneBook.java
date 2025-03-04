import java.util.*;

public class PhoneBook {
    public static String[] names;
    public static int[] nums;
    public static int next;
    static int max;

    PhoneBook() {
        names = new String[1000];
        nums = new int[1000];
        next = 0;
        max = 1000;
    }

    PhoneBook(int n) {
        names = new String[n];
        nums = new int[n];
        next = 0;
        max = n;
    }

    public static void addPhone(String name, int num) {
        if (next < max) {
            names[next] = name;
            nums[next] = num;
            next++;
        } else System.out.println("Phone book is full!");

    }

    public static boolean searchPhone(String name) {
        int i = 0;
        while (i < next) {
            if (names[i] != null && names[i].equals(name)) {
                return true;
            }
            i++;
        }
        return false;
    }

    public static boolean searchPhone(int num) {
        int i = 0;
        while (i < next) {
            if (nums[i] != 0 && nums[i] == num) {
                return true;
            }
            i++;
        }
        return false;
    }

    public static int findIndex(String name) {
        for (int i = 0; i < next; i++) {
            if (names[i] != null && names[i].equals(name)) {
                return i; // Trả về chỉ số nếu tìm thấy
            }
        }
        return -1; // Trả về -1 nếu không tìm thấy
    }

    public static int findIndex(int num) {
        for (int i = 0; i < next; i++) {
            if (nums[i] != 0 && nums[i] == num) {
                return i; // Trả về chỉ số nếu tìm thấy
            }
        }
        return -1; // Trả về -1 nếu không tìm thấy
    }

    public static void changeNumPhone(String name, int num) {
        int index = findIndex(name);
        if (index!=-1) {
            nums[index] = num;
        } else System.out.println("Not found!");
    }

    public static void changeNamePhone(String name, int num) {
        int index = findIndex(num);
        if (index!=-1) {
            names[index] = name;
        } else System.out.println("Not found!");
    }

    public static void deletePhone(String name) {
        int index = findIndex(name);
        if (index!=-1 && next < max) {
            for (int i = index; i < next - 1; i++) {
                names[i] = names[i + 1];
                nums[i] = nums[i + 1];
            }
            next--;
            names[next] = null;
            System.out.println("Deleted " + name);
        } else System.out.println("Not found!");
    }
    public static void showPhone(String name)
    {
        int index = findIndex(name);
        if (index!=-1) {
            System.out.printf("Name: %s\tNum: %d\n",names[index], nums[index]);
        }
        else System.out.println("Not found!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int num;
        int next = 0;
        int click = -1;

        PhoneBook phoneBook = new PhoneBook();
        System.out.println("click 1 to add a new phone\nclick 2 to delete a phone\nclick 3 to " +
                "change a num phone\nclick4 to change a name phone\nclick 5 to show " +
                "phone\nclick 0 to end");
        while (click != 0) {
            System.out.println("Enter the click: ");
            click = sc.nextInt();
            switch (click) {
                case (1): {
                    System.out.println("Enter the num phone: ");
                    num = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the name phone: ");
                    name = sc.nextLine();
                    phoneBook.addPhone(name, num);
                    break;
                }
                case (2): {
                    System.out.println("Enter the name phone to delete: ");
                    sc.nextLine();
                    name = sc.nextLine();
                    phoneBook.deletePhone(name);
                    break;
                }
                case (3): {
                    System.out.println("Enter the num phone wan to change the name: ");
                    num = sc.nextInt();
                    sc.nextLine();
                    if (searchPhone(num)) {
                        System.out.println("Enter the new name: ");
                        name = sc.nextLine();
                        phoneBook.changeNamePhone(name, num);
                    } else System.out.println("Not found");
                    break;
                }
                case (4): {
                    System.out.println("Enter the name phone wan to change the num: ");
                    name = sc.nextLine();
                    if (searchPhone(name)) {
                        System.out.println("Enter the new num: ");
                        num = sc.nextInt();
                        phoneBook.changeNumPhone(name, num);
                    } else System.out.println("Not found");
                    break;
                }
                case 5: {
                    System.out.println("Enter the name to show: ");
                    sc.nextLine();
                    name = sc.nextLine();
                    phoneBook.showPhone(name);
                    break;
                }
                case (0): {
                    System.out.println("End!");
                    break;
                }
                default: {
                    System.out.println("Error!");
                }
            }
        }
    }
}


