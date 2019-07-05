import java.util.Scanner;

public class kiemTraSoNguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so : ");
        long so = scanner.nextLong();
        if (kiemtrasonguyento(so)) {
            System.out.println(so + " ko phai so nguyen to");
        } else {
            System.out.println(so + " la so nguyen to");
        }

    }

    public static boolean kiemtrasonguyento(long so) {
        for (long i = 2; i < so; i++) {
            if (so % i == 0) {
                return true;
            }
        }
        return false;
    }
}