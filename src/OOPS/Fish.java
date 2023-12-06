package OOPS;

public class Fish {
    void rohu(){
        System.out.println("Fresh water");
    }
}
class babyfish extends Fish{
    void catfish(){
        System.out.println("water");
    }
}
class Testinheritence3 {
    public static void main(String[] args) {
        babyfish b = new babyfish();
        b.rohu();
        b.catfish();
    }
}