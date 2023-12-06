package Basic;

import java.util.Scanner;

public class EvenOdd1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        findEvenOdd(a);

    }
    public static void findEvenOdd(int num){
        if (num%2==0){
            System.out.println(num);
        }
        else{
            System.out.println("Afsar");
        }
    }
}
