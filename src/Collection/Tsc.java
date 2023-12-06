package Collection;

import java.util.*;
import java.util.function.ToIntFunction;

public class Tsc{
    public static void main(String[] args) {
        TreeSet s = new TreeSet();
        s.add(8);
        s.add(6);
        s.add(11);
        TreeSet a = new TreeSet();
        s.add(11);
        s.add(15);
        s.add(16);

        Iterator itr = s.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        Set<String> sa = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.trim().compareTo(s2.trim());
            }
        });

        sa.add("1");
        sa.add(" 1");
        sa.add("2 ");
        sa.add("2");
        sa.add(" 2 ");

        Arrays.toString(sa.toArray());

    }
}