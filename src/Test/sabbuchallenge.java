package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sabbuchallenge {
    public static void main(String[] args) {
        List <Integer>list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(list);
       List<Integer> even= new ArrayList<>();
        List<Integer> odd= new ArrayList<>();
        for (Integer i:list) {
           if (i%2==0){
               even.add(i);
           }else {
               odd.add(i);
           }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
