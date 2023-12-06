package Basic;

import java.util.Scanner;

public class SquareStr {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] input = getInput(4);
        int sumofArray = getArraySum(input);
        System.out.println("\n");
        System.out.println("The sum of arary is : " + sumofArray);
        System.out.println("\n");

        input = getArraySort(input);

        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }

    }

    public static int[] getInput(int num) {
        int[] array = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Enter your " + i + " number");
            array[i] = sc.nextInt();
        }

        return array;
    }

    public static int getArraySum(int[] array){

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }

    public static int[] getArraySort(int[] array) {

        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
