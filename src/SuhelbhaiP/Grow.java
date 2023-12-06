package SuhelbhaiP;


public class Grow {

    private static Grow instance = null;

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private static Grow grow;

    private Grow(){}

    public static Grow getInstance(){
        if (instance==null){
            instance=new Grow();
            return instance;
        }
        else {
            return instance;
        }

    }

    public static Grow getObj(){

        if(grow != null){
            return grow;
        }
       grow = new Grow();
        return grow;
    }
    public static void main(String[] args) {
        Grow p = Grow.getInstance();
        p.setId(12);
        System.out.println(p.getId());

        Grow p1 = Grow.getInstance();
        System.out.println(p1.getId());

        Grow g1 = Grow.getObj();
        System.out.println(g1.getId());

        Grow g2 = Grow.getObj();
        System.out.println(g2.getId());

        System.out.println(p.hashCode());
        System.out.println(p1.hashCode());
        System.out.println(g1.hashCode());
        System.out.println(g2.hashCode());

    }
}
