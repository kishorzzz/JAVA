package Arrays;
import java.util.*;
// import java.util.Arrays;
public class insendfront {
    public static void main(String args[]){
        Scanner input =new Scanner(System.in);
        int[] arr=new int[4];

        // Initialising a new Array 

        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("The Original Array is :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //  Inserting the Element at  First Position 

        int[] newarr=new int[arr.length+1];
        System.out.println("Enter new Element :");
        int newele=input.nextInt();
        newarr[0]=newele;
        for(int i=0;i<arr.length;i++){
            newarr[i+1]=arr[i];
        }
        // Printing an array of Elements 
        System.out.println("The new Array is : ");
        for(int i=0;i<newarr.length;i++){
            System.out.print(newarr[i]+" ");
        }

        //  Deleting Element at First Position 
                     
        System.out.println();
        System.out.println("The New Updatred Array is :");
        int[] newestarr=new int[arr.length-1];
        for(int i=1;i<arr.length;i++){
            newestarr[i-1]=arr[i];
        }
        for(int i=0;i<newestarr.length;i++){
            System.out.print(newestarr[i]+" ");
        }
        input.close();
    }
}
