//Simple Java program to demonstrate the concept of interface
/*An interface in Java is a reference type that defines a set of abstract methods that a class must implement. 
It is like a contract: any class that implements an interface must provide implementations for all of its methods.*/

interface Animal{
    //defined abstract methods (no body)
    void sound();
    void eat();
}

//classes implementing the interface
class Dog implements Animal{
    //abstract functions defined within class
    public void sound(){
        System.out.println("Dog barks");
    }

    public void eat(){
        System.out.println("Dogs eats cookie");
    }
}

class Cat implements Animal{
    public void sound(){
        System.out.println("Cat meows");
    }

    public void eat(){
        System.out.println("Cat eats catnip");
    }
}

public class InterfaceDemo {
    public static void main(String[] args){
        Animal object1=new Dog();
        Animal object2=new Cat();
        object1.sound();
        object1.eat();
        object2.sound();
        object2.eat();
    }
    
}
