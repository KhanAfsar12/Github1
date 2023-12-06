package Test;

import org.jetbrains.annotations.NotNull;

public class Arrayprg {
    public static void main(String  [] args) {
        int[] arr = {3,5,6,9,8,7,2,3};
        int a;
        int b;
        int c=0;
        for (int i=0; i< arr.length-1; i++){
            a = arr[i];
            b = arr[i+1];
            c = b-a;
            //System.out.println(c);
        }
        if (c==1){
            System.out.println(c);
        }
    }
}


