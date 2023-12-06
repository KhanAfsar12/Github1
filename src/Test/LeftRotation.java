package Test;

public class LeftRotation {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        //20,30,40,50,10
        int a = 0;
        for (int i=0; i<arr.length-1;i++){
            a = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = a;
        }
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+",");
        }
    }
}
