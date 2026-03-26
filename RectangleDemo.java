class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public void display() {
        System.out.println("Length: " + length + ", Width: " + width + ", Area: " + area());
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5.0, 4.0);
        Rectangle rect2 = new Rectangle(10.0, 6.5);

        System.out.println("=== Rectangle 1 ===");
        rect1.display();

        System.out.println("\n=== Rectangle 2 ===");
        rect2.display();
    }
}
