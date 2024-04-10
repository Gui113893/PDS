public class Main {

    public static void main(String[] args) {

        Department department = new Department("Department 1");
        Department subDepartment = new Department("Sub Department 1");
        department.addSubDepartement(subDepartment);
        Individual employee = new Individual("Employee 1", "Position 1", department);
        department.addEmployee(employee);
        department.showDetails();

        Individual employee2 = new Individual("Employee 2", "Position 2", subDepartment);
        subDepartment.addEmployee(employee2);
        department.showDetails();

        subDepartment.removeEmployee(employee2);
        department.showDetails();

    }
    
}
