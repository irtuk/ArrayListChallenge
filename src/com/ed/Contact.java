package com.ed;


public class Contact {

    private String contactName;
    private String contactNumber;

    public Contact(String contactName, String contactNumber) {
        this.contactName = contactName;
        this.contactNumber = contactNumber;
    }

    public Contact(String contactName) {
        this.contactName = contactName;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public static Contact addContact(String contactName, String contactNumber){
        return new Contact(contactName, contactNumber);
    }

    public static void deleteContact(String contactName){

    }

    public static void modifyContact(String contactName){

    }

    public static void findContact(String contactName){

    }

    public static void listContacts(){

    }



}
