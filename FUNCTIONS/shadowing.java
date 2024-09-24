package FUNCTIONS;

public class shadowing {
    static int a=100; // then it is called  Shadowing 
    public static void main(String args[]){
        a=43; // when we apply tthis then the orginal values gets hiden
        System.out.println(a);
        Calling();
    }
    static void Calling(){
        System.out.println(a); // value gets modified  to the cahnged values 
    }
}
