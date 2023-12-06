package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListCursor {
    public static void main(String[] args) {
        LinkedList al = new LinkedList();
        al.add("Afsar");
        al.add("Khan");
        al.add("Abrar");
        al.add("Anees");
        System.out.println(al);
        ListIterator ltr = al.listIterator();
        while (ltr.hasNext()){
            String s = (String)ltr.next();
            if (s.equals("Khan")){
                ltr.remove();
            }
            else if (s.equals("Anees")){
                ltr.add("Imran");
            }
            else if (s.equals("Abrar")) {
                ltr.set("ibrahim");
            }
        }
        System.out.println(al);
    }
}
