package Basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class VariableScop {
//  static   void main(){
//        int i = 0;
//        for (int i; i<1; i++){
//            System.out.println(i);
//        }
//    }

    public static void main(String[] args) {
// main();

       for(int j = 0 ; j < 10 ; j++){
            System.out.println("you are outside the inner loop");
            for(int i = j ; i < 10 ; i++) {
            System.out.println(i);
            if ((i * 5) >= 18) {
                System.out.println("Your age is valid");
                break;
            }
        }
       }


       String name = "Sahil Jamal";

       name = Arrays.stream(name.split(" ")).collect(Collectors.joining());

        System.out.println(name);

       Map<Character,Long> map = name.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(c->c,Collectors.counting()));

        for (Character character : map.keySet()) {

                System.out.println(character + " repeated " + map.get(character) + " times");

        }

    }
}
