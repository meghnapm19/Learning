import java.util.*;
public class Index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = input.next();

        System.out.println("Enter the char to which you need to find index");
        char c = input.next().charAt(0);
        
        int result = str.indexOf(c);

        System.out.println(result);
    }
}
