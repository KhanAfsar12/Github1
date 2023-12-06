package OOPS;

public class Polymorphism {
static int add(int a,int b){return a+b;}
    static int add(int a,int b, int c){return a+b+c;}
static int add(int a,int b,int c,int d){return a+b+c+d;}
}
class TestPolymorphism{
public static void main(String[] args){
System.out.println(Polymorphism.add(10,1));
System.out.println(Polymorphism.add(1,1,1));
System.out.println(Polymorphism.add(1,1,1));
}
}