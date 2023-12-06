package Collection;
import java.util.*;
public class Arraylist12 {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
//        ar.add("Afsar");
//        ar.add("Khan");
        ar.add(102);
        System.out.println(ar.getClass().getName());
        System.out.println(ar.add( 2 ));
        System.out.println(ar);
        ar.clear();
        System.out.println(ar);
    }
}
