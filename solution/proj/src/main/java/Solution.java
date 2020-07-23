import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class Solution {
    private ArrayList<Employee> read(){
        ArrayList<Employee> employees = new ArrayList<>();
    try
    {
        FileReader file_in = new FileReader("D:\\work\\solution\\in.txt");
        BufferedReader br = new BufferedReader(file_in);

        String str;
        while ((str=br.readLine())!=null){
            String temp[] = str.split(";");
            employees.add(new Employee(temp[0], Integer.parseInt(temp[2].replaceAll(" ", "")), temp[3]));
        }

    } catch (IOException e){
        System.out.println("Error with reading file");
        System.exit(1);
    }
        return employees;
    }

    public void whereToTransfer(){
        ArrayList<Department> departments = new ArrayList<>();
        ArrayList<Employee> employees = read();
        for (int i = 0; i<employees.size(); i++) {
            if(i==0){
                departments.add(new Department((employees.get(0)).getDepartment(), employees.get(0).getWage()));
                continue;
            }
            for (int j = 0; j < departments.size(); j++) {
                if (employees.get(i).getDepartment().equals(departments.get(j).getName())) {
                    departments.get(j).increaseEmployeeCount();
                    departments.get(j).increaseBudget(employees.get(i).getWage());
                    break;
                }
                else if (!employees.get(i).getDepartment().equals(departments.get(j).getName())){
                    departments.add(new Department(employees.get(i).getDepartment(), employees.get(i).getWage()));
                    break;
                }
            }
        }
        for (int i = 0; i < departments.size(); i++) {
            System.out.println(departments.get(i).getName()+" "+departments.get(i).getEmployee_count());
        }
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        s.whereToTransfer();
    }
}
