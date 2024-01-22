import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of x for the number of terms in Fibonacci series");
        int  x = input.nextInt();

        int num1 = 0, num2 = 1;
        System.out.print(num1 + "  ");

        for(int i=1; i<x; i++){
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(num1 + "  ");
        }

    }
}

