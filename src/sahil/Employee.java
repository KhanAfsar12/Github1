package sahil;

public class Employee {

    private String name;

    private String email;

    private double salary;

    private String Department;

    public Employee(String name, String email, double salary, String department) {
        this.name = name;
        this.email = email;
        this.salary = salary;
        Department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
}
