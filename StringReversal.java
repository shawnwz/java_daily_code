public class StringReversal {

    private static void reverse(String word) {
        if (word.length() == 0) {
            return;
        }
        reverse(word.substring(1));
        System.out.print(word.charAt(0));
    }

    public static void main(String[] args) {
        reverse("abcdefghijklmn");
    }
    
}
