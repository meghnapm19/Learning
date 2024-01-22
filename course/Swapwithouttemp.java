
import java.util.Scanner;

public class Swapwithouttemp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the value for a");
        int a = input.nextInt();

     
        System.out.println("Enter the value for b");
        int b = input.nextInt();

        System.out.println("a:" + a + " " + "b:" + b);

        a = a + b; //a=2, b=3 a= 5
        b = a - b; // b = 2
        a = a - b;

        System.out.println("After swapping" + " " + "a:" + a + " " + "b:" + b);


        
    }
}
