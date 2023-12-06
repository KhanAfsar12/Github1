package AamirProg;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class employee {
    private int id;
    private String name;
    private String mail;
    private float Salary;
    private String Department;

    public employee(int id,String name, String mail, float Salary, String Department) {
        this.id = id;
        this.name=name;
        this.mail=mail;
        this.Salary=Salary;
        this.Department=Department;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getMail(){
        return mail;
    }
    public void setMail(String mail){
        this.mail=mail;
    }

    public float getSalary(){
        return Salary;
    }
    public void setSalary(float Salary){
        this.Salary=Salary;
    }

    public String getDepartment(){
        return Department;
    }

    public void setDepartment(String Department){
        this.Department=Department;
    }

    public employee(){
        super();
    }

    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", Salary=" + Salary +
                ", Department='" + Department + '\'' +
                '}';
    }

   @Sahil
    public static void main(String[] args){
        List<employee> al = new ArrayList<>();
        al.add(new employee(100,"Afsar","ka484564@gmail.com",40000f,"IT"));
        al.add(new employee(101,"Abrar","abrar32@gmail.com",50000f,"IT"));
        al.add(new employee(102,"Raza","raza553@gmail.com",60000f,"Medical"));
        al.add(new employee(103,"Shan","shan876@gmail.com",10000f,"Medical"));
        al.add(new employee(104,"Kaif","kaif786@gmail.com",90000f,"BCA"));
        al.add(new employee(105,"Sahil","sahil0505@gmail.com",80000f,"BCA"));
        al.add(new employee(106,"Abdullah","abdullah6434@gmail.com",30000f,"MCA"));
        al.add(new employee(107,"Rahil","rahil91495@gmail.com",70000f,"MCA"));
        al.add(new employee(108,"Faraz","faraz0543@gmail.com",20000f,"BA"));
        al.add(new employee(109,"Siraj","siraj0052@gmail.com",25000f,"BA"));

        for(employee e : al){
            System.out.println(e);
        }

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");

        al = al.stream().map(s->{
            if(s.getDepartment().equals("IT")){
                s.setSalary((float) ((s.getSalary()*0.1)+s.getSalary()));
            }
            if(s.getDepartment().equals("Medical")){
                s.setSalary((float) ((s.getSalary()*0.07)+s.getSalary()));
            }
            if(s.getDepartment().equals("MCA")){
                s.setSalary((float) ((s.getSalary()*0.05)+s.getSalary()));
            }
            if(s.getDepartment().equals("BCA")){
                s.setSalary((float) ((s.getSalary()*0.03)+s.getSalary()));
            }
            if(s.getDepartment().equals("BA")){
                s.setSalary((float) ((s.getSalary()*0.02)+s.getSalary()));
            }
            return s;
        }).collect(Collectors.toList());

        for(employee e : al){
            System.out.println(e);
        }


    }











}
