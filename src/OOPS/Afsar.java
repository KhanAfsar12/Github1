package OOPS;

public class Afsar {
    void khan() {
        System.out.println("employee");
    }
}
    class Kaif extends Afsar{
        void siddique(){
            System.out.println("chapri");
        }
    }
    class farman extends Kaif{
    void qureshi(){
        System.out.println("Kasai");
    }
    }
    class Testinheritence{
    public static void main(String[] args){
        farman f = new farman();
        f.qureshi();
        f.siddique();
        f.khan();
    }
    }

