// Question 13: Employee Bonus - Demonstrating Runtime Polymorphism

abstract class Employee {
    protected String name;
    protected int id;
    protected double salary;
    
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    // Abstract method - must be implemented by subclasses
    public abstract double calculateBonus();
    
    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: Rs. " + salary);
    }
}

class Manager extends Employee {
    private int teamSize;
    
    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    
    @Override
    public double calculateBonus() {
        // Manager gets 20% of salary as bonus
        return salary * 0.20;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Position: Manager");
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    private int projectsCompleted;
    private double projectIncentive;
    
    public Developer(String name, int id, double salary, int projectsCompleted, double projectIncentive) {
        super(name, id, salary);
        this.projectsCompleted = projectsCompleted;
        this.projectIncentive = projectIncentive;
    }
    
    @Override
    public double calculateBonus() {
        // Developer gets 10% salary + project incentive
        return (salary * 0.10) + (projectsCompleted * projectIncentive);
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Position: Developer");
        System.out.println("Projects Completed: " + projectsCompleted);
    }
}

public class EmployeeBonusDemo {
    public static void main(String[] args) {
        System.out.println("=== Employee Bonus Calculation System ===\n");
        
        // Create Manager object
        Manager manager = new Manager("Priya Sharma", 101, 80000, 5);
        System.out.println("--- Manager Details ---");
        manager.displayInfo();
        System.out.println("Bonus Amount: Rs. " + manager.calculateBonus() + "\n");
        
        // Create Developer object
        Developer developer = new Developer("Arjun Patel", 102, 60000, 8, 2000);
        System.out.println("--- Developer Details ---");
        developer.displayInfo();
        System.out.println("Bonus Amount: Rs. " + developer.calculateBonus() + "\n");
        
        // Runtime Polymorphism - Using Employee reference
        System.out.println("=== Runtime Polymorphism Demo ===\n");
        
        Employee emp1 = new Manager("Neha Singh", 103, 85000, 6);
        Employee emp2 = new Developer("Vikram Rao", 104, 65000, 10, 2500);
        
        Employee[] employees = {emp1, emp2};
        
        double totalBonus = 0;
        for (Employee emp : employees) {
            emp.displayInfo();
            double bonus = emp.calculateBonus();
            System.out.println("Bonus: Rs. " + bonus);
            totalBonus += bonus;
            System.out.println();
        }
        
        System.out.println("Total Bonus Distributed: Rs. " + totalBonus);
    }
}
