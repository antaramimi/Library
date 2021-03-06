package com.company.mylibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Library {

    List<Student> studentList = new ArrayList<>();
    List<Book> bookList = new ArrayList<>();


    public void addStudent() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name of student: ");
        String name = s.nextLine();

        if (Character.isLowerCase(name.charAt(0))) {
            System.out.println("Please add first character in uppercase");
            return;
        }
        System.out.println("Enter the roll no for student: ");
        int rollno = s.nextInt();

        Student student = new Student();
        student.name = name;
        student.rollNo = rollno;
        studentList.add(student);
        System.out.println("Display number of student: " + studentList.size());
        }




    public void showStudents() {
        for (int i=0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).name);
        }
    }

    public void addBook() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Name of the book");
        String a = s.nextLine();
        System.out.println("Enter the Name of the author");
        String b = s.nextLine();
        System.out.println("Enter the serialNo of the book");
        int c = s.nextInt();

        boolean isPresent = checkDublicateBook(a);

        if (!isPresent) {
            Book book = new Book();
            book.author = a;
            book.name = b;
            book.serialNo = c;
            bookList.add(book);
        }
    }

    public void showbook() {
        int i;
        for (i = 0; i < bookList.size(); i++) {

            System.out.println(bookList.get(0).author);

        }
    }


    public boolean checkDublicateBook(String n){

        for(int i=0;i < bookList.size(); i++){
          if(bookList.get(i).name.equals(n)){
              System.out.println("Book is already added");
              return true;
          }
        }
        return false;
    }


    public static void main(String[] a) {
        Library l = new Library();
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("==================");
            System.out.println("Enter option: ");
            System.out.println("1. Add Student:");
            System.out.println("2. Add Book");
            System.out.println("3. Show Students");
            System.out.println("4. checkDuplicate Books");
            System.out.println("5. Show Books");
            System.out.println("6. Exit: ");
            System.out.println("==================");

            int choice = s.nextInt();

            if (choice == 1) {
                l.addStudent();
            } else if (choice == 2) {
                l.addBook();
            } else if (choice == 3) {
                l.showStudents();
            } else if (choice == 4) {
                l.checkDublicateBook("n");
            }else if (choice == 5) {
                l.showbook();
            } else {
                break;
            }
        }
    }


}
