package entities;

public class Employee {
    private String name;
    private Integer id;
    private Double salary;
    
    public Employee(String name, Integer id, Double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void increaseSalary(Double percentage) {
        this.setSalary(this.getSalary() + ((percentage / 100) * this.getSalary()) );
    }

    @Override
    public String toString() {
        return "\n" + "Employee" + "\n" 
        +"Id: " + id + "\n" 
        +"Name: " + name + "\n" 
        +"Salary: " + String.format("%.2f",salary) + "\n";
    }

    
}
