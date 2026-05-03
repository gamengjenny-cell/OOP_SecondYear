import java.util.Scanner;

// Step 1: Create the Student Class
class Student {
    // Attributes
    String name;
    int age;
    String course;

    // Method to display student details
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("-------------------");
    }
}

public class StudentModels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Creating the first student object
        Student student1 = new Student();
        System.out.println("Enter details for Student 1:");
        System.out.print("Name: ");
        student1.name = input.nextLine();
        System.out.print("Age: ");
        student1.age = input.nextInt();
        input.nextLine(); // Consume the leftover newline
        System.out.print("Course: ");
        student1.course = input.nextLine();

        System.out.println(); // Space for readability

        // Creating the second student object
        Student student2 = new Student();
        System.out.println("Enter details for Student 2:");
        System.out.print("Name: ");
        student2.name = input.nextLine();
        System.out.print("Age: ");
        student2.age = input.nextInt();
        input.nextLine(); // Consume the leftover newline
        System.out.print("Course: ");
        student2.course = input.nextLine();

        // Step 2: Display the Information
        System.out.println("\nStudent Information");
        System.out.println("-------------------");
        student1.displayInfo();
        student2.displayInfo();

        input.close();
    }
}