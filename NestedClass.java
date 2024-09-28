// Outer class
class OuterClass {
    private String outer_var = "Variable string in outer class hehe";

    // Nested class
    class InnerClass {
        void print_statement() {
            // Accessing outer class ka private variable
            System.out.println("Accessing from inner class: " + outer_var);
        }
    }

    void display_InnerClass() {
        // Creating an object of the nested inner class
        InnerClass inner_object = new InnerClass();
        inner_object.print_statement();
    }
}
public class NestedClass {
    public static void main(String[] args) {
        // Creating an instance of the outer class
        OuterClass outer_object = new OuterClass();
        outer_object.display_InnerClass();
    }
}
