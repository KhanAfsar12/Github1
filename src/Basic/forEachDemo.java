package Basic;

public class forEachDemo {
    public static void main(String[] args) {
        int[] dice1 = {1,2,3,4,5,6,7,8,9};
        int[] dice2 = {1,2,3,4,5,6,7,8,9};

        for (int i=0; i<dice1.length; i++){
            for (int j=0; j<dice2.length; j++){
                System.out.println(dice1[i]+" "+dice2[j]);
            }
        }
    }
}
