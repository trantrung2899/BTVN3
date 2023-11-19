public class bt1 {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 8, 6};

        // Vòng lặp for
        System.out.println("Sử dụng vòng lặp for:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Vòng lặp while
        System.out.println("\nSử dụng vòng lặp while:");
        int j = 0;
        while (j < numbers.length) {
            System.out.println(numbers[j]);
            j++;
        }

        //  Vòng lặp do-while
        System.out.println("\nSử dụng vòng lặp do-while:");
        int k = 0;
        do {
            System.out.println(numbers[k]);
            k++;
        } while (k < numbers.length);
    }
}
