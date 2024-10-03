//Java program to demonstrate some basic string operations

class StringOperationsDefinition{
    //length() returns the length of the string
    void strlen(String str){
        System.out.println("Length of string "+str+" is: "+str.length());
    }
    //substring(start_index,end_index) reutrns a substring from start to end index
    void substr(String str, int start_index, int end_index){
        System.out.println("Substring from index "+start_index+" to "+end_index+" is: "+str.substring(start_index,end_index));
    }

    //toUpperCase() converts all characters to uppercase
    void upper(String str){
        System.out.println(str.toUpperCase());
    }
    
    //toLowerCase() converts all characters to lower case
    void lower(String str){
        System.out.println(str.toLowerCase());
    }

    //contains() checks if string contains given specific characters
    void check_contains(String str, String substr){
        System.out.println(str.contains(substr));
    }

    //equals() compares two strings for equality
    void check_equal(String str, String str2){
        System.out.println("Checking equality for strings: "+str+" and "+str2);
        System.out.print(str.equals(str2));
    }
}
public class StringFunctions {
    public static void main(String args[]){
        StringOperationsDefinition object1= new StringOperationsDefinition();
        object1.strlen("Hello World");
        object1.substr("Hello World", 2, 7);
        object1.upper("Hello World");
        object1.lower("Hello World");
        object1.check_contains("Hello", "ell");
        object1.check_equal("Hello","hey");
    }
}
