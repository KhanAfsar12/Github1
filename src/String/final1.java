package String;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class final1 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        int a = 0;
        int b = 1;
        if(n<0){
            System.out.println("n cannoot be negative");
            return;
        }
        if(n==0)
            System.out.println(a);
        else if (n==1)
            System.out.println(b);
        else {
            int c=0;
            for (int i=2; i<=n; i++){
                c = a=b;
                a=b;
                b=c;
            }
            System.out.println(c);
        }
    }
}
