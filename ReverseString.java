public class ReverseString {
    public static void main(String[] args) {
        String str = "priyanka";
        String reversedString = reverseString(str);
        
        System.out.println("Reversed: " + reversedString);
    }

    public static String reverseString(String str) {
        char[] ch = str.toCharArray();
        int l = 0;
        int r = ch.length - 1;

        while (l < r) {
            // Swap ch
            char temp = ch[l];
            ch[l] = ch[r];
            ch[r] = temp;

           
            l++;
            r--;
        }

        return new String(ch);
    }
}
