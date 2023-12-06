
public class abc3{

   private String name;
    private int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public abc3(){
        this("sahil");
        System.out.println("this is No_argument constructor");
    }

    public abc3(int id){
        this("sahil",id);
    }

    public abc3(String name){
        this(name,1);
    }

    public abc3(String name,int id){
        this.name=name;
        this.id=id;
    }

    public static void main(String[] args) {

        abc3 sa = new abc3();
        System.out.println(sa.getName()+" "+sa.getId());
       abc3 ab = new abc3("sahil",1);
        abc3 a = new abc3("afsar",2);
        abc3 b = new abc3("shoib",1);

    }
}
