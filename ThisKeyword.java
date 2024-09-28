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
