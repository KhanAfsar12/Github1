package Collection.Sorting;


import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

class myComprator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;
        if(i1 < i2){
            return +1;
        } else if (i1 > i2) {
            return -1;
        }else {
            return 0;
        }
    }
}

public class ComparatorInterface{
    public static void main(String[] args) {

        TreeSet hs = new TreeSet(new myComprator());

        hs.add(2);
        hs.add(4); //2<4
        hs.add(5);
        hs.add(8);
        hs.add(0);
        hs.add(1); // 2>1
        hs.add(9);
        hs.add(76);
        hs.add(65);
        hs.add(67);
        hs.add(90);
        hs.add(89);
        hs.add(11);

        System.out.println(hs);

    }

}