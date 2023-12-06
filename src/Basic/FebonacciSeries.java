package Basic;

import java.util.Arrays;

public class FebonacciSeries {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {2,3,1,4,5};

        Arrays.sort(a);
        Arrays.sort(b);
            int temp = 0;

            for (int i=0; i<a.length; i++){
                if (a[i] == b[i]){
                    temp+=1;

                    if (a.length == b.length && temp==a.length){
                        System.out.println("both arrays are same");
                    }
                }
            }
    }
}
