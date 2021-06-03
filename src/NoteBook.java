import comparators.UserComparatorAge;
import comparators.UserComparatorFirstName;
import comparators.UserComparatorLastName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NoteBook {

    final int SORT_BY_FIRST_NAME = 1;
    final int SORT_BY_LAST_NAME = 2;
    final int SORT_BY_FIRST_AND_LAST_NAME = 3;
    final int SORT_BY_NAME_AND_AGE = 4;
    final int ADD_NEW_USER = 5;
    final int EXIT = 0;

    private Scanner scStr = new Scanner(System.in);
    private Scanner scInt = new Scanner(System.in);

    ArrayList<User> allUsers = Db_Users.allUsers();

    public void go() {
        greeting();
        existUsers();
        choice();
    }

    public void greeting() {
        System.out.println("Note Book - ver 1.1".toUpperCase() + "\n");
    }

    public void existUsers() {
        printAllUsers();
    }

    public void printChoice() {
        System.out.println("Make your choice:");
        System.out.println("1 Sort by name");
        System.out.println("2 Sort by last name");
        System.out.println("3 Sort by first and last name");
        System.out.println("4 Sort by name and age");
        System.out.println("5 Add new User");
        System.out.println("0 Exit");
    }

    public void choice() {
        printChoice();
        int choice = scInt.nextInt();
        switch (choice) {
            case SORT_BY_FIRST_NAME: {
                System.out.println("Sorting all Users done by name:");
                Collections.sort(allUsers, new UserComparatorFirstName());
                printAllUsers();
                choice();
            }
            case SORT_BY_LAST_NAME: {
                System.out.println("Sorting all Users done by last name:");
                Collections.sort(allUsers, new UserComparatorLastName());
                printAllUsers();
                choice();
            }
            case SORT_BY_FIRST_AND_LAST_NAME: {
                System.out.println("Sorting all Users done by first and last name:");
                allUsers.sort(new UserComparatorFirstName().thenComparing(new UserComparatorLastName()));
                printAllUsers();
                choice();
            }
            case SORT_BY_NAME_AND_AGE: {
                System.out.println("Sorting all Users done by name and age:");
                allUsers.sort(new UserComparatorLastName().thenComparing(new UserComparatorAge()));
                printAllUsers();
                choice();
            }
            case ADD_NEW_USER: {
                addNewUser();
                System.out.println("User added successfully!\n");
                printAllUsers();
                choice();
            }
            case EXIT: {
                System.out.println("exit".toUpperCase());
                System.exit(0);
            }
        }
    }

    public void addNewUser() {
        String firstName;
        String lastName;
        int age;
        String mail;
        int phone;

        System.out.println("Add new User");
        System.out.println();
        System.out.println("Enter First Name:");
        firstName = scStr.nextLine();
        System.out.println("Enter Last Name:");
        lastName = scStr.nextLine();
        System.out.println("Enter Age:");
        age = scInt.nextInt();
        System.out.println("Enter Mail:");
        mail = scStr.nextLine();
        System.out.println("Enter Phone:");
        phone = scInt.nextInt();
        Db_Users.addUser(firstName, lastName, age, mail, phone);
    }

    public void printAllUsers() {
        System.out.println("The notebook has the following users:");
        for (User users : allUsers) {
            System.out.println(users.toString());
        }
        System.out.println();
    }
}