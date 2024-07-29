/* some examples of Java data tyes are:
*int
*float
*boolean
*string
  etc
*/

//SYNTAX for variable declaraion: data_type variable_name= value;
//for example
string greeting="hello world";
System.out.println(greeting);

int num1=345;
float num2=34.5;
char myLetter='T';
boolean myBool=true;

//you can also declare a variable without assigning a value and assign it's value later
int myNum;
myNum=13;
System.out.println(myNum);

//FINAL VARIABLES
/*If you don't want others (or yourself) to overwrite existing values, 
use the final keyword (this will declare the variable as "final" or "constant",
which means unchangeable and read-only):*/
final int myNum=10;
myNum=20; //will generate error: cannot assign value to final variable

//we can use '+' to combine two variables
String firstname="Yesha";
String lastname="Pandya";
String fullname= firstname+lastname;
System.out.println(fullname);

//displaying variables
int num1=20;
int num2=30;
System.out.println(num1+num2); //will give sum output

//we can use + to join string and a variable
String name="Yesha";
System.out.println("Hello "+name);

//assigning one value to multiple variables
int x,y,z;
x=y=z=20;
System.out.println(x+y+z);

/*RULES FOR NAMING VARIABLES (IDENTIFIERS)
*Names can contain letters, digits, underscores, and dollar signs
*Names must begin with a letter
*Names should start with a lowercase letter, and cannot contain whitespace
*Names can also begin with $ and _ (but we will not use it in this tutorial)
*Names are case-sensitive ("myVar" and "myvar" are different variables)
*Reserved words (like Java keywords, such as int or boolean) cannot be used as names
*/

