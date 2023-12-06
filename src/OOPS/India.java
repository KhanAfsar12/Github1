package OOPS;

public class India {
    static double add(double a,double b){return a+b;}
    static int add(int a,int b){return a+b;}
}
class TestIndia{
    public static void main(String[] args){
        System.out.println(India.add(20,20));
        System.out.println(India.add(20.50,19.50));
    }
}