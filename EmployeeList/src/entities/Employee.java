package entities;

public class Employee {
    private final Integer id;
    private String name;
    private Double salary;

    public Employee(Integer id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double percentage) {
        increaseSalary(percentage);
    }

    public void increaseSalary (double percentage){
        salary += salary * percentage / 100;
    }

    @Override
    public String toString() {
        return id +
                ", " +
                name +
                ", " +
               String.format("%.2f", salary);
    }
}