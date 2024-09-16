package hospitalmanagement;

import java.util.Scanner;

public class Patient extends Person {
    private String medicalRecordNumber;
    private String[] currentAilments;

    public Patient() {
        super(); // Call parent constructor
    }

    @Override
    public void setData(Scanner sc) {
        super.setData(sc); // Call parent setData method
        System.out.print("Enter medical record number: ");
        medicalRecordNumber = sc.nextLine();
        System.out.print("Enter current ailments (comma-separated): ");
        String ailmentsInput = sc.nextLine();
        currentAilments = ailmentsInput.split(",\\s*"); // Split ailments by comma
    }

    @Override
    public String toString() {
        return String.format("%s, Medical Record Number: %s, Ailments: %s", super.toString(), medicalRecordNumber, String.join(", ", currentAilments));
    }
}