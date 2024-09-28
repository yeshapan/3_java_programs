class FibonacciPrinter{
    // Method to print Fibonacci series up to a specified number of terms
    public void printFibonacciSeries(int terms){
        if (terms <= 0) {
            System.out.println("Number of terms must be positive.");
            return;
        }

        long firstTerm = 0;
        long secondTerm = 1;

        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= terms; i++) {
            System.out.print(firstTerm + " ");

            long nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println();
    }
}

// Main class
public class Fibonacci {
    public static void main(String[] args) {
        FibonacciPrinter object1 = new FibonacciPrinter();
        object1.printFibonacciSeries(5);
        FibonacciPrinter object2 = new FibonacciPrinter();
        object2.printFibonacciSeries(0);
    }
}
