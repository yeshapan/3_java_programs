//Basic Java program to demonstrate use of a single-line lambda expression

//define a functional interface (containing single abstract method)
interface Calculator{
    int calculate(int num1, int num2);
}

public class SingleLineLambda {
    public static void main(String[] args) {
        //lambda expression in single line (single statement) for addition of 2 integers
        Calculator addition = (a,b) -> a+b;
        //Using the lambda expression
        int sum=addition.calculate(23,34);
        //print result to console
        System.out.println("Sum of numbers: "+sum);
    }
}
