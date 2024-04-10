import java.util.List;
import java.util.ArrayList;

public class Department {

    private String name;
    private List<Department> subDepartement = new ArrayList<Department>();
    private List<Employee> employees = new ArrayList<Employee>();

    public Department(String name) {
        this.name = name;
    }

    public void addSubDepartement(Department department) {
        subDepartement.add(department);
    }

    public void removeSubDepartement(Department department) {
        subDepartement.remove(department);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void showDetails() {
        System.out.println("Department: " + name);
        for (Employee employee : employees) {
            employee.showDetails();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getSubDepartement() {
        return subDepartement;
    }

    public void setSubDepartement(List<Department> subDepartement) {
        this.subDepartement = subDepartement;
    }


}
