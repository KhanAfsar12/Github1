package String;

public class Palindrome {
    public static void main(String[] args) {
        String s = "afsar";
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        if (rev.equals(s)) {
            System.out.println(rev + " is palindrome");
        } else {
            System.out.println(rev + " is not palindrome");
        }
    }
}