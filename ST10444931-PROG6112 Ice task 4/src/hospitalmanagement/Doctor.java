package hospitalmanagement;

import java.util.Scanner;

public class Doctor extends HospitalStaff {
    private boolean isSpecialist;

    public Doctor() {
        super(); // Call parent constructor
    }

    @Override
    public void setData(Scanner sc) {
        super.setData(sc); // Call parent setData method
        System.out.print("Is specialist (true/false)? ");
        isSpecialist = sc.nextBoolean();
        sc.nextLine(); // Consume newline
    }

    @Override
    public String toString() {
        return String.format("%s, Specialist: %s", super.toString(), isSpecialist ? "Yes" : "No");
    }
}
