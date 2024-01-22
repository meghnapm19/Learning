import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value for x");
        int x = input.nextInt();

        if (x <= 1) {
            System.out.println(x + " is not a prime number");
        }
        else{
        for (int i=2; i<=x/2; i++){
            if(x%i == 0){
                System.out.println(x + " is not a prime number");
                break;
            }
        }
        if(i>x/2){
            System.out.println(x + " is a prime number");
        }
    }
}
}

