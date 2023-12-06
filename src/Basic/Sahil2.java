package Basic;

class Aa{
    Aa(){
        System.out.println("Aa");
    }
}

class Bb extends Aa{
    Bb(){
        System.out.println("Bb");
    }
}

public class Sahil2 extends Bb{
    Sahil2(){
        System.out.println("sahil");
    }

    public static void main(String[] args) {
        Sahil2 s2 = new Sahil2();
    }
}
