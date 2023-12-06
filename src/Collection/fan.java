package Collection;
import Basic.Inte;

import java.util.*;

class afsar{
    public static void main(String[] args){
        TreeSet s = new TreeSet(new MyComparator());
        s.add(10);
        s.add(0);
        s.add(15);
        s.add(5);
        s.add(20);
        s.add(20);
        System.out.println(s);
    }
}
class MyComparator implements Comparator{
    public int compare(Object obj1,Object obj2){
        Integer I1 = (Integer)obj1;
        Integer I2 = (Integer)obj2;
        if (I1<I2) {
            return +1;
        } else if (I1>I2) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
