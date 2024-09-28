
class AccessModifiersDefinition {
    public String public_var = "Public String";         // Accessible from anywhere
    protected String protected_var = "Protected String "; // Accessible within the same package and subclasses
    String default_var = "Default String";               // Accessible within the same package
    private String private_var = "Private String";       // Accessible only within this class

    public void showVariables() {
        System.out.println("Inside the class:");
        System.out.println(public_var);
        System.out.println(protected_var);
        System.out.println(default_var);
        System.out.println(private_var);
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        AccessModifiersDefinition obj = new AccessModifiersDefinition();

        // Accessing variables from outside the class
        System.out.println(" ");
        System.out.println("Outside the class:");
        System.out.println(obj.public_var);    
        System.out.println(obj.protected_var); 
        System.out.println(obj.default_var);   
        // System.out.println(obj.privateVar); // Not accessible outside class

        obj.showVariables(); // Accessing all variables through a public method
    }
}
