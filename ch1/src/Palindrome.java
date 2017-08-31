public class Palindrome {
    public static void main(String[] args) {
        String input = "Tact Coa";
        if (checkPalindrome(input)) {
            System.out.println("This is a palindrome.");
        }
        else {
            System.out.println("This isn't a palindrome.");
        }
    }

    private static boolean checkPalindrome(String input) {
        int[] allChar = new int[128];
        char[] str = input.toLowerCase().toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (str[i] != ' ') {
                int rep = (int) str[i];
                allChar[rep] += 1;
            }
        }
        int oddCount = 0;
        for (int i = 0; i < 128; i++) {
            if (allChar[i] % 2 == 1) {
                oddCount++;
            }
        }
        if (oddCount > 1) {
            return false;
        }
        return true;
    }
}
