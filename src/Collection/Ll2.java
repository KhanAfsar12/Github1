package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Ll2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Afsar");
        list.add("Khan");
        list.add("Saki naka");
        System.out.println("First list of element is :"+list);
        list.add(1,"Oman");
        System.out.println(list);

        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Cat");
        ll.add("goat");
        System.out.println("Second list of element is:"+ll);
        ll.addAll(list);
        System.out.println("Combination of both list is:"+ll);

        LinkedList<String> t2 = new LinkedList<String>();
        t2.add("Andheri");
        t2.add("Ghatkopar");
        t2.add("Kurla");
        t2.add("Vikhroli");
        System.out.println("Third list of Element id:"+t2);
        ll.addAll(1,t2);
        System.out.println(ll);
        ll.addFirst("Abdullah");
        System.out.println(ll);
        ll.addLast("Shan");
        System.out.println(ll);
        ll.remove(3);
        System.out.println(ll);
        t2.removeAll(ll);
        System.out.println(t2);
        ll.removeFirst();
        System.out.println("Remove First element from list:"+ll);
        ll.addFirst("santacruza");
        System.out.println("finallist is hare"+ll);
    }
}
