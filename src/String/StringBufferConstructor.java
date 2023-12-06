package String;

public class StringBufferConstructor {
    public static void main(String[] args) {
        StringBuffer sbc = new StringBuffer();
        System.out.println(sbc.capacity());
        sbc.append("Hello");
        System.out.println(sbc.capacity());
        sbc.append("World");
        System.out.println(sbc.capacity());
        sbc.append("Afsar");
        System.out.println(sbc.capacity());
        sbc.append("Khan");
        System.out.println(sbc.capacity());
        sbc.append("Hussain");
        System.out.println(sbc.capacity());
        sbc.append("world wrestling entertainment");
        System.out.println(sbc.capacity());
    }
}
