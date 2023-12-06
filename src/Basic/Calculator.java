package Basic;

import java.util.Scanner;
public class Calculator {
    // private static Scanner sc;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b ,result;
        System.out.println("Please enter any two number = ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        System.out.println("Enter any operator from +,-,/,*,% = ");
        char operator = sc.next().charAt(0);
        switch (operator){
            case'+':
                result = a+b;
                break;
            case'-':
                result = a-b;
                break;
            case'/':
                result = a/b;
                break;
            case'*':
                result = a*b;
                break;
            case'%':
                result = a%b;
                break;
            default:
                System.out.println("You have entered incorrect operator");
                return;
        }
        System.out.println("%.2f %c %.2f = %.2f");
    }
}
