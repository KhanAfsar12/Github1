package Encapsulation;
class A{
    protected A(){}//private constructor
    void msg(){System.out.println("Hello java");}
}
public class Simple{
    public static void main(String args[]){
        A obj=new A();//Compile Time Error
        obj.msg();
    }
}
