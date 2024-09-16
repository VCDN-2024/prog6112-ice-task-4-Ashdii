package hospitalmanagement;

import java.util.Scanner;

public class HospitalStaff extends Person {
    private String staffID;
    private double annualSalary;
    private String departmentName;

    public HospitalStaff() {
        super(); // Call parent constructor
    }

    @Override
    public void setData(Scanner sc) {
        super.setData(sc); // Call parent setData method
        System.out.print("Enter staff ID: ");
        staffID = sc.nextLine();
        System.out.print("Enter annual salary: ");
        annualSalary = sc.nextDouble();
        sc.nextLine(); // Consume newline
        System.out.print("Enter department name: ");
        departmentName = sc.nextLine();
    }

    @Override
    public String toString() {
        return String.format("%s, Staff ID: %s, Salary: %.2f, Department: %s", super.toString(), staffID, annualSalary, departmentName);
    }
}
