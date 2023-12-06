public class Create {
    public static void main(String[] args) {
        int[] Arr={20,10,5,6,9};
        int temp;
        for (int i=0; i<Arr.length; i++){
            for (int j=0; j<Arr.length-1; j++){
                if (Arr[j]>Arr[j+1]){
                    temp = Arr[j];
                    Arr[j] = Arr[j+1];
                    Arr[j+1] = temp;
                }
            }
        }
        for (int i=0; i<Arr.length; i++){
            System.out.println(Arr[i]+" ");
        }
    }
}