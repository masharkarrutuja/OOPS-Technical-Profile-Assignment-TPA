// Question 11: Shape Hierarchy - Demonstrating Hierarchical Inheritance

class Shape {
    // Method to display shape information
    public void display() {
        System.out.println("This is a shape");
    }
    
    // Method to calculate area (to be overridden by subclasses)
    public double calculateArea() {
        return 0;
    }
}

class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public void display() {
        System.out.println("Circle with radius: " + radius);
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public void display() {
        System.out.println("Rectangle with length: " + length + " and width: " + width);
    }
    
    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class ShapeHierarchyDemo {
    public static void main(String[] args) {
        System.out.println("=== Shape Hierarchy Demonstration ===\n");
        
        // Create Circle object
        Circle circle = new Circle(5);
        circle.display();
        System.out.println("Area of Circle: " + String.format("%.2f", circle.calculateArea()) + " sq units\n");
        
        // Create Rectangle object
        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.display();
        System.out.println("Area of Rectangle: " + rectangle.calculateArea() + " sq units\n");
        
        // Polymorphism: Using parent class reference
        System.out.println("=== Using Parent Class Reference ===");
        Shape shape1 = new Circle(3);
        Shape shape2 = new Rectangle(5, 7);
        
        shape1.display();
        System.out.println("Area: " + String.format("%.2f", shape1.calculateArea()) + " sq units\n");
        
        shape2.display();
        System.out.println("Area: " + shape2.calculateArea() + " sq units");
    }
}
