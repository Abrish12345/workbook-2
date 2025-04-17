package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservationApp {
    public static void main(String[] args) {
        //open scanner
        Scanner scanner = new Scanner(System.in);

        //Print a welcome message to the user
        System.out.println("Hello from the reservation app");

        //Ask the user for the name
        System.out.println("Please enter your name");

        System.out.print("First name: ");
        String firstName = scanner.nextLine().trim();

        System.out.print("Last name: ");
        String lastName = scanner.nextLine().trim();


        StringBuilder fullName = new StringBuilder();

        fullName.append(firstName).append(" ").append(lastName);
        ;


        // Ask the user for the date of coming

        System.out.println("What date will you be coming?");

        //collect the user feed back
        String dateInput = scanner.nextLine();

        //Convert the input string in to a localDate object

        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(dateInput, myFormat);

        //Ask the user for number of tickets
        System.out.println("How many tickets would you like?");

        //collect the user feedback

        int numTickets = scanner.nextInt();

        if (numTickets > 1) {
            System.out.print(numTickets + " Tickets");
        } else {
            System.out.print(numTickets + " Ticket");
        }
        System.out.print(" Reserved for " + date + " under " + fullName);

    }
}
