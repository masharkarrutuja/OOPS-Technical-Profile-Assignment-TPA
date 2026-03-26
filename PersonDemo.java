public class PersonDemo {
    private String name;
    private int age;

    public PersonDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        PersonDemo person1 = new PersonDemo("John Doe", 25);
        PersonDemo person2 = new PersonDemo("Jane Smith", 30);

        System.out.println("=== Person 1 ===");
        person1.displayDetails();

        System.out.println("\n=== Person 2 ===");
        person2.displayDetails();
    }
}
