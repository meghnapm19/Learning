import java.util.Scanner;

public class CeltoFar {

    public static void main (String args[])
    {
        // °F = °C×(9/5)+32
        Scanner input = new Scanner(System.in); //creating a scanner object
        System.out.println("Enter input for Celsius");
        float c = input.nextFloat();

        float F = c * (9/5) + 32;
        System.out.println(F);
    }
}
