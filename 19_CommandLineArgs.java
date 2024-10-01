//Simple java program to demonstrate command line arguments

public class CommandLineArgs {
    public static void main(String[] args){
        //prints arguments passed in command line
        if (args.length>0){
            System.out.println("Command line arguments are: ");
            for(int i=0; i<args.length; i++){
                System.out.println("Argument "+(i+1)+" : "+ args[i]);
            }
        }
        else{
            //no argument passed in command line
            System.out.println("No command line argument found");
        }
    }
}

/* Run it in command prompt as:
javac CommandLineArgs.java
java CommandLineArgs Hello Java Lab 123
  */

/* Will give output as:
Argument 1: Hello
Argument 2: Java
Argument 3: Lab
Argument 4: 123
  */
