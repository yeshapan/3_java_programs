class Parent {
    Parent() {
        System.out.println("Parent class constructor called");
    }
}

class Child extends Parent {
    Child() {
        super(); // Calls the constructor of the Parent class
        System.out.println("Child class constructor called");
    }
}

public class Main {
    public static void main(String[] args) {
        Child childObject = new Child();
    }
}
