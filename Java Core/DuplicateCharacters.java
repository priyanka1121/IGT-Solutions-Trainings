public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "xyzxxxyw";
        int[] charCount = new int[256]; 

        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCount[c]++;
        }

        
        System.out.println("Duplicate characters :");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) i);
            }
        }
    }
}
