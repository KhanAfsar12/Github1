package OOPS;

public class Vehicle {
    void run(){
        System.out.println("VEHICLE IS RUNNING");
    }
}
class bike1 extends Vehicle{
    void run(){
        System.out.println("BIKE IS UNICORN");
    }
    public static void main(String[] args){
        bike1 obj = new bike1();
        obj.run();
    }
}
