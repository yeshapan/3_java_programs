//Java program to demonstrate method overloading

class AdditionLogic{
    void add(int num1, int num2){
        int sum=num1+num2;
        System.out.println("Sum of"+num1+" and "+num2+" is "+sum);
    }
    void add(double num1, double num2){
        double sum=num1+num2;
        System.out.println("Sum of"+num1+" and "+num2+" is "+sum);
    }
}


public class AdditionCalculator {
    public static void main(String args[]) {
        AdditionLogic object1= new AdditionLogic();
        AdditionLogic object2= new AdditionLogic(); 
        object1.add(2,3);
        object2.add(2.3,3.2);      
    }
}

