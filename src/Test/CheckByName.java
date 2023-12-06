package Test;
import java.util.Scanner;
public class CheckByName {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Name");
        String name = sc.next();
        int count = 0;

        for(int i=0;i<name.length();i++){
            if(name.charAt(i) == name.charAt(i+1)){
                continue;
            }
            for(int j=0;j<name.length();j++){
                if(name.charAt(i) == name.charAt(j)){
                    count++;
                }
            }
            System.out.println(name.charAt(i) + " number of times "+ count);
            count =0;
        }
        
        sc.close();
    }
    
}
