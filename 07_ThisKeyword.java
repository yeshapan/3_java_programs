//Simple Java program to demonstrate the use of "this" keyword

/*
this keyword can also be used to:
01) Invoke current class constructor
02) Invoke current class method
03) Return the current class object
04) Pass an argument in the method call
05) Pass an argument in the constructor call
*/

class Person {
    //data members
    String name;
    int age;
    // Constructor that uses 'this' keyword
    Person(String name, int age) {
        this.name = name; 
        this.age = age;   
    }
    // Method to display person's details
    void display() {
        System.out.println("Name: " + this.name); 
        System.out.println("Age: " + this.age);   
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Person person1 = new Person("Feyre", 21);
        Person person2 = new Person("Nesta", 26);
        person1.display();
        person2.display();
    }
}
