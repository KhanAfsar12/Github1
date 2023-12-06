package Collection;

import java.util.TreeMap;
public class Navigable2 {
    public static void main(String[] args){
        TreeMap<String,String> set = new TreeMap<String,String>();
        set.put("C","Cat");
        set.put("A","Apple");
        set.put("B","Banana");
        set.put("D","Dog");
        set.put("G","Gun");
        System.out.println(set);
        System.out.println(set.ceilingKey("C"));
        System.out.println(set.higherKey("B"));
        System.out.println(set.floorKey("G"));
        System.out.println(set.lowerKey("D"));
        System.out.println(set.pollFirstEntry());
        System.out.println(set.pollLastEntry());
        System.out.println(set.descendingMap());
        System.out.println(set);
    }
}
