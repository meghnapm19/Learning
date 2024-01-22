import java.util.Scanner;
public class OddorEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer value for x");
        int x = input.nextInt();
        
        if(x % 2 == 0){
            System.out.println("X is even");
        }
        else{
            System.out.println("X is odd");
        }
    }
}
