import java.util.Scanner;

public class Twosum {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("Enter the Target:");
        int target = input.nextInt(); 
        int length = arr1.length;
        int[] result = TwoSummm(arr1, target, length);  

        if (result == null) {
            System.out.println("Over Limit Entries!!");
        } else {
            System.out.println(result[0] + ", " + result[1]);
        }
        input.close();
    }

    static int[] TwoSummm(int[] arr1, int target, int length) { 
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr1[i] + arr1[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
