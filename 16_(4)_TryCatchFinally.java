//Simple Java program to demonstrate the keywords try, catch, finally (exception handling)
public class TryCatchFinally {
    public static void main(String args[]){
        try{
            int deno=0;
            int quotient=1234/deno;
        }
        catch(ArithmeticException e){
            System.out.println("Exception caught: "+e);
        }
        finally{
            System.out.println("Exiting program...");
        }

    }
}
