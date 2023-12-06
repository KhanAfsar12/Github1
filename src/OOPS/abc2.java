package OOPS;

public class abc2 {
  static   int show(int a, int b){return a+b;}
   static double show(double a, double b, double c){return a+b+c;}

}
class abc3{
    public static void main(String[] args) {
        System.out.println(abc2.show(2,3));
        System.out.println(abc2.show(2,4,6));
    }
}