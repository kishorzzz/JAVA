import java.util.ArrayList;
public class intersectionn {

    public static void main(String args[]){
        int[] arr1={1,2,3,4,5};
        int[] arr2={2,3,6,7};
        ArrayList<Integer> intersecton = new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    if(!intersecton.contains(arr1[i])){
                        intersecton.add(arr1[i]);
                    }
                }
            }
        }
        System.out.println(intersecton);
    }
}