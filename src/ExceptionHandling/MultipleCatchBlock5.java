package ExceptionHandling;

import java.io.IOException;

public class MultipleCatchBlock5 {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[5] = 30 / 0;
        } catch (ArrayIndexOutOfBoundsException a) {System.out.println("ArithmeticException");}
        catch (Exception A) {System.out.println("ArrayIndexOutOfBoundException");}
        catch(Throwable N) {System.out.println("NullPointerExceptin");}
        System.out.println("rest of the code");
    }
}

