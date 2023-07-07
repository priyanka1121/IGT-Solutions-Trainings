public class MaxOfTwoNumbers {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int max;

        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }

        System.out.println("The maximum of two number : " + max);
    }
}
