package Basic;

public class Student {
    int rollno;
    String name;
    static String college = "Saboo Siddique";
    //constructor
    Student(int r, String n){
        rollno = r;
        name = n;
    }
    void display(){
        System.out.println(rollno+""+name+""+college);
    }
}
