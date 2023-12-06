package Basic;

public class StaticmathodcallExample {
    public static void main(String[] arg){
        int a = 10;
        int b = 5;
        System.out.println(b);
        b=a++ + a++;
        System.out.println(a);
    }
}
