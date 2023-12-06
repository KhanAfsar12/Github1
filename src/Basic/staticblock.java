package Basic;

public class staticblock {
   static int a = 35;
    static{
        System.out.println(a);
    }
public static void main(String[] args){
        System.out.println(a);
    }
static{
        System.out.println(a);
}
}
