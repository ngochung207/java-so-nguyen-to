import java.util.Scanner;

public class kiem_tra_so_nguyen_to {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập vào số cần kiểm tra: ");
//        int x = sc.nextInt();
        int count = 0;
        int x = 0;
        while (count <= 20) {
            boolean check = false;
            if (x < 2) {
                check = false;
            } else {
                int i = 2;
                check = true;
                while (i < Math.sqrt(x)) {
                    if (x % i == 0) {
                        check = false;
                        break;
                    }
                    i++;
                }
            }
//            if (check)
//                System.out.println(x + " la so nguyen to");
//            else
//                System.out.println(x + " khong la so nguyen to");
            if (check) {
                System.out.println(x);
                count++;
            }
            x++;
        }
    }
}
