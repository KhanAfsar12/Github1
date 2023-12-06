package Array;

import java.util.Scanner;

class afsar{
    private int id;
    private String name;

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
        }

public class ArrayasObj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        afsar[] a = new afsar[4];
        for (int i=0; i<a.length; i++){
            a[i] = new afsar();
            System.out.println("Enter id");
            a[i].setId(sc.nextInt());
            sc.nextLine();
            System.out.println("Enter Name");
            a[i].setName(sc.next());
        }
        for (int i=0; i<a.length; i++){
            System.out.println(a[i].getId()+" "+a[i].getName());
        }
    }
}
