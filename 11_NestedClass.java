class OuterClass{
    //variable string in outer class
    private String outer_str="String in outer class";

    //inner class
    class InnerClass{
        //accessing private member of outer class
        void display_str(){
            System.out.println("Accessing private data member of outer class from inner class:"+outer_str);
        }
    }

    //function o display innerclass
    void display_inner(){
        //create object of nested inner class
        InnerClass innerobj=new InnerClass();
        innerobj.display_str();
    }
}

public class MainDemo{
    public static void main(String[] args){
        //create object of outer class
        OuterClass outerobj=new OuterClass();
        outerobj.display_inner();
    }
}
