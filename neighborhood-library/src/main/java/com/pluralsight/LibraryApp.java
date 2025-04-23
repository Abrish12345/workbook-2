package com.pluralsight;

import java.util.Scanner;

public class LibraryApp {
    static Book[] theBooks = {
            new Book(1, "12345", "Ready Player 1"),
            new Book(2, "23456", "Jurassic park"),
            new Book(3, "789524", "Alice in Wonderland"),
            new Book(4, "633578", "To kill a Mocking Bird"),
            new Book(5, "99955585", "Ready Player 2"),

    };
    static Scanner theScanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean appRunning = true;
        while (appRunning) {
            showMainMenu();  //Call the showmainmenu method inside the loop
            int choice = theScanner.nextInt();  // Get the users choice

            switch (choice) {
                case 1:
                    showAvailableBooks();  // just show available books

                    //Ask the user which book they want choice
                    System.out.println("Enter the number of the book you'd like to checkout,or -1 to go back:");
                    int bookchoice = theScanner.nextInt();


                    //check if the book choise is valid and checkout the book
                    if (bookchoice < theBooks.length && bookchoice >= 0) {
                        theScanner.nextLine(); //Eat the new line
                        System.out.println("What is your name?");
                        String userName = theScanner.nextLine(); //get the user name

                        //Checkout the book
                        theBooks[bookchoice].checkOut(userName);

                    } else if (bookchoice == -1) {
                        // go back to the main menu
                        continue;


                    } else {
                        System.out.println("Invalid user name");
                    }

                    break;


                case 2:
                    //checkout book (case 1)
                    break;
                case 3:
                    //show checked out books
                    showCheckedOutBooks();
                    break;
                case 4:  //exist
                    appRunning = false;
                    System.out.println("Thank you for using the Neighborhood Library. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choise. please try again.");
            }
        }
    }


    private static void showMainMenu() {
        System.out.println("Welcome to Neighborhood Library!");
        System.out.println("1. Show Avilable books");
        System.out.println("2. Checkout a Book");
        System.out.println("3. Show Checked out books");
        System.out.println("4. exit");

    }

    private static void showAvailableBooks() {
        System.out.println("\nAvailable Books");
        for (int i = 0; i < theBooks.length; i++) {
            if (!theBooks[i].isCheckedOut()) {
                System.out.println(i + ". " + theBooks[i].getTitle());
            }

        }

    }

    private static void showCheckedOutBooks() {
        System.out.println("\nChecked-Out Books:");
        for (int i = 0; i < theBooks.length; i++) {
            if (theBooks[i].isCheckedOut()) {
                System.out.println("ID: " + theBooks[i].getId() + ", Title: " + theBooks[i].getTitle() + ", Checked out by: " + theBooks[i].getCheckedOutTo());

            }
        }
    }

}

