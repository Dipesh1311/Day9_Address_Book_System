package com.bridgelabz.addressbooksystem;

import java.util.Scanner;

public class AddressBookMain {

    public static Scanner scannerObject = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("---------- Welcome To Address Book Pr1ogram!! ----------");
        AddressBookDirectory addressBookDirectory = new AddressBookDirectory();
        addressBookDirectory.operationDirectory();
    }

}
