//Java program to demonstrate how packages are created
//Store this code in a folder named MyPack
package MyPack;

class Balance{
    String name;
    double balance;
    //parameterized constructor
    Balance(String n, double b){
        name=n;
        balance=b;
    }
    //method to display name and account balance
    void display(){
        System.out.println("Name:"+name+"; Account balance: Rs. "+balance);
    }
}

//class containing main method
public class PackageDemo {
    public static void main(String[] args){
        Balance obj_arr[]=new Balance[3]; //array of objects
        //initialize the objects
        obj_arr[0]= new Balance("Will", 543210);
        obj_arr[1]= new Balance("Kshitij", 425301);
        obj_arr[2]= new Balance("Ishita", 453012);
        //display the above information
        for(int i=0; i<3; i++){
            obj_arr[i].display();
        }
    }
}
/* OUTPUT
  Name:Will; Account balance: Rs. 543210.0
Name:Kshitij; Account balance: Rs. 425301.0
Name:Ishita; Account balance: Rs. 453012.0
  */
