import java.util.Scanner;

public class MinOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] num = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }

        int min = num[0];

        for (int i = 1; i < n; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }

        System.out.println("The minimum value is: " + min);

        scanner.close();
    }
}
