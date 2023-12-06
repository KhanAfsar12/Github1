package ExceptionHandling;

import java.util.Scanner;
public class YoungerAgeException extends RuntimeException{
    YoungerAgeException(String msg){
        super(msg);
    }
}
class voting{
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
        System.out.println("Enter your age; ");
        int age = s.nextInt();
        try {
            if (age < 18) {
                throw new YoungerAgeException("You are not eligible to voting");
            } else {
                System.out.println("You can vote successfully");
            }
        }
            catch(YoungerAgeException e){
                e.printStackTrace();
            }
            System.out.println("Hello");
    }
}
