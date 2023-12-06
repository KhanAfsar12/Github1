package Basic;

public class final1 {
    public static void main(String[] args) {

        int n = 10;
        int mid = n/2;

        for (int i=1; i<n; i++){
           if(i <= mid){
               for(int j = 0 ; j < i ; j++){
                   System.out.print(j+1 + " ");
               }
           }
           if(i > mid){
               for(int j = 0 ; j < mid-1 ; j++) {
                   System.out.print(j+1 + " ");
               }
               mid--;
           }
            System.out.println();
        }
    }
}
