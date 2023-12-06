package Basic;

public class ForloopDemo{
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};


//                for (int i=0, j=a.length-1; i<=0; i++){
//                    int temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;

      for (int i=0, j=a.length-1, middle=a.length/2; i<middle; i++,j--){
          int temp = a[i];
          a[i] = a[j];
          a[j] = temp;

      }
      for (int i=0; i<a.length; System.out.println(a[i++]+" "));
      }
    }


