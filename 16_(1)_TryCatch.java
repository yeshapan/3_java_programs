//program to demonstrate simple try catch (exception handling)
public class TryCatch {
    public static void main(String args[]){
        int deno=0;
        int quotient;
        try{
            quotient=1234/deno;
            System.out.println("This line won't be printed because control will be passed to catch before executing this line since there is an exception in previous line");
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero error!"+e);
        }
        System.out.println("Outside try/catch blocks");
    }
    
}
