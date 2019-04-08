package com.mbuszek;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    // constructor

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        // call method asking for department - return department
        this.department = setDepartment();
        System.out.println("Departemnt " + this.department);
    }

    // ask for department

    private String setDepartment() {
        System.out.println("DEPARTEMNT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter departement code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3)
            return "acct";
        else {
            return "";
        }
    }

    // generate random password

    // set mailbox capacity

    // set alternate mail

    // change password


}
