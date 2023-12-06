package Collection;

import java.util.Stack;

public class Spark {
    public static void main(String[] args) {
        Stack s = new Stack<>();
        s.push("Afsar");
        s.push("Sakinaka");
        s.push("Andheri");
        System.out.println(s);
        System.out.println(s.search("Afsar"));
        System.out.println(s.search("Aman"));
    }
}
