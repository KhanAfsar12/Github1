package ExceptionHandling;

public class trycatch {
  static void fun1(){
      System.out.println("C");
      fun2();
      System.out.println("Python");
  }
  static void fun2(){
      System.out.println("C++");
  }

    public static void main(String[] args) {
        System.out.println("java");
        fun1();
        System.out.println("CSS");                       //java,C,C++,Python,CSS
    }
    }