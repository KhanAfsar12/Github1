package SuhelbhaiP;

import java.util.Arrays;

public final class table {
    private String name;
    private int age;

    table(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public table(){}
}

class Immutable{
    public static void main(String[] args) throws Exception {

//       throw new ArithmeticException("Sahil");


        table t1 = new table();
        Class c1 = t1.getClass();
        table t2 = new table();
        Class c2 = t2.getClass();

        System.out.println(c1.getDeclaredMethods().length);

        table t = new table("Afsar",18);
        System.out.println(t.getName());
        System.out.println(t.getAge());
    }
}
