package com.example.customer;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Customer> customers = new ArrayList<>();

        for (int i = 1; i <= 2; i++) {

            System.out.println("Enter information for Customer " + i);

            System.out.print("First name: ");
            String firstName = scanner.nextLine();

            System.out.print("Last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            Customer customer =
                    new Customer(firstName, lastName, email);

            customers.add(customer);

            System.out.println();
        }

        System.out.println("Stored Customers:");

        for (Customer customer : customers) {
            System.out.println(customer);
        }

        scanner.close();
    }
}
