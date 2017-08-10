package com.ed;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilephone = new MobilePhone("07818411230");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {

            System.out.println("Enter action: 6 to show actions");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("shutting down");
                    quit = true;
                    break;
                case 1:
                    mobilephone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }

        }

    }

    private static void addNewContact(){
        System.out.println("Enter New contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Phone Number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.addContact(name, phone);
        if ( mobilephone.addContact(newContact)){
            System.out.println(" New contact " + name + " number : " + phone + " added");
        }
    }

    private static void startPhone(){
        System.out.println("Starting Phone");
    }

    private static void printActions(){
        System.out.println("\nAvailable Actions\npress");
        System.out.println("0 - To shutdown\n1 - to print contacts\n2 - to add a new contact\n3 - to update an existing contact\n4 - to remove an existing contact\n5 - to query if a contact exists\n6 - to print list of actions");
        System.out.println("Choose action");
    }

}



