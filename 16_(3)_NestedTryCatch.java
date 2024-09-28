public class NestedTryCatch{
    public static void main(String args[]){
    try{
        try{
            //following will cause array index out of bound error
            int c[]={1};
            c[12]=34;
        } 
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound" + e);
        }
        //following will cause arithmetic exception if no arguments are passed in command line
        int deno = args.length;
        System.out.println("deno= "+ deno);
        int quotient=1234/deno;
    }
    catch(ArithmeticException e){
        System.out.println("Division by zero!"+e);
    }
       
    }
    
}
