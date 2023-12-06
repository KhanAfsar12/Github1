package Basic;

public class garage {
    int id;
    String name;
    String address;

    public garage(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
    void display(){
        System.out.println(id+""+name+""+address);
    }
    public static void main(String[] args){
        garage g = new garage(32,"Ashraf","MONU Auto garage");

        g.display();
    }
}
