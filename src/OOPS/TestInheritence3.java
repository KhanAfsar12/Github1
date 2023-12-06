package OOPS;

class A1 {
    void show(){
        System.out.println("Ahmed");
    }}
class B1 extends A1 {
    void display() {
        System.out.println("A1.show");
    }}

public class TestInheritence3 {
        public static void main(String[] args) {
            A1 a = new A1();
            a.show();
        }
    }
