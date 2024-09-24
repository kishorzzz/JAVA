// Functions in Java are Called Methods 

package FUNCTIONS;

public class basics {
    public static void main(String args[]){
        int a=2;
        int b=3; // Class Scope 
      System.out.println(callling(a, b)); //Arguements 
    }
    static String callling(int a,int b){ // Parameters 
        a=10; //Block Scope 
        System.out.println(a);
        return "true ";
    }

}
