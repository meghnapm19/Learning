import java.util.Scanner;

public class PosNegZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the integer value for x");
        int x = input.nextInt();

        if(x > 0){
        System.out.println("X is a positive number");   
        }
        else if(x < 0){
        System.out.println("X is a negative number");     
        }
        else
        System.out.println("X is zero");
    }
}