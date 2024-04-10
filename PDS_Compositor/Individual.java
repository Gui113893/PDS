public class Individual implements Employee{

    private String name;
    private String position;
    private Department department;

    public Individual(String name, String position, Department department) {
        this.name = name;
        this.position = position;
        this.department = department;
    }

    @Override
    public void showDetails() {
        System.out.println("Employee: " + name + " Position: " + position + " Department: " + department.getName());
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    
    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
