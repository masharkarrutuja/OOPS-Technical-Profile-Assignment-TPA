class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee Name: " + this.name + ", Salary: $" + this.salary);
    }

    public void raiseSalary(double amount) {
        this.salary = this.salary + amount;
    }
}

class ThisKeywordDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 50000);
        Employee emp2 = new Employee("Bob", 60000);

        emp1.display();
        emp2.display();

        emp1.raiseSalary(5000);
        emp2.raiseSalary(10000);

        System.out.println("After raise:");
        emp1.display();
        emp2.display();
    }
}
