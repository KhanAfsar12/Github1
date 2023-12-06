package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class DNSO {
    public static void main(String[] args){
        ArrayList l = new ArrayList();
        l.add("Z");
        l.add("A");
        l.add("K");
        l.add("N");
        l.add(new Integer(10));
        l.add(null);
         System.out.println(l);
        Collections.sort(l);
        System.out.println(l);
    }
}
