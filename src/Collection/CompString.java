package Collection;
import java.util.*;
 public class CompString {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new yComparator());
        t.add("Afsar");
        t.add("Ishtiyaque");
        t.add("Zahid");
        t.add("Ismail");
        System.out.println(t);
    }
}
class yComparator implements Comparator{
     public int compare(Object obj1,Object obj2){
      String s1 = obj1.toString();
     String s2 = (String)obj2;
     return s2.compareTo(s1);

}
 }
