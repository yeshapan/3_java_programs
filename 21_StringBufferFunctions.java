//Simple Java program to demonstrate basic StringBuffer functions
/* StringBuffer is a mutable sequence of characters in Java
 * (Unlike Strings, which are immutable)
 * StringBuffer allows for modifications of it's content without creating a new class
 */
public class StringBufferFunctions {
   public static void main(String[] args){
    //creating a StringBuffer object
    StringBuffer sb = new StringBuffer("Hello");

    //append(String)
    sb.append(" World");
    System.out.println("Appended: "+sb);

    //insert(start_index, String)
    sb.insert(6,"Java ");
    System.out.println("Insert: "+sb);

    //replace(start_index, end_index, String)
    sb.replace(6,12,"Python ");
    System.out.println("Replaced: "+sb);

    //delete(start_index,end_index)
    sb.delete(6,12);
    System.out.println("Deleted: "+sb);

    //reverse()
    sb.reverse();
    System.out.println("Reversed: "+sb);
   } 
}

/*OUTPUT
  Appended: Hello World
Insert: Hello Java World
Replaced: Hello Python orld
Deleted: Hello  orld
Reversed: dlro  olleH
  */
