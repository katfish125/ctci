public class OneAway {
    public static void main(String[] args) {
        String str1 = "pale";
        String str2 = "palm";
        if (str1.equals(str2)) {
            System.out.println("The strings are the same.");
        }
        else {
            if (checkOneAway(str1, str2)) {
                System.out.println("One away.");
            }
            else {
                System.out.println("More than one away.");
            }
        }
    }

    private static boolean checkOneAway(String str1, String str2) {
        if (str1.length() == str2.length()-1) {
            return checkIns(str1, str2);
        }
        else if (str1.length() == str2.length()) {
            return checkRep(str1, str2);
        }
        else if (str1.length() == str2.length()+1) {
            return checkIns(str2, str1);
        }
        else {
            return false;
        }
    }

    private static boolean checkIns(String str1, String str2) {
        boolean skipped = false;
        for (int i = 0; i < str1.length(); i++) {
            if (!skipped) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    skipped = true;
                    i--;
                }
            }
            else {
                if (str1.charAt(i) != str2.charAt(i+1)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkRep(String str1, String str2) {
        boolean skipped = false;
        for (int i = 0; i < str1.length(); i++) {
            if (!skipped) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    skipped = true;
                }
            }
            else {
                if (str1.charAt(i) != str2.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }

}
