// Question 14: Person Hierarchy - Demonstrating Multilevel Inheritance

class Person {
    protected String name;
    protected int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void role() {
        System.out.println("I am a person");
    }
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    protected double salary;
    protected String department;
    
    public Employee(String name, int age, double salary, String department) {
        super(name, age);
        this.salary = salary;
        this.department = department;
    }
    
    @Override
    public void role() {
        System.out.println("I am an employee working in " + department + " department");
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Salary: Rs. " + salary);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    private int teamSize;
    
    public Manager(String name, int age, double salary, String department, int teamSize) {
        super(name, age, salary, department);
        this.teamSize = teamSize;
    }
    
    @Override
    public void role() {
        System.out.println("I am a manager managing a team of " + teamSize + " people in " + department);
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Team Size: " + teamSize);
    }
}

public class PersonHierarchyDemo {
    public static void main(String[] args) {
        System.out.println("=== Multilevel Inheritance Demonstration ===\n");
        
        // Create Person object
        Person person = new Person("Akash Singh", 30);
        System.out.println("--- Person Object ---");
        person.display();
        person.role();
        System.out.println();
        
        // Create Employee object
        Employee employee = new Employee("Pragya Desai", 28, 50000, "IT");
        System.out.println("--- Employee Object ---");
        employee.display();
        employee.role();
        System.out.println();
        
        // Create Manager object
        Manager manager = new Manager("Rajesh Kumar", 35, 100000, "IT", 8);
        System.out.println("--- Manager Object ---");
        manager.display();
        manager.role();
        System.out.println();
        
        // Runtime Polymorphism - Using Person reference
        System.out.println("=== Runtime Polymorphism with Person Reference ===\n");
        
        Person p1 = new Employee("Divya Sharma", 27, 45000, "HR");
        Person p2 = new Manager("Sanjay Verma", 40, 120000, "Finance", 10);
        
        Person[] persons = {p1, p2};
        
        for (Person p : persons) {
            System.out.println("--- Person Details ---");
            p.display();
            p.role();
            System.out.println();
        }
    }
}
