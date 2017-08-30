public class IsUnique {
    public static void main(String[] args) {
        String str1 = "abcdefg";
        boolean res = checkUnique(str1);
        if (res) {
            System.out.println("The string's characters are unique.");
        }
        else {
            System.out.println("The string's characters are not unique.");
        }
    }

    private static boolean checkUnique(String str) {
        boolean[] charArray = new boolean[128];

        for (int i = 0; i < str.length(); i++) {
            int chara = (int) str.charAt(i);
            if (charArray[chara]) {
                return false;
            }
            else {
                charArray[chara] = true;
            }
        }

        return true;
    }
}
