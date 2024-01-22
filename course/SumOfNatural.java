import java.util.Scanner;

public class SumOfNatural {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x = input.nextInt(); 
        int result = 0; 

        for(int i=1; i<=x; i++){
           result = ((x * (x+1))/2); 
        }
        System.out.println(result);
    
    }
}
