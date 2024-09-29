//Simple Java program to demonstrate method overriding

//base class
class Animal{
    //method in animal class
    void make_sound(){
        System.out.println("Animal makes sound");
    }
}

//derived class
class Cat extends Animal{
    //method in derived class with same name as method in base class
    void make_sound(){
        System.out.println("Cat meows");
    }
}

//class containing main method
public class MethodOverriding {
   public static void main(String args[]){
    Animal animal1= new Animal(); //create an object of animal class
    Animal cat1= new Cat(); //create an object of cat class (as animal)
    animal1.make_sound(); //calls method in animal class
    cat1.make_sound(); //calls method in cat class
   } 
}

/*OUTPUT:
Animal makes sound
Cat meows
 */
