//Java program to demonstrate the use of final keyword
/*
The final keyword can be applied to variables, methods, and classes to restrict their modification:
1) Final variable: Once assigned, a final variable cannot be changed.
2) Final method: A final method cannot be overridden by subclasses.
3) Final class: A final class cannot be subclassed.
 */

 final class FinalClass{
    final int NUM1=100;
    final void final_method(){
        System.out.println("This is a final method");
    }
    void display_message(){
        System.out.println("Value of final variable NUM1 is: " + NUM1);
    }
 }

 public class FinalKeyword{
    public static void main(String args[]){
        FinalClass object1= new FinalClass();
        object1.final_method();
        object1.display_message();
    }
 }

/*OUTPUT:
This is a final method
Value of final variable NUM1 is: 100
*/
