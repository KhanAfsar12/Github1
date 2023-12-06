/*
import java.util.*;
public class Circle {
    float rad;
    void process(float r){
        rad = r;
    }
    void result(){
        float area, circum;
        area = 3.14f*rad*rad;
        circum = 2*3.14f*rad;
        System.out.println("Area of circle is"+ area);
        System.out.println(("Circumference of circle is"+circum));
    }
}
class demo{
    public static void main(String[] args) {
        float radius = float.parseFloat(args);
        Circle c1 = new Circle();
        c1=process(radius);
        c1 = result;
    }
}*/
import java.lang.*;

class A extends Thread{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}
class B1{
    public static void main(String args[])
    {
        A t1=new A();
        A t2=new A();
        A t3=new A();
        t1.setName("t1 thread");
        t2.setName("t2 thread");
        t3.setName("t3 thread");

        t1.setPriority(2);
        t2.setPriority(6);
        t3.setPriority(7);

        t1.start();
        t2.start();
        t3.start();
    }
}
