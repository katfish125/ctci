public class StringRotation {
    public static void main(String[] args) {
        // had to take a hint for this one :(
        String str_orig = "b4rotate";
        String str_aft = "4rotateb";

        if ((str_orig+str_orig).contains(str_aft)) {
            System.out.println("There was a rotation.");
        }
        else {
            System.out.println("No rotation.");
        }
    }
}
