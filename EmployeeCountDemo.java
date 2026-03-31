class Employee {
    private String name;
    private int id;
    private static int employeeCount = 0;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public void display() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

class EmployeeCountDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 101);
        Employee emp2 = new Employee("Bob", 102);
        Employee emp3 = new Employee("Charlie", 103);

        emp1.display();
        emp2.display();
        emp3.display();

        System.out.println("Total Employees: " + Employee.getEmployeeCount());
    }
}
