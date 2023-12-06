package ExceptionHandling;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class AfsarException extends Exception{
   public AfsarException(String msg){
       super(msg);
    }
}
public class CustomException{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int Age =30;
        if (Age<18) {
            try {
                throw new AfsarException("Age should be greater than 18");
            } catch (AfsarException msg) {
                System.out.println("caught the exception");
                System.out.println(msg.getMessage());
            }
        }
        else {
            System.out.println("Eligible for voting");
        }
    }
}
