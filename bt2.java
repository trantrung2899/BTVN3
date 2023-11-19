import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        int[] number = new int[2];
        int inputNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập vào phần tử trong mảng : ");
        for (int index = 0; index < 2; index++) {
            inputNumber = scanner.nextInt();
            number[index] = inputNumber;
        }

        System.out.println("Phần tử trong mảng gồm : ");
        for (int index = 0; index < 2; index++) {
            System.out.println(number[index]);
        }
    }
}
