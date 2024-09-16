package hospitalmanagement;

import java.util.Scanner;

public class HospitalManagement {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            HospitalStaff[] staff = new HospitalStaff[4];
            Doctor[] doctors = new Doctor[3];
            Patient[] patients = new Patient[7];
            int staffCount = 0;
            int doctorCount = 0;
            int patientCount = 0;
            while (true) {
                System.out.print("Enter type (H for HospitalStaff/D for Doctor/P for Patient/Q to Quit): ");
                char choice = sc.next().charAt(0);
                sc.nextLine(); // consume newline character after char input
                
                if (choice == 'Q') {
                    break;
                }
                
                switch (choice) {
                    case 'H' -> {
                        if (staffCount >= staff.length) {
                            System.out.println("Error: Cannot add more than 4 Hospital Staff members.");
                        } else {
                            staff[staffCount] = new HospitalStaff();
                            staff[staffCount].setData(sc); // Pass scanner for user input
                            staffCount++;
                        }
                    }
                    case 'D' -> {
                        if (doctorCount >= doctors.length) {
                            System.out.println("Error: Cannot add more than 3 Doctors.");
                        } else {
                            doctors[doctorCount] = new Doctor();
                            doctors[doctorCount].setData(sc);
                            doctorCount++;
                        }
                    }
                    case 'P' -> {
                        if (patientCount >= patients.length) {
                            System.out.println("Error: Cannot add more than 7 Patients.");
                        } else {
                            patients[patientCount] = new Patient();
                            patients[patientCount].setData(sc);
                            patientCount++;
                        }
                    }
                    default -> System.out.println("Invalid option. Please enter H, D, P, or Q.");
                }
            }
            // Close scanner after use
        }
    }
}