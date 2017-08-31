import java.util.Arrays;

public class IsPermutation {
    public static void main(String[] args) {
        String str1 = "goddo";
        String str2 = "doggo";
        if (checkPerm(str1,str2)) {
            System.out.println("Strings \""+str1+"\" and \""+str2+"\" are permutations of each other.");
        }
        else {
            System.out.println("The strings are not permutations of each other.");
        }
    }

    private static boolean checkPerm(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
