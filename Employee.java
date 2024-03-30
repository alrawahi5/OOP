public class Employee {

    private String name;
    private String position;
    private Integer salary;

    public Employee(){}

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean displayEmployeeInfo(String name, String position, Integer salary){
        System.out.println("Employee's name: " + name + '\n' + "Position: " + position + '\n' + "Salary: " + salary);
        return true;
    }


    public static void main(String [] args ){
        Employee employee = new Employee();
        employee.name = "Abdullah";
        employee.position = "Cyber Security Specialist";
        employee.salary = 2700;

        System.out.print(employee.displayEmployeeInfo(employee.name, employee.position, employee.salary));

    }
}

