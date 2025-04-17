package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        //initiating new scanner

        Scanner scanner = new Scanner(System.in);
        //Ask user full name

        System.out.println("Please enter your name");
        System.out.println("First name: ");
        String firstName = scanner.nextLine().trim();

        System.out.println("Last name: ");
        String lastName = scanner.nextLine().trim();


        //Ask the user for billing street
        System.out.println("Please inter your billing street");
        String billingStreet= scanner.nextLine().trim();

        //Ask the user for billing city
        System.out.print("Please Enter your billing city");
        String billingCity=scanner.nextLine().trim();

        //Ask for billing state

        System.out.println("Enter your Billing State");
        String billingState=scanner.nextLine();

        //Ask user for Billing Zip code

        System.out.println("Please Enter your billing zip code");
        int billingZipCode = scanner.nextInt();
        scanner.nextLine();
        //------------------------------------------------------------
        //Ask the user for shipping street
        System.out.println("Please inter your shipping street");
        String shippingStreet= scanner.nextLine().trim();

        //Ask the user for shipping city
        System.out.println("Please inter you billing city");
        String shippingCity=scanner.nextLine().trim();

        //Ask the user for billing state

        System.out.println("Enter your Shipping State");
        String shippingState=scanner.nextLine();

        //Ask user for shipping Zip code

        System.out.println("Please inter your zip code");
        int shippingZip = scanner.nextInt();

        StringBuilder fullName= new StringBuilder();
        fullName.append(firstName).append(" ").append(lastName);
        StringBuilder billing= new StringBuilder();
        StringBuilder shipping= new StringBuilder();

        billing.append("Billing Address\n");
                billing.append("\n");
                billing.append(billingStreet);
                billing.append("\n");
                billing.append(billingCity);
                billing.append(", ");
                billing.append(billingState);
                billing.append(billingZipCode);

        shipping.append("Shipping Street\n").append("\n").append(shippingStreet).append("\n").append(shippingCity) .append(", ").append(shippingState).append(shippingZip);
        System.out.println(fullName);
        System.out.println(billing);
        System.out.println(shipping);


    }
}
