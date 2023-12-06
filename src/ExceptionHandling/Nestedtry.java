package ExceptionHandling;

public class Nestedtry {
    public static void main(String[] args) {
        try{
            try {
                System.out.println("AKI");
            }
            catch (ArithmeticException e){
                System.out.println(e);
            }
            try {
                int a[] = new int[5];
                a[3] = (4);
            }
            catch (ArrayIndexOutOfBoundsException a){
                System.out.println(a);
            }
            System.out.println("Other Statement");
        }
        catch (Exception E){
            System.out.println("My name is AFSAR");
        }
        System.out.println("normal flow");
    }
}
