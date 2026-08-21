public class HalvesAreAlike {

    public static boolean halves(String s) {

        int half = s.length() / 2;

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < half; i++) {

            if (isVowel(s.charAt(i))) {
                count1++;
            }

            if (isVowel(s.charAt(i + half))) {
                count2++;
            }
        }

        return count1 == count2;
    }

    public static boolean isVowel(char ch) {

        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' ||
               ch == 'O' || ch == 'U';
    }

    public static void main(String[] args) {

        String s = "book";

        boolean result = halves(s);

        System.out.println(result);
    }
}