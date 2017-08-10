package com.ed;

import java.util.ArrayList;
import java.util.Scanner;


public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> contactList;
    private static Scanner scanner = new Scanner(System.in);

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contactList = new ArrayList<Contact>();
    }

    public boolean addContact(Contact contact){
        if (findContact(contact.getContactName())>=0){
            System.out.println("Contact is already on file");
            return false;
        }
        contactList.add(contact);
        return true;
        }

    private int findContact(Contact contact){
        return this.contactList.indexOf(contact);
    }

    private int findContact(String contactName){
        for (int i= 0 ; i < this.contactList.size();i++){
            Contact contact = this.contactList.get(i);
            if ( contact.getContactName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public boolean updateContact (Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);
        if (foundPosition <0){
            System.out.println(oldContact.getContactName()+ " was not found");
            return false;
        }
        this.contactList.set(foundPosition,newContact);
        System.out.println(oldContact.getContactName() + " was replaced with " + newContact.getContactName()  );
        return true;
    }

    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0 ){
            return contact.getContactName();
        }
        return null;
    }

    public boolean removeContact ( Contact contact){
        int foundPosition = findContact(contact);
        if (foundPosition <0){
            System.out.println(contact.getContactName()+ " was not found");
            return false;
        }
        this.contactList.remove(foundPosition);
        System.out.println(contact.getContactName() + " was deleted");
        return true;
    }

    public static String getName(){
        String contactName = null;
        System.out.println("Please Enter Contact Name : ");
        contactName = scanner.nextLine();
        return contactName;
    }

    public static String getNumber(){
        String contactNumber = null;
        System.out.println("Please Enter Contact Number : ");
        contactNumber = scanner.nextLine();
        return contactNumber;
    }

    public static void showMenu(){
        System.out.println("Enter Selection : ");
        int selection = scanner.nextInt();


    }

    public void printContacts(){

        for (int i = 0 ; i<this.contactList.size();i++){
            System.out.println(this.contactList.get(i).getContactName() + "\n");
            System.out.println(this.contactList.get(i).getContactNumber() + "\n");
        }
    }
}
