package Collection;
import java.util.HashMap;
import java.util.Map;

public class Hmap1 {
    public static void main(String[] args) {
        HashMap <Integer,String> m = new HashMap();
        m.put(1000,"Afsar");
        m.put(2000,"Riyaz");
        m.put(4000,"ishtiyaq");
        m.put(1000,"Af");
        System.out.println(m.containsKey(1000));
        System.out.println(m.containsValue("aman"));
        System.out.println(m.get(2000));
        System.out.println(m.size());
        System.out.println(m);
        System.out.println(m.isEmpty());
        System.out.println(m);
        m.put(null,"roll");
        System.out.println(m);

        for (Map.Entry a:m.entrySet()){
            System.out.println(a.getKey()+" -> "+a.getValue());
        }
//        Set set = m.entrySet();
//        System.out.println(set);
//          Iterator itr = set.iterator();
//           while (itr.hasNext()){
//          //     System.out.println(itr.next());
//               Map.Entry entry = (Map.Entry)itr.next();
//               System.out.println(entry.getKey()+" --> "+ entry.getValue());
//           }
    }
}
