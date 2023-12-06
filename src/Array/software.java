package Array;

public class software {
    public static void main(String[] args) {
        int A[]={10,20,30,40,50};
        int item =4;
        int index=-1;
        for (int i=0; i<A.length; i++){
            if (A[i]==item){
                index=i;
                break;
            }
        }
        System.out.println("30 is located at"+index+"index");
    }
}
