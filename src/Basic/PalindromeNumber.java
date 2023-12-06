package Basic;

public class PalindromeNumber {
    public static void main(String[] args) {
        int no = 121;
        int temp = no;
        int rev = 0;
        int rem;
        while (temp!=0){
            rem = temp%10;      // 1      2        1
            rev = rev*10+rem;   // 1      12       121
            temp = temp/10;    //  12     1        0
        }
        if (no==rev){
            System.out.println(no + " is Palindrome number");
        }
        else {
            System.out.println(no+ " is not a palindrome number");
        }
    }
}
