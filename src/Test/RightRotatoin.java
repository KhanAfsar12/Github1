package Test;

public class RightRotatoin {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        boolean b = true;
//        int c = 0;
//        int d = a.length-1;
//        if(b){
//            c = a[0];
//            a[0] = a[d];
//            a[d] = c;
//            b = false;
//        }


        int[] arr = {10,20,30,40,50};
        //20,30,40,50,10
        int a = 0;
        for (int i=arr.length-1; i>0; i--){
            a = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = a;
        }
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+",");
        }
    }
}
