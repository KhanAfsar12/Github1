package Basic;

import OOPS.Afsar;

import java.util.Arrays;

public class Afsar12 {
    /*public int id = 1;
    public static int id1 = 1;
*/


    public static  int [] afsar(){
        return new int[]{5,1,2,4,5,6};


    }
    public static void main(String[] args) {
/*
        Afsar12 s = new Afsar12();
        for (int i=0; i<2; i++){
            s.id += i;
            s.id1 += i;
        }
        System.out.println(s.id+" "+s.id1);
        Afsar12 s1 = new Afsar12();
        for (int i=0; i<2; i++){
            s1.id += i;
            s1.id1 += i;
        }
        System.out.println(s1.id+" "+s1.id1);


*/
        System.out.println();
     int []a=afsar();
        System.out.println(Arrays.toString(a));
    }
}
