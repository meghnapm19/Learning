import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5};

       for (int number: arr){
        if(isEven(number)){
            System.out.println(number + " ");
        }
       }
    }
    private static boolean isEven(int number){
        return number % 2 == 0;
    }
}