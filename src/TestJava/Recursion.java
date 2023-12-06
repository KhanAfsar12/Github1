package TestJava;

public class Recursion {

  static int i = 0;

  public static  void printNumber(int n){
      if (n==11){
       return;
      }
    System.out.println(n);
      printNumber(n -1  );
  }

  public void num(){
    System.out.println(i);
    i++;
    if( i == 11){
      return;
    }
    num();
  }

  public static void main(String[] args) {
    int n=1;
    printNumber(n);
    Recursion r = new Recursion();
    r.num();
  }

}
