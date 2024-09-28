class Student {
    String name;
    int age;

    // Default Constructor
    Student() {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("Default Constructor called");
    }

    // Parameterized Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor called");
    }

    // Copy Constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
        System.out.println("Copy Constructor called");
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class ConstructorTypes {
    public static void main(String[] args) {
        // Using Default Constructor
        Student student1 = new Student();
        student1.display();

        // Using Parameterized Constructor
        Student student2 = new Student("Nesta", 26);
        student2.display();

        // Using Copy Constructor
        Student student3 = new Student(student2);
        student3.display();
    }
}
