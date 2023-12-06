package Test;

public class Sorting {
    public static void main(String[] args) {
        int arr[] = {3,5,1,2,9};
        int cap;
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length-1; j++){
                if (arr[j]>arr[j+1]){
                    cap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = cap;
                }
            }
        }
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
    }
}
