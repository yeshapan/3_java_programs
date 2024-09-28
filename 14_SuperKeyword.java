//base class Books
class Books{
    String quote="Books are uniquely portable magic";
    //base class constructor
    Books(){
        System.out.println("Base class Books constructor called");
    }
    //method in base class
    void display_quote(){
        System.out.println(quote);
    }
        
}

class Fantasy extends Books{
    String quote="The world will be saved and remade by dreamers";
    
    //child class constructor
    Fantasy(){
        super(); //calls immediate parent class constructor
        System.out.println("Derived class Fantasy constructor called");
    }

    //method in child class
    void display_quote(){
        super.display_quote(); //calls function of parent class
        System.out.println(quote);
    }
}
public class SuperKeyword{
    public static void main(String[] args) {
        Fantasy object1=new Fantasy();
        object1.display_quote();
    }
}
