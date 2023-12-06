package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sim1 {
    public static void main(String[] args) {
        int a[] = {1,2,3,7,5,6,4};
        Arrays.sort(a);

        for (int i=0; i<a.length; i++){
            if (a[i]==1){
            System.out.println(a[i]);
        }
            else if (a[i]==3){
                System.out.println(a[i]);
            } else if (a[i]==5) {
                System.out.println(a[i]);
            }
            else if (a[i]==7){
                System.out.println(a[i]);
            }

        }
    }
}
