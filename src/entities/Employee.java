package entities;

public class Employee {

    private Integer id;
    private String name;
    private Double salary;

    public Employee(Integer id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Double getSalary(){
        return salary;
    }

    public void increaseSalary(double percentage) {
        this.salary += this.salary * (percentage / 100);
    }

    @Override
    public String toString(){
        return this.getId() + ", "
                + this.getName() + ", "
                + this.getSalary();
    }
}