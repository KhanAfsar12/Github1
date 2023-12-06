package String;

public class Immutable {
    public static void main(String[] args) {
        String s = new String("Afsar");
        s = s.concat("Java");
        System.out.println(s);
         s.concat("Python");
        System.out.println(s);
    }
}
