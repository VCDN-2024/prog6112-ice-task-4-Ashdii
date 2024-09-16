package hospitalmanagement;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private String address;
    private String zipCode;
    private String phoneNumber;

    public Person() {
        // Default constructor
    }

    public void setData(Scanner sc) {
        System.out.print("Enter first name: ");
        firstName = sc.nextLine();
        System.out.print("Enter last name: ");
        lastName = sc.nextLine();
        System.out.print("Enter address: ");
        address = sc.nextLine();
        System.out.print("Enter zip code: ");
        zipCode = sc.nextLine();
        System.out.print("Enter phone number: ");
        phoneNumber = sc.nextLine();
    }

    @Override
    public String toString() {
        return String.format("%s %s, %s, %s, %s", firstName, lastName, address, zipCode, phoneNumber);
    }
}

