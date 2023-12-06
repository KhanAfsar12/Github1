package Test;
import java.util.Scanner;
public class AmirbQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isTrue = true;
        int even = 0;
        int odd = 0;
        while(isTrue){
            System.out.println("Enter the number");
            int num = sc.nextInt();

            if(num%2 == 0){
                even += num;
            }

            if(num%2 != 0){
                odd += num;
            }

            System.out.println("Do you wnat to continue y/n");
            String s = sc.next();

            if(s=="n" || s=="N"){
                isTrue = false;
            }

        }

        System.out.println("Sum of even is: "+even);
        System.out.println("Sum of odd is: "+odd);

        sc.close();
    }
}
