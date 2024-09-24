package FUNCTIONS;
 // Arrays Change in the Function scope 
public class changingvalues {
    public static void main(String args[]){
        String a="kishor";
        changing(a);
        System.out.println(a);  // Values cannot be changed here 
    }
    static void changing(String a){
        a="Guguloth";
        System.out.println(a);  // it applies on the Function scope only or Function Scope only 
    }
}
