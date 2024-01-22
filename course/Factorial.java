import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value for x");
        int x = input.nextInt(), fact = 1;

        for(int i=1; i<=x; i++){
            fact = fact*i;
        }
        System.out.println(fact);

    }
}
