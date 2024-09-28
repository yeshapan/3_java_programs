

class Palindrome_logic{
    int reversed_num=0;
    //member function
    void check_palindrome(int n){
        int initial_num=n;
        while(n!=0){
            int remainder=n%10;
            reversed_num = reversed_num*10 +remainder;
            n=n/10;
        }
        
        if(initial_num==reversed_num){
            System.out.println("Entered number is a palindrome");
        }
        else{
            System.out.println("Entered number is not a palindrome");
        }
    }

}
public class Palindrome {
    public static void main(String[] args) {
        Palindrome_logic object1= new Palindrome_logic();
        object1.check_palindrome(22);
    }
}
