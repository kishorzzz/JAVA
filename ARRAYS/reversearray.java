package Arrays;
import java.util.Arrays;
public class reversearray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int start=0;
        int end=arr.length-1;
        while (start<end) {
            swapp(arr, start, end);
            start++;
            end--;
            
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swapp(int[] arr,int index1,int index2 ){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}