public class Employee {
    private String name;
    private int salary;
    private double netSalary;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", netSalary=" + netSalary +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        setNetSalary();
    }

    private void setNetSalary() {
        this.netSalary = this.salary * 0.80;
    }
}
