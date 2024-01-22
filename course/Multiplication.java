import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x = input.nextInt();

        System.out.println("Enter till what table you want");
        int y = input.nextInt();

        for(int i=1; i<=y; i++){
            int mult = i*x;
            System.out.println(x + " " + " * " + i + " " + "= " + mult);
        }
        
    }
}
