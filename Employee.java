public class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Salary after tax: " + (salary - (salary * 0.1)));
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Vinay", 101, 50000.0);
        emp1.displayInfo();
    }
}