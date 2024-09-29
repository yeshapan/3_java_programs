//simple Java program to demonstrate custom or user-defined exception handling

//user-defined class defined as a child class of built-in class Exception in Java
class UnderAgeException extends Exception{
    //constructor to print message
    UnderAgeException(String message){
        super(message);
        System.out.println("You cannot vote yet! Come back when you turn 18");
    }
}
//class containing main method
public class CustomException {
    public static void main(String args[]){
        int age=15;
        try{
            if(age<18){
                throw new UnderAgeException("Age less than 18");
            }
            else{
                System.out.println("You are eligible to vote");
            }
        }
        catch(UnderAgeException e){
            System.out.println("Exception caught: "+ e);
        }
    }
}
