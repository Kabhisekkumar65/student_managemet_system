package main;

import java.util.Scanner;

import service.StudentService;
import User.Admin;
import User.Normalrole;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentService service = new StudentService();

        // Objects
        Admin admin = new Admin("admin");

        Normalrole user = new Normalrole("user");

        // Default Passwords
        String adminPassword = "admin123";

        String userPassword = "user123";

        int loginChoice;
        int choice;

        do {

            // Login Menu
            System.out.println("\n===== Login Menu =====");

            System.out.println("1. Admin Login");
            System.out.println("2. User Login");
            System.out.println("3. Exit");

            System.out.print("Enter Your Choice : ");

            loginChoice = sc.nextInt();

            sc.nextLine();

            switch (loginChoice) {

                // Admin Login
                case 1:

                    System.out.print("Enter Admin Name : ");

                    String enteredAdminName = sc.nextLine();

                    System.out.print("Enter Admin Password : ");

                    String enteredAdminPassword = sc.nextLine();

                    // Checking Admin Credentials
                    if (enteredAdminName.equals("admin")
                            && enteredAdminPassword.equals(adminPassword)) {

                        admin.Role();

                        do {

                            System.out.println("\n===== Admin Menu =====");

                            System.out.println("1. Add Student");
                            System.out.println("2. Display Students");
                            System.out.println("3. Search Student");
                            System.out.println("4. Update Student");
                            System.out.println("5. Delete Student");
                            System.out.println("6. Logout");

                            System.out.print("Enter Choice : ");

                            choice = sc.nextInt();

                            switch (choice) {

                                case 1:

                                    service.addStudent();

                                    break;

                                case 2:

                                    service.displayStudents();

                                    break;

                                case 3:

                                    service.searchStudent();

                                    break;

                                case 4:

                                    service.updateStudent();

                                    break;

                                case 5:

                                    service.deleteStudent();

                                    break;

                                case 6:

                                    System.out.println("Admin Logout Successfully");

                                    break;

                                default:

                                    System.out.println("Invalid Choice");
                            }

                        } 
                        while (choice != 6);

                    } else {

                        System.out.println("Invalid Admin Credentials");
                    }

                    break;

                // User Login
                case 2:

                    System.out.print("Enter User Name : ");

                    String enteredUserName = sc.nextLine();

                    System.out.print("Enter User Password : ");

                    String enteredUserPassword = sc.nextLine();

                    // Checking User Credentials
                    if (enteredUserName.equals("user")
                            && enteredUserPassword.equals(userPassword)) {

                        user.Role();

                        do {

                            System.out.println("\n===== User Menu =====");

                            System.out.println("1. Display Students");
                            System.out.println("2. Search Student");
                            System.out.println("3. Logout");

                            System.out.print("Enter Choice : ");

                            choice = sc.nextInt();

                            switch (choice) {

                                case 1:

                                    service.displayStudents();

                                    break;

                                case 2:

                                    service.searchStudent();

                                    break;

                                case 3:

                                    System.out.println("User Logout Successfully");

                                    break;

                                default:

                                    System.out.println("Invalid Choice");
                            }

                        } while (choice != 3);

                    } else {

                        System.out.println("Invalid User Credentials");
                    }

                    break;

                // Exit
                case 3:

                    System.out.println("Thank You");

                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (loginChoice != 3);

        sc.close();
    }
}