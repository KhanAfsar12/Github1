//Write a prograam to insert String & StringBuffer object into TreeSet where sorting order increasing length
//length order.If two bjects having same length then consider they Alphabetical order.


package Collection;

import java.util.*;

public class man {
    public static void main(String[] args){
        TreeSet s = new TreeSet(new Conductor());
        s.add("A");
        s.add(new StringBuffer("ABC"));
        s.add(new StringBuffer("AA"));
        s.add("XX");
        s.add("ABCD");
        s.add("A");
        System.out.println(s);
    }
}

class Conductor implements Comparator {
    public int compare(Object obj1, Object obj2) {
        String s1 = obj1.toString();
        String s2 = obj2.toString();
        int l1 = s1.length();
        int l2 = s2.length();
        if (l1 < l2) {
            return -1;
        } else if (l1 > l2) {
            return +1;
        } else {
            return 0;
        }
    }
}