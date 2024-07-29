//simple program to print hello world in java

class Hello{
    public static void main(String args[]){
        System.out.println("Hello World");
    }
}

/*EXPLANATION
*System is a built-in Java class that contains useful members, such as out, which is short for "output"
*The println() method, short for "print line", is used to print a value to the screen (or a file)
*/

/*NOTE 
*the class containing main function should have same name as file name (Hello in this case)
*this is because since execution of program starts with main, it helps compiler locate where main function is (and that class should be declared in public only)
*A class should always start with an uppercase first letter.
*Java is case-sensitive
*if file name is different from the class containing main, error will occur
*/
