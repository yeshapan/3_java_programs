//an example asked in practical exam (Prof. Vishal Harith)
//write a program for a calculator (addition, subraction, multiplication, division). Use concept of interface, thread synchronisation and print output to a text file
//IMP NOTE: Debugging remaining for the following code

import java.io.FileWriter;
import java.io.IOException;

//functional interface
interface calculator_operation{
    double calculate (double num1, double num2);
}

//individual classes for individual arithmetic operations
class Addition implements calculator_operation{
    double add(double num1, double num2){
        return num1+num2;
    }
}

class Subtaction implements calculator_operation{
    double subtract(double num1, double num2){
        return num1-num2;
    }
}

class Multiplication implements calculator_operation{
    double multiply(double num1, double num2){
        return num1*num2;
    }
}

class Division implements calculator_operation{
    double divide(double num1, double num2){
        try{
            return num1/num2;
            }
        catch(ArithmeticException e){
            System.out.println("Division by zero error");
            }
    }
}

//Calculator class for synchronization of methods
class Calculator{
    //synchronized method to perform operations
    synchronized double perform_operation(calculator_operation operation, double num1, double num2){
        return operation.calculate(num1, num2);
    }
}

//Thread class for calculator operation, write result into file
Class CalculatorThread extends Thread{
    //objects of Calculator and interface calculator_operation
    private Calculator calc; //instance of Calculator class to provide synchronised method
    private calculator_operation opn;
    private double num1, num2;
    
    //parameterised constructor
    CalculatorThread(Calculator calc, calculator_operation opn, num1, num2){
        this.num1=num1;
        this.num2=num2;
        this.calc=calc;
        this.opn=opn;
    }
    
    //override run() method
    public void run(){
        double result=calc.perform_operation(opn, num1, num2);
        //System.out.println("Result of "+opn.getClass().getSimpleName()+" is "+result);
        write_to_file("Result of "+opn.getClass().getSimpleName()+" is "+result);
    }
    
    //define method to write to file
    private synchronized void write_to_file(String s){
        try(FileWriter filew=new FileWriter("exapmple.txt", true)){
           filew.write(s); 
        }
        catch(IOException e){
            System.out.println("Exception occured: "+e);
        }
    }
}

public class Main{
    public static void main(String[] args){
        //instantiate calculator class
        Calculator calc=new Calculator();
        
        //threads for each opn
        Thread addition_thread=new CalculatorThread(calc, new Addition(), 20,10);
        hread subtraction_thread=new CalculatorThread(calc, new Subtraction(), 20, 10);
        Thread multiplication_thread=new CalculatorThread(calc, new Multiplication(), 20, 10);
        Thread division_thread=new CalculatorThread(calc, new Divion(), 20,10);
        
        //start the threads
        addtiton_thread.start();
        subtraction_thread.start();
        multiplication_thread.start();
        division_thread.start();
        
        //join() methoid is used to pause execution of current thread until the thread on which join()is called has finished execution
        //wait for all threads to complete
        try{
            addition_thread.join();
            subtraction_therad.join();
            multiplication_thread.join();
            division_thread.join();
        }
        catch(InterruptedException e){
            System.out.println("Exception occured: "+e);
        }
        
        System.out.println("All threads have finishd execution and result printed to example.txt file");
    }
