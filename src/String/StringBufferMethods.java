package String;

public class StringBufferMethods {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Barisha");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.append("Baghdad"));
        System.out.println(sb.charAt(0));
        System.out.println(sb.deleteCharAt(8));
        System.out.println(sb.delete(8,9));
        System.out.println(sb.length());
        System.out.println(sb.indexOf("B"));
        System.out.println(sb.lastIndexOf("B"));
        System.out.println(sb.lastIndexOf("a"));
        System.out.println(sb.append("Alexander the great"));
        System.out.println(sb.insert(1,"Delhi"));
        System.out.println(sb.replace(0,10,"Mumbai"));
        System.out.println(sb.reverse());
        System.out.println(sb.reverse());
        System.out.println(sb.substring(0,10));
        System.out.println(sb.toString());
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());
        sb.setCharAt(3,'f');
        System.out.println(sb);
        sb.setLength(5);
        System.out.println(sb);
        sb.ensureCapacity(100);
        sb.append("java");
        sb.trimToSize();
        System.out.println(sb.capacity());
        System.out.println(sb.reverse());
        System.out.println(sb.toString());
    }
}
