package Test;
import java.util.Scanner;
public class Check {

    int positive = 0;
    int negative = 0;
    int zero = 0;

    public void dis(int num){

        if(num>0){
            positive++;
        } else if (num<0) {
            negative++;
        }else{
            zero++;
        }

    }

    public static void main(String[] args) {
        boolean isTrue = true;
        Scanner sc = new Scanner(System.in);
        Check ch = new Check();

        while(isTrue){
            System.out.println("Enter the Number");
            int num = sc.nextInt();
               ch.dis(num);
            System.out.println("do you want to continue y/n");
            char c = sc.next().charAt(0);
            isTrue = (c == 'n' || c == 'N')?false:true;
        }

        System.out.println("Count Of Positive Number :" + ch.positive);
        System.out.println("Count Of Negative Number :" + ch.negative);
        System.out.println("Count Of Zero Number :" + ch.zero);

        sc.close();
    }

}
