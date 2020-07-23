public class Department {
    private String name;
    private long total_salary_budget;
    private int employee_count;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTotal_salary_budget() {
        return total_salary_budget;
    }

    public void increaseBudget(int plus) {
        this.total_salary_budget+= plus;
    }

    public int getEmployee_count() {
        return employee_count;
    }

    public void increaseEmployeeCount() {
        employee_count++;
    }

    public Department(String name, long total_salary_budget){
        this.name = name;
        this.total_salary_budget = total_salary_budget;
        employee_count = 1;
    }

    public int countAverage(){
        return (int)total_salary_budget/employee_count;
    }
}
