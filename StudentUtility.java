
class Student {
    // Private attributes (Encapsulation)
    private String name;
    private int age;
    private double grade;

    // Part 2: Create Methods
    
    // Assigns values to the student attributes
    public void setDetails(String n, int a, double g) {
        this.name = n;
        this.age = a;
        this.grade = g;
    }

    // Returns the student’s name
    public String getName() {
        return name;
    }

    // Returns true if the grade is 75 or higher
    public boolean isPassed() {
        return grade >= 75.0;
    }

    // Displays all student details and pass/fail status
    public void displayInfo() {
        System.out.println("--- Student Record ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Status: " + (isPassed() ? "PASSED" : "FAILED"));
        System.out.println("----------------------");
    }
}

// Part 3: Create the Main Class
public class StudentUtility {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student();

        // Call setDetails()
        // Let's assume these are the results of a hard-earned semester
        student.setDetails("Glenn", 19, 88.5);

        // Call getName() specifically
        System.out.println("Accessing record for: " + student.getName());
        System.out.println();

        // Call displayInfo() to see everything at once
        student.displayInfo();

        // Testing the logic with a failing grade check
        Student student2 = new Student();
        student2.setDetails("Jasper", 20, 72.0);
        student2.displayInfo();
    }
}