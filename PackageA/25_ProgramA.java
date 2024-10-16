//Program to demonstrate access control across packages in Java
package PackageA;

public class ProgramA {
    //public data member
    public String public_str="Public String";

    //private data member
    private String private_str="Private String";

    //default data member
    String default_str="Default String";

    //protected data member
    protected String protected_str="Protected string";
    
    //public function/method to acccess private string
    public String display_priv(){
        return private_str;
    }
}
