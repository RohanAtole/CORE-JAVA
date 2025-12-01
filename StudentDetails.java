package OOPS;//This is my mistake
// Package name - all lowercase
//package com.school.management;

// Interface name - PascalCase (Adjective or Noun)
interface Payable {
    void processPayment(double amount);
}

// Class name - PascalCase (Noun)
public class StudentDetails implements Payable {

    // Constant name - UPPERCASE_WITH_UNDERSCORES
    public static final double MAX_FEES = 50000.00;

    // Variable names - camelCase
    private int studentId;
    private String studentName;
    private double feesPaid;

    // Constructor name - Same as class (PascalCase)
    public StudentDetails(int studentId, String studentName, double feesPaid) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.feesPaid = feesPaid;
    }

    // Method name - camelCase (verb phrase)
    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Fees Paid: " + feesPaid);
    }

    // Interface method implementation with camelCase
    @Override
    public void processPayment(double amount) {
        System.out.println(studentName + " paid: " + amount);
    }

    // Main method - camelCase
    public static void main(String[] args) {

        // Object name (variable) - camelCase
        StudentDetails firstStudent = new StudentDetails(101, "Rohan", 20000.00);

        firstStudent.displayStudentInfo();    // Method call
        firstStudent.processPayment(15000.00);  // Interface method call

        System.out.println("Maximum Fees Allowed: " + MAX_FEES);
    }
}
