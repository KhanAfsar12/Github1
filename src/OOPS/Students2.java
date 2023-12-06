package OOPS;

public class Students2 {
    int id = 12;
}
class Afsar1 extends Students2{
    String standard = "seventh";
}
class Testinheritence2{
    public static void main(String[] args){
        Afsar1 a = new Afsar1();
        System.out.println("Afsar id is:"+a.id);
        System.out.println("Standard of Afsar is:"+a.standard);
    }
}