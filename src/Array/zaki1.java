package Array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class zaki1 {
    static void frequencyCount(int arr[],int k){
        boolean number[]=new boolean[k];
        for (int i=0;i<k;i++){
            if (number[i]==true)
                continue;
            int count =1;
            for (int j=i+1;j<k;j++) {
                if (arr[i] == arr[j]){
                    number[j] = true;
                count++;
            }

            }
            System.out.println(arr[i]+" = "+count);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,4,4};
        int k= arr.length;
        frequencyCount(arr,k);
     /*   int[] a;
        Scanner sc = new Scanner(System.in);
        char c;
        HashMap<Integer , Integer> map = new HashMap<>();
        do {
            System.out.println("define the size of array");
            int size = sc.nextInt();
            a =new int[size];

            int[] b = new int[a.length];

            System.out.println("Enter numbers");
            for(int i = 0; i<a.length;i++){
                a[i] = sc.nextInt();
                b[i] = a[i];
            }

            int count = 0;

            for(int i = 0; i<a.length;i++){
                for (int j = 0;j<b.length;j++){
                    if(a[i] == b[j]){
                      count++;
                    }
                }
            }

            System.out.println("do you want to continue y/n");
            c = sc.next().charAt(0);
        }while(c == 'y' || c == 'Y');

        for (Map.Entry<Integer , Integer> entry : map.entrySet() ) {
            System.out.println(entry);
        }

        sc.close();*/
    }
}
