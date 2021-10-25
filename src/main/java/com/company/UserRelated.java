package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class UserRelated {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<UserInfo> PersonDetails = new ArrayList<>();

    public void addDetails() {
        UserInfo UserDetails = new UserInfo();

        System.out.println("Enter First name: ");
        UserDetails.setFirstName(sc.next());
        System.out.println("Enter Last name: ");
        UserDetails.setLastName(sc.next());
        System.out.println("Enter Address: ");
        UserDetails.setAddress(sc.next());
        System.out.println("Enter your City: ");
        UserDetails.setCity(sc.next());
        System.out.println("Enter your State: ");
        UserDetails.setState(sc.next());
        System.out.println("Enter Zip code: ");
        UserDetails.setZip(sc.nextLong());
        System.out.println("Enter your Phone Number: ");
        UserDetails.setPhoneNumber(sc.nextLong());
        System.out.println("Enter your E-mail: ");
        UserDetails.setEmail(sc.next());

        PersonDetails.add(UserDetails);
        System.out.println(PersonDetails);

    }

    public void editDetails() {
        System.out.println("Confirm your first name to edit details: ");
        String confirm_name = sc.next();

        for (int i = 0; i < PersonDetails.size(); i++) {
            if (PersonDetails.get(i).getFirstName().equals(confirm_name)) {
                System.out.println("Select form below to change: ");
                System.out.println(
                        "\n1.First Name\n2.Last Name\n3.Address\n4.city\n5.State\n6.Zip\n7.Mobile number\n8.Email");
                int edit = sc.nextInt();

                switch (edit) {
                    case 1:
                        System.out.println("Enter new first name");
                        PersonDetails.get(i).setFirstName(sc.next());
                        break;
                    case 2:
                        System.out.println("Enter new Last name");
                        PersonDetails.get(i).setLastName(sc.next());
                        break;
                    case 3:
                        System.out.println("Enter new Address");
                        PersonDetails.get(i).setAddress(sc.next());
                        break;
                    case 4:
                        System.out.println("Enter new City");
                        PersonDetails.get(i).setCity(sc.next());
                        break;
                    case 5:
                        System.out.println("Enter new State");
                        PersonDetails.get(i).setState(sc.next());
                        break;
                    case 6:
                        System.out.println("Enter new Zip");
                        PersonDetails.get(i).setZip(sc.nextLong());
                        break;
                    case 7:
                        System.out.println("Enter new Mobile number");
                        PersonDetails.get(i).setPhoneNumber(sc.nextLong());
                        break;
                    case 8:
                        System.out.println("Enter new E-mail");
                        PersonDetails.get(i).setEmail(sc.next());
                        break;
                }
                System.out.println("Edited list is: ");
                System.out.println(PersonDetails);

            } else
                System.out.println("Enter valid First name");
        }

    }

    public void deleteUser() {
        System.out.println("Confirm your first name to delete contact");
        String confirmName = sc.next();
        for (int i = 0; i < PersonDetails.size(); i++) {

            if (PersonDetails.get(i).getFirstName().equals(confirmName)) {

                PersonDetails.remove(i);
            } else {
                System.out.println("Enter valid first name");
            }
        }
        System.out.println("User details deleted.");
        System.out.println(PersonDetails);

    }


}
