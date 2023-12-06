package Test;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50,};
        int Sum = 0;
        for (int i = 0; i < arr.length; i++) {
                Sum += arr[i];
            }
        System.out.println("sum of Array is:" + Sum);
        }
    }