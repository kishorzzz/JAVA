package FUNCTIONS;

public class blockscope {
    public static void main(String args[]){
        int a=23;  // it is even simliar for Strings too 
        System.out.println(a);
        {
            a=27;  // we can modify and use it y 
            System.out.println(a); // we cannot intilliase the variables that we intialised outside the block scope 
        }
        System.out.println(a); //output is 27 the modified values 
    }
}
