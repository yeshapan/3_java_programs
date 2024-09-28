public class TryWithMultipleCatches {
    public static void main(String args[]){
        try{
            //following will cause arithmetic exception
            int deno = 0;
            int quotient=1234/deno;

            //following will cause array index out of bound error
            //it will not be run because control will shift to catch block when above code raises exception
                int c[]={1};
                c[12]=34;
            } 
                       
        
        catch(ArithmeticException e){
            System.out.println("Division by zero!"+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound" + e);
        }
           
        }
}
