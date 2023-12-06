import java.util.*;
public class aaa{
   static int arr[]={10,20,30,40,50};
    static int sum()
    {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println("Sum of given array is " + sum());
        Scanner sc = new Scanner(System.in);
        System.out.println("Sum of given Array is:"+sum());
        String sum = sc.next();
        System.out.println("Write your Rol no.:");
        int a = sc.nextInt();
    }
}
