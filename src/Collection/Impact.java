package Collection;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Impact {
    public static void main(String[] args) {
        SortedSet set = new TreeSet();
        set.add("Afsar");
        set.add("Khan");
        set.add("Ishtiyaque");
        set.add("Umar");
        System.out.println(set);
        Iterator itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next()); 
        }
    }
}
