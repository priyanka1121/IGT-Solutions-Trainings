public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        boolean check = checkPalindrome(str);
        
        System.out.println("String: " + str);
        System.out.println("Is Palindrome: " + check);
    }

    public static boolean checkPalindrome(String str) {
        int l = 0;
        int r = str.length() - 1;

        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                return false; 
            }
            l++;
            r--;
        }

        return true; 
    }
}
