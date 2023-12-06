package Encapsulation;
import java.util.Scanner;

public class TestEncapsulation1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name: ");
        String name = sc.nextLine();

        System.out.println("Enter your Account no: ");
        long Acc_no = sc.nextLong();

        System.out.println("Enter your ammount: ");
        float Amount = sc.nextFloat();

        System.out.println("Enter your Email: ");
        byte email = sc.nextByte();
        sc.close();


        Account acc = new Account();
        acc.setName(name);
        acc.setAcc_no(Acc_no);
        acc.setEmail(email);
        acc.setAmount(Amount);

        System.out.println("Name: "+acc.getName()+ "Account_no " +acc.getAcc_no()+ "Email: " +acc.getEmail()+ "Ammount: " +acc.getAmount());
    }
}
