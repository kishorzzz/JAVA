package FUNCTIONS;
import java.util.Arrays;

public class varargs { // to pass definite number of values in the  form of Arrays we use ...varargs(variable length arguemnents ) 
    // like int ...args , String ...args, char ...elements 
    public static void main(String[] args) {
        functioning(1,3,4,5,6,7,8);
        kishorr(1,2,3,4,4,5,5,6);
    }
    static void functioning(int ...elements){ // variable Length arguements  we can pass String values and every data type as we need 
        System.out.println(Arrays.toString(elements));// implicitly Declared here 

    }
    static void kishorr(int a,int b,int ...c){  // the ordered index values are stored in the defined variables and  remaining all stored  in the varible length arguemnets 
        //System.out.println(Arrays.toString(a));
        System.out.println(b);
        System.out.println(a);
        System.out.println(Arrays.toString(c));
    }
}
