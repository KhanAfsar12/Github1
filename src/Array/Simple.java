package Array;

public class Simple {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = 1;
        for(int i = 0; i<n; i++){
            int right = arr[arr.length-1];
            for(int j = arr.length-1; j>0; j--) {
                arr[j] = arr[j - 1];
            }       arr[0] = right;
            }
            System.out.println("  ");
            for(int i=0; i<arr.length; i++){
                System.out.println(arr[i]);
            }
        }
    }

