public class CharacterCount {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            count++;
        }

        System.out.println("Total number of characters: " + count);
    }
}
