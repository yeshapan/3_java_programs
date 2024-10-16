//Java program to demonstrate access control across packages in Java
package PackageB;

import PackageA.ProgramA;

public class ProgramB {
    public static void main(String[] args) {
        //create an object of ProgramA class
        ProgramA objA= new ProgramA();

        //access public member
        System.out.println(objA.public_str);

        //accessing any other (private/protected/default) data members of another package will generate error

        //accessing protected member
        //System.out.println(objA.protected_str);   // Error: Not accessible in a different package without inheritance
        
        //accessing default data member
        //System.out.println(objA.default_str);     //Error: Not accessible outside its package

        //accessing private data member
        //System.out.println(objA.private_str);     //Error: Not accessible outside its class
        
        //accessing private data member through public method
        System.out.println(objA.display_priv());
    }
}
