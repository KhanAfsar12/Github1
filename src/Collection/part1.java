package Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class part1 {

    public static void main(String[] args) {
        ArrayList a = new ArrayList();

        boolean add = a.add("sahil");
        boolean addAll = Collections.addAll(a,"jamal","ahmad","siddique"); // this is how before we use addall method
//        a.addAll(2,null); it return null pointException
        System.out.println(add);
        System.out.println(addAll);

        System.out.println(a);

        Iterator itr = a.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


        ArrayList b = new ArrayList();
        b.add("Mohammad");


        boolean addAll1 = b.addAll(a); // this is how new collection framework uses addall

        System.out.println(addAll1);
        System.out.println(b);

        boolean remove = b.remove("sahil");
        System.out.println(remove);
        System.out.println(b);

        boolean removeAll = b.removeAll(a);
        System.out.println(removeAll);
        System.out.println(b);


    }

}
