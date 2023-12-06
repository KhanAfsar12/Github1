package Basic;

public class InnerClass {

    int id;
    String name;
    String Gender;

    InnerClass(int id, String name){
        this(name);
        this.id = id;
    }
    InnerClass(String name){
        this.name = name;
    }
    boolean updateProfile(String name){
        this.name = name;
        return true;
    }
}

