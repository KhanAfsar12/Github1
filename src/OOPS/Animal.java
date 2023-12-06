package OOPS;

class Animal {
    void eat(){
        System.out.println("eating");
    }
}
class Dog1 extends Animal{
    void bark(){
        System.out.println("barking");
    }
}
class cat extends Animal{
    void meow(){
        System.out.println("meow");
    }
}
class Testinheritence1{
    public static void main(String[] args){
        cat c = new cat();
        c.meow();
        c.eat();
    }
}