package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    ArrayList<UserDetails> PersonDetails = new ArrayList<>();

    public void addUserDetails() {
        System.out.println("Add User Information -> ");
        UserDetails userDetails = new UserDetails();

        System.out.println("Enter First name: ");
        userDetails.setFirstName(sc.next());
        System.out.println("Enter Last name: ");
        userDetails.setLastName(sc.next());
        System.out.println("Enter Address: ");
        userDetails.setAddress(sc.next());
        System.out.println("Enter your City: ");
        userDetails.setCity(sc.next());
        System.out.println("Enter your State: ");
        userDetails.setState(sc.next());
        System.out.println("Enter Zip code: ");
        userDetails.setZip(sc.next());
        System.out.println("Enter your Phone Number: ");
        userDetails.setPhoneNumber(sc.next());
        System.out.println("Enter your E-mail: ");
        userDetails.setEmail(sc.next());

        System.out.println(PersonDetails.add(userDetails));
        System.out.println(" Added " + PersonDetails);
    }

    public void editUserDetails() {
        Scanner pNum = new Scanner(System.in);
        System.out.println("First add details to edit details, if added ignore message");
        System.out.println("Confirm phone number to edit");
        String confirmNumber = pNum.next();

        for (int i = 0; i < PersonDetails.size(); i++) {
            if (PersonDetails.get(i).getPhoneNumber().equals(confirmNumber)) {
                System.out.println("What do You want to change" +
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
                        PersonDetails.get(i).setZip(sc.next());
                        break;
                    case 7:
                        System.out.println("Enter new Mobile number");
                        PersonDetails.get(i).setPhoneNumber(sc.next());
                        break;
                    case 8:
                        System.out.println("Enter new E-mail");
                        PersonDetails.get(i).setEmail(sc.next());
                        break;
                }
                System.out.println("Edited list is: ");
                System.out.println(PersonDetails);
            } else {
                System.out.println("Enter Valid Phone number -> ");
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("What do you want ? " +
                    "1->Add Details \n 2-> Edit Details");
            int select = sc.nextInt();
            switch (select) {
                case 1:
                    addressBook.addUserDetails();
                    break;
                case 2:
                    addressBook.editUserDetails();
                    break;
                default:
                    System.out.println("Choose valid option");
                    break;
            }
        }
    }
}
class UserDetails {
    private String firstName;
    private String lastName;
    private String address;
    private String eMail;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return eMail;
    }

    public void setEmail(String eMail) {
        this.eMail = eMail;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}