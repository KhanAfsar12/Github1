package String;

public class method {
    public static void main(String[] args) {
        String s = "Hello"+"World";

        System.out.println(s);

        StringBuffer sb = new StringBuffer(s);
        sb.append("Good").append("Morning");
        System.out.println(sb.toString());
        System.out.println(sb.length());

        sb.delete(0,5);
        System.out.println(sb.toString());
        System.out.println(sb.length());

        sb.insert(0,"hey");
        System.out.println(sb.toString());
        System.out.println(sb.length());

        sb.append("hey");
        sb.append("buddy");

        System.out.println(sb);




    }
}
