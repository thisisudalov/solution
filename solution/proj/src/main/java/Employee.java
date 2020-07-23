public class Employee {
    private String name;
    private int wage;
    private String department;

    public Employee(String name, int wage, String department) {
        this.name = name;
        this.wage = wage;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
