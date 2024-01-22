import java.util.*;

public class StringReversals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String");
        String string = input.next();

        char[] reversedString = string.toCharArray();

        for (int i= reversedString.length - 1; i>=0; i--) {
            System.out.print(reversedString[i]); 
        }
        System.out.println();
    }
}
