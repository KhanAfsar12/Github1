package Collection;

import java.util.Vector;

public class Victory {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<String>();
        System.out.println(vec.capacity());
        for (int i=1; i<=10; i++){
            vec.addElement("Afsar");
        }
        System.out.println(vec);
        vec.addElement("Khan");
        System.out.println(vec.remove(1));
    }
}
