package Model;

public class Workers {
    private String name;
    private int salary;

    public Workers() {
        setSalary(0);
        setName("Vacio");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    } 

}
