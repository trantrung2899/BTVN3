import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        int[] number = new int[2];
        int inputNumber;
        int s = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập vào phần tử trong mảng : ");
        for (int index = 0; index < 2; index++) {
            inputNumber = scanner.nextInt();
            s += inputNumber;
        }
        System.out.println("Tổng các phần tử trong mảng là : " + s);
    }
}
