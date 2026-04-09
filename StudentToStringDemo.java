public class StudentToStringDemo {
    static class Student {
        int id;
        String name;
        
        Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
        
        @Override
        public String toString() {
            return "Student{" + "id=" + id + ", name='" + name + '\'' + '}';
        }
    }
    
    public static void main(String[] args) {
        Student student1 = new Student(101, "Ravi");
        Student student2 = new Student(102, "Priya");
        Student student3 = new Student(103, "Arjun");
        
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}
