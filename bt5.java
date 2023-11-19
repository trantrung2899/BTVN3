import java.util.Scanner;

public class bt5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;

        System.out.print("Nhập một số: ");
        a = scanner.nextInt();

        while (a <= 10) {
            System.out.print("Nhập lại số lớn hơn 10: ");
            a = scanner.nextInt();
        }

        System.out.println("Số bạn vừa nhập là " +a + " và lớn hơn 10.");
        scanner.close();
    }
}
