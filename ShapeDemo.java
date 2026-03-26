abstract class Shape {
    abstract double calculateArea();

    public void displayInfo() {
        System.out.println("Area: " + calculateArea());
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class RectangleShape extends Shape {
    private double length;
    private double width;

    public RectangleShape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        System.out.println("=== Circle ===");
        Shape circle = new Circle(5.0);
        circle.displayInfo();

        System.out.println("\n=== Rectangle ===");
        Shape rectangle = new RectangleShape(4.0, 6.0);
        rectangle.displayInfo();
    }
}
