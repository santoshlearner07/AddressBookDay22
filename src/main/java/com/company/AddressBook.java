package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBook extends UserRelated {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<UserInfo> PersonDetails = new ArrayList<>();
    static HashMap<String, ArrayList<UserInfo>> hashmap = new HashMap<>();

    static AddressBook userDetails = new AddressBook();

    public void createAddressBook() {

        while (true) {
            System.out.println("Choose what you want to do: ");
            System.out.println("1.Create new address book.\n2.Edit existing address book.\n3.Display all address books.\n4.exit");
            int choose = sc.nextInt();

            if (choose == 4) {
                System.out.println("Exited");
                break;
            }

            switch (choose) {
                case 1:
                    System.out.println("Enter the name of address book: ");
                    String address_name = sc.next();

                    // condition to check for uniqueness of address book.
                    if (hashmap.containsKey(address_name)) {
                        System.out.println("Address book name exits, enter different name");
                        break;
                    }

                    ArrayList<UserInfo> new_address_book = new ArrayList<>();
                    PersonDetails = new_address_book;
                    while (true) {
                        System.out.println("Choose what you want to do: ");
                        System.out.println("1.Add details.\n2.Edit details.\n3.Delete contact.\n4.Exit");
                        int choose1 = sc.nextInt();
                        if (choose1 == 4) {
                            System.out.println("Exited");
                            break;
                        }
                        switch (choose1) {
                            case 1:
                                userDetails.addDetails();
                                break;
                            case 2:
                                userDetails.editDetails();
                                break;
                            case 3:
                                userDetails.deleteUser();
                                break;
                            default:
                                System.out.println("Choose valid option");
                                break;
                        }
                        hashmap.put(address_name, PersonDetails);
                        System.out.println(hashmap);
                    }
                    break;

                case 2:
                    System.out.println("Enter the name of address book: ");
                    String address_name_old = sc.next();

                    if (hashmap.containsKey(address_name_old)) {

                        ArrayList<UserInfo> old_address_book = new ArrayList<>();
                        PersonDetails = old_address_book;
                        PersonDetails = hashmap.get(address_name_old);
                        while (true) {
                            System.out.println("Choose what you want to do: ");
                            System.out.println("1.Add details.\n2.Edit details.\n3.Delete contact.\n4.Exit");
                            int choose1 = sc.nextInt();
                            if (choose1 == 4) {
                                System.out.println("Exited");
                                break;
                            }
                            switch (choose1) {
                                case 1:
                                    userDetails.addDetails();
                                    break;
                                case 2:
                                    userDetails.editDetails();
                                    break;
                                case 3:
                                    userDetails.deleteUser();
                                    break;
                                default:
                                    System.out.println("Choose valid option");
                                    break;
                            }
                            hashmap.put(address_name_old, PersonDetails);
                            System.out.println(hashmap);
                        }
                    } else {
                        System.out.println("Enter valid address book name");
                    }
                    break;

                case 3:
                    System.out.println(hashmap);
                    break;

                default:
                    System.out.println("Enter valid option");

            }

        }

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book program ");
        userDetails.createAddressBook();

    }

}