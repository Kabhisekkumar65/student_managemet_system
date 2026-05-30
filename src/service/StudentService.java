package service;

import java.util.ArrayList;
import java.util.Scanner;

import model.Student;

public class StudentService {

    ArrayList<Student> list = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    // Add Student
    public void addStudent() {

        System.out.println("===== Add Student =====");

        System.out.print("Enter Student ID : ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Student Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Student Age : ");
        int age = sc.nextInt();

        // Creating Object
        Student s = new Student(id, name, age);

        // Adding into ArrayList
        list.add(s);

        System.out.println("Student Added Successfully");
    }

    // Display All Students
    public void displayStudents() {

        System.out.println("===== Student Details =====");

        if (list.isEmpty()) {

            System.out.println("No Students Found");

        } else {

            for (Student s : list) {

                s.display();
            }
        }
    }

    // Search Student
    public void searchStudent() {

        System.out.print("Enter Student ID to Search : ");

        int searchId = sc.nextInt();

        boolean found = false;

        for (Student s : list) {

            if (s.getId() == searchId) {

                s.display();

                found = true;

                break;
            }
        }

        if (!found) {

            System.out.println("Student Not Found");
        }
    }

    // Update Student
    public void updateStudent() {

        System.out.print("Enter Student ID to Update : ");

        int updateId = sc.nextInt();

        boolean found = false;

        for (Student s : list) {

            if (s.getId() == updateId) {

                sc.nextLine();

                System.out.print("Enter New Name : ");
                String newName = sc.nextLine();

                System.out.print("Enter New Age : ");
                int newAge = sc.nextInt();

                s.setName(newName);
                s.setAge(newAge);

                System.out.println("Student Updated Successfully");

                found = true;

                break;
            }
        }

        if (!found) {

            System.out.println("Student Not Found");
        }
    }

    // Delete Student
    public void deleteStudent() {

        System.out.print("Enter Student ID to Delete : ");

        int deleteId = sc.nextInt();

        boolean found = false;

        for (Student s : list) {

            if (s.getId() == deleteId) {

                list.remove(s);

                System.out.println("Student Deleted Successfully");

                found = true;

                break;
            }
        }

        if (!found) {

            System.out.println("Student Not Found");
        }
    }
}
