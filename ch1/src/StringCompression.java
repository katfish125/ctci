public class StringCompression {
    public static void main(String[] args) {
        String str = "abcde";
        System.out.println("The compressed string is \""+compress(str)+"\".");
    }

    private static String compress(String str) {
        int counter = 1;
        StringBuilder retStr = new StringBuilder();
        retStr.append(str.charAt(0));
        for (int i = 0; i < str.length()-1; i++) {
            char curr = str.charAt(i);
            char next = str.charAt(i+1);
            if (curr == next) {
                counter++;
                if (i == str.length()-2) {
                    retStr.append(counter);
                }
            }
            else {
                retStr.append(counter);
                retStr.append(next);
                counter = 1;
            }
        }
        String ret = retStr.toString();
        if (ret.length() < str.length()) {
            return ret;
        }
        else {
            return str;
        }
    }
}
