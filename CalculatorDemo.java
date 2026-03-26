class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("=== Method Overloading Demo ===");

        System.out.println("add(5, 3) = " + calc.add(5, 3));

        System.out.println("add(5, 3, 2) = " + calc.add(5, 3, 2));

        System.out.println("add(5.5, 3.2) = " + calc.add(5.5, 3.2));
    }
}
