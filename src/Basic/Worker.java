package Basic;

public class Worker {
    String name;
    String sector;

    public Worker(String name, String sector) {
this.name = name;
this.sector = sector;
    }
    void display(){
        System.out.println(name+""+sector);
    }
    public static void main(String[] args){
        Worker w = new Worker("Afsar","Delhi");

        w.display();
    }
}
