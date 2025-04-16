package com.pluralsight;
import java.util.Scanner;
public class FullNameParser {
    public static void main(String[] args) {

        // Create a Scanner object to read user input

        Scanner scanner=new Scanner(System.in);

        // Ask the user to enter their full name

        System.out.println("Please enter your name:");

        // Read the input line and remove any spaces from the beginning and end

        String fullName = scanner.nextLine().trim();
          // Split the input string into parts

        String [] parts =fullName.split("\\s+");

        // Declare variables to store the parts of the name

        String firstName;  // To hold the first name
        String middleName= "none"; // Default middle name is "none" in case it's not provided
        String lastName;  // To hold the last name

        if ( parts.length ==2){
            firstName= parts[0];
            lastName = parts[1];
        } else if (parts.length==3) {
            firstName = parts[0];
            middleName = parts[1];
            lastName = parts[2];
        } else {
            System.out.println("Invalid input");
            return;
        }
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);


    }
}
