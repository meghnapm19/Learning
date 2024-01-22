public class SumofArrayElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = calculatedSum(arr);
        System.out.println(sum);
    }
    private static int calculatedSum(int[] arr){
        int sum = 0;
        for (int number : arr){
           sum = sum + number;
        }
        return sum;
    }
            
}