package TestJava;
import java.util.Arrays;
import java.util.Scanner;
public class Sahil {

    public void sa(){
        System.out.println("this is called");
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int NumofRot= sc.nextInt();
//        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//
//        for (int i = 0; i < NumofRot; i++) {
//            int temp = a[a.length - 1];
//            for (int j = a.length - 1; j > 0; j--) {
//                a[j] = a[j - 1];
//            }
//            a[0] = temp;
//        }
//        System.out.println(Arrays.toString(a));

//        int[] a = {26,27,29,30};
//        int n = a.length+1;
//        int ts = (n*(n+1));
//        int s = 0;
//        for(int i = 0 ; i < a.length ; i++){
//            s += a[i];
//        }
//        int m = ts-s;
//        System.out.println(m);
//
//        int[] arr = new int []{1, 2, 3, 4};

//        int[] a = {1,2,3,4};
//
//        int f = Integer.MIN_VALUE;
//        int s = Integer.MIN_VALUE;
//
//        for(int i = 0 ; i < a.length ; i++){
//
//            if(a[i] > f) {
//                s = f;
//                f = a[i];
//            } else if (a[i] > s && a[i] < f) {
//                s = a[i];
//            }
//        }
//
//        System.out.println(s);

        try{

            Class a = Class.forName("Sahil");
            Sahil s = (Sahil) a.newInstance();
            s.sa();

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
