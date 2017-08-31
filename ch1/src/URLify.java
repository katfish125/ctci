public class URLify {
    public static void main(String[] args) {
        String input = "Taco cat reversed is taco cat.          ";
        String output = toURL(input, 30);
        System.out.println(output);
    }

    private static String toURL(String input, int trueLen) {
         char[] arr = input.toCharArray();
         int count = arr.length - trueLen;
         for (int i = trueLen-1; i>=0; i--) {
             if (arr[i] == ' ') {
                 arr[i+count] = '0';
                 arr[i+count-1] = '2';
                 arr[i+count-2] = '%';
                 count -= 2;
             }
             else {
                 arr[i+count] = arr[i];
             }
         }
         return new String(arr);
    }
}
