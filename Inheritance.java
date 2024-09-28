class OOPJ {
    // Defining data members
    public String public_str = "Public: Welcome to OOPJ class";
    protected String protected_str = "Protected: Vishal Sir teaches OOPJ";
    String default_str = "Default: OOPJ classes are super fun!";
    private String private_str = "Private: cannot be inherited oops";

    // Member function to display variables
    void display_base() {
        System.out.println("Data members of base class:");
        System.out.println(public_str);
        System.out.println(protected_str);
        System.out.println(default_str);
        System.out.println(private_str);
        
    }
}

class OOPJLab extends OOPJ {
    void print_derived() {
        System.out.println("We're inside the derived class:");
        System.out.println(public_str);
        // Protected and default members are also accessible in derived class
        System.out.println(protected_str);
        System.out.println(default_str);
        // Private members cannot be accessed here
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Create an object of the derived class
        OOPJLab obj1 = new OOPJLab();

        // Call the methods to demonstrate inheritance
        obj1.display_base();
        obj1.print_derived();
        
    }
}
