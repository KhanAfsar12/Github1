package Array;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{1,2,3},{1,2,3}};
        int[][] b = {{3,4,5},{3,4,5},{3,4,5}};
        int[][] c = new int[3][3];

        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                int sum = 0;
                for (int k=0; k<a.length; k++){
                    sum += a[i][k]*b[k][j];
                }
                c[i][j] = sum;
            }
        }
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
