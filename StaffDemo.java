public class Staff {
    public void work() {
        System.out.println("Staff is working");
    }
}

class Doctor extends Staff {
    @Override
    public void work() {
        System.out.println("Doctor is treating patients");
    }
}

class Nurse extends Staff {
    @Override
    public void work() {
        System.out.println("Nurse is caring for patients");
    }
}

class Receptionist extends Staff {
    @Override
    public void work() {
        System.out.println("Receptionist is managing appointments");
    }
}

class StaffDemo {
    public static void main(String[] args) {
        Staff doctor = new Doctor();
        Staff nurse = new Nurse();
        Staff receptionist = new Receptionist();

        doctor.work();
        nurse.work();
        receptionist.work();
    }
}
