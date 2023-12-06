package TestJava;

public class A {

    public void dis(){
        System.out.println("this is called");
    }

    public static void main(String[] args) {
        try{
            Class c = Class.forName("Sahil");
            Sahil a = (Sahil) c.newInstance();
            a.sa();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
