package Basic;

public class dream {
    public static void show1(int a){
        System.out.println("hi");
    }
}
class Bt extends dream{
    public static void show(int a){
        System.out.println("by");
    }

    public static void main(String[] args) {
        Bt a =(Bt)new dream();
        a.show(10);
    }
}
