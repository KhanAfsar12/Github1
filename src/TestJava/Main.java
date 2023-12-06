package TestJava;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Student9[]  student9s = new Student9[3];

        for(int i = 0 ; i < student9s.length ; i++){
            student9s[i] = new Student9();
            System.out.println("enter id");
            student9s[i].setId(sc.nextInt());
            System.out.println("enter name");
            student9s[i].setName(sc.next());
            sc.nextLine();
        }

       for(Student9 s : student9s){
           System.out.println(s.getId()+" "+s.getName());
       }

    }

}
