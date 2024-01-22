import java.util.Arrays;
import java.util.*;

public class LargestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = input.nextInt();
    
        int[] arr = new int[size];
        // Random random = new Random();
        for(int i=0; i<size; i++){
        arr[i] = input.nextInt();
        }
        // System.out.println(Arrays.toString(arr));

        int max = arr[0];

        for(int i=0; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}

