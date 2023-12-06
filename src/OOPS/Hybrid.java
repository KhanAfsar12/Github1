package OOPS;

class bird {
    void h(){
        System.out.println("my name is afsar");
    }
}
interface brother{
   public void mainm();
}
interface friend{
    public void show();
}
class Hybrid extends bird implements brother,friend{

    @Override
    public void mainm() {
        System.out.println("I like it");
    }
    @Override
    public void show(){
        System.out.println("well done");
    }
    @Override
    public void h(){
        System.out.println("welcome");
    }

    public static void main(String[] args) {
        Hybrid h = new Hybrid();
        h.mainm();
        h.show();
        h.h();
    }
}
