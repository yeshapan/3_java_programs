//program to calculate factorial of a number (using for loop)

class FactorialLogic{
	//data members
	int fact=1;
	//member function
	void factorial_calculator(int num){
		//factorial is invalid for negative numbers
        if(num<0){
            System.err.println("Factorial not valid for negative numbers! Exiting..");
        }
		//factorial of zero is one
        else if(num==0){
            System.out.println("Factorial of zero is one!!");
        }
		else if(num>=1){
			for(int x=num; x>=1; x=x-1){
				fact=fact*x;
			}
			System.out.println("Factorial of " +num+" is "+fact);
			
		}
	}
}

public class Factorial{
	public static void main(String args[]){
		FactorialLogic object1= new FactorialLogic();
		object1.factorial_calculator(-2);
	}
}
