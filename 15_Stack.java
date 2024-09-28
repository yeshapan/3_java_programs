//program to demonstrate stack operations in Java
import java.util.Stack;

class StackOperations{
    //data members
    protected int maxsize;
    protected int top;
    protected int stackarr[];

    //constructor to initialize stack
    public StackOperations(int size) {
        maxsize=size;
        stackarr=new int[maxsize];
        top=-1; //initializes empty stack array
    }

    //method to push element into stack
    void push(int num){
        if(top==maxsize-1){
            System.out.println("Overflow!! Stack is already full!!");
        }
        else{
            stackarr[++top]=num;
            System.out.println("Pushed value "+num+" onto the stack");
        }
    }

    //method to pop element from the stack
    int pop(){
        if(top==-1){
            System.out.println("Underflow!! Stack is empty nothing to pop!");
            return -1; //to indicate error
        }
        else{
            int num=stackarr[top--];
            System.out.println("Popped value is "+num);
            return num;
        }
    }

    //method to peek (top element of stack)
    int peek(){
        if(top==-1){
            System.out.println("Stack is empty! nothing to peek");
            return -1; //indicate error
        }
        else{
            int num=stackarr[top];
            System.out.println("Element at top of stack is: "+num);
            return num;
        }
    }
      
}

public class Stack{
    public static void main(String[] args) {
        //create an object called stack1
        StackOperations stack1= new StackOperations(5);
        stack1.push(10);
        stack1.push(20);
        stack1.peek();
        stack1.pop();
        stack1.push(50);
        stack1.peek();

    }
}
