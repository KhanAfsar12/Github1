public class Main {
    public static int i = 10;
    static class Sahil{
        public void dis(){
            System.out.println(i);
        }
    }

    public static String name = "sahil";

    public void show(){
        name = "jamal";
        System.out.println(i);
    }

    public static void main(String[] args) {
        Main main = new Main();
        Main.Sahil sa = new Main.Sahil();
        sa.dis();
        main.show();

        int a = 2 & 3;
        System.out.println(a);

        int b = 2 | 3;
        System.out.println(b);
    }

}
