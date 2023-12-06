package Basic;

import java.util.Scanner;

public

class FinalInstanceVariable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int x = sc.nextInt();              //1       11
        for (int i=1; i<=25; i++){
            System.out.println(x+"\t");
           x=x+10;
        }
    }
}
