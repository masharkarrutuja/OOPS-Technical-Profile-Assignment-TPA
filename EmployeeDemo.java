import java.util.Scanner;

class Employee {
    private int empno;
    private String ename;
    private double basic;
    private double hra;
    private double da;
    private double netpay;

    public void haveData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Number: ");
        empno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        ename = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        basic = sc.nextDouble();
    }

    public void calculate() {
        hra = basic * 0.20;
        da = basic * 0.10;
        netpay = basic + hra + da;
    }

    public void dispData() {
        System.out.println("\n=== Employee Salary Details ===");
        System.out.println("Employee Number: " + empno);
        System.out.println("Employee Name: " + ename);
        System.out.println("Basic Salary: Rs. " + basic);
        System.out.println("HRA (20%): Rs. " + hra);
        System.out.println("DA (10%): Rs. " + da);
        System.out.println("Net Pay: Rs. " + netpay);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.haveData();
        emp.calculate();
        emp.dispData();
    }
}
