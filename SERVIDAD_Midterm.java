// Base class representing a person
class Person {
    protected String name; 
    protected int age;    

    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Methods to display person's information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Representing a student
class Student extends Person {
    private String studentID;  
    private String course;      
    private int units;          
    private static final int FEE_PER_UNIT = 1000; 

    // Constructor to initialize student's fields
    public Student(String name, int age, String studentID, String course, int units) {
        super(name, age); 
        this.studentID = studentID;
        this.course = course;
        this.units = units;
    }

    // Methods to calculate total fees for the student
    public double calculateFees() {
        return units * FEE_PER_UNIT;
    }

    // Override displayInfo to include student-specific information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the base class method
        System.out.printf("Student ID: %s, Course: %s, Units: %d, Total Fee: %.2f%n", 
                          studentID, course, units, calculateFees());
    }
}
// Representing an instructor
class Instructor extends Person {
    private String employeeID; 
    private String department; 
    private double salary;      
    // Constructor to initialize instructor's fields
    public Instructor(String name, int age, String employeeID, String department, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Override displayInfo to include instructor-specific information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the base class method
        System.out.printf("Employee ID: %s, Department: %s, Salary: %.2f%n", 
                          employeeID, department, salary);
    }
}
public class EXAM {

    // Method to demonstrate polymorphism
    public static void printDetails(Person p) {
        p.displayInfo(); 
    }

    public static void main(String[] args) {
        // Two Student objects
        Student student1 = new Student(" Ivan", 18, "231001732", "Computer Engineering", 15);
        Student student2 = new Student("Angela ", 19, "02000307940", "Hospitality Management", 12);

        // Two Instructor objects
        Instructor instructor1 = new Instructor("Ma'am Tanya", 22, "73137183719", "CEA", 75000);
        Instructor instructor2 = new Instructor("Ma'am Sarahlyn", 30, "163712631", "CEA", 85000);

        // Print information for each students
        System.out.println("Student Information:");
        // Calls displayInfo for student1
        printDetails(student1);
        // Calls displayInfo for student2
        printDetails(student2);

        // Print information for each instructors
        System.out.println("\nInstructor Information:");
        // Calls displayInfo for instructor1
        printDetails(instructor1); 
        // Calls displayInfo for instructor2
        printDetails(instructor2);
    }
}