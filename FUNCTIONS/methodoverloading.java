package FUNCTIONS;

public class methodoverloading { // Same function name in the program is called method Overloading 
    public static void main(String args[]){
        kishor(4,5);
        
    }
    static void kishor(int a,int b){
        System.out.println("I am Kishor");
    }
    static void kishor(){
        System.out.println("I am Kishor");
    }
}
