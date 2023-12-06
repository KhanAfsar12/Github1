package Collection;

import java.util.*;
//
//public class Hashs {
//    public static void main(String[] args) {
//        HashSet set = new HashSet();
//        set.add("Afsar");
//        set.add("Khan");
//        set.add("Sahil");
//        set.add(null);
//        System.out.println(set);
//        System.out.println(set.contains("Khan"));
//        Iterator itr = set.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }
//
//        sahil s = new sahil();
//        s.display();
//
//        sahil1 s1 = new sahil1();
//        s1.dis();
//
//        Num1<String> num = new Num1<String>() ;
//        num.s="3";
//        num.a="3";
//        Num n = new Num();
//        n.disp(num);
//
//        Num1<String> num2 = new Num1<String>();
//        num2.s="sahil";
//        num2.a="jamal";
//        n.disp(num2);
//    }
//}

class Hashs{
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);

        Recursion r = new Recursion();
        r.dis();

        Spliterator spr = hashSet.spliterator();
       // while (spr.hasCharacteristics())
        System.out.println(hashSet);
    }

}
 class Recursion{
 public void dis(){
     int i = 0;
     System.out.println(i);
     i++;
     if(i == 10){
        // break;
     }
     dis();
 }

}
