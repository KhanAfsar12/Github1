package Array;

import java.util.Arrays;

public class FindingDuplicateNumber {
    public static void main(String[] args) {
        int[] my_array = {1,7,8,7,2,4,8,5,4};
        for (int i=0; i<my_array.length-1; i++){
            for (int j=i+1; j<my_array.length; j++){
                if (my_array[i]==my_array[j] && (i!=j)){
                    System.out.println("duplicate number "+ my_array[j]);
                }
            }
        }
    }
}
