public class MaxOfThreeNumbers {
     public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 15;
        int max;

        if (num1 >= num2 && num1 >= num3) {
            max = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            max = num2;
        } else {
            max = num3;
        }

        System.out.println("The maximum is: " + max);
    }
}
