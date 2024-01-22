import java.util.*;
import java.util.Scanner;

public class SplitString {

    public static void main(String[] args) {    
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = input.nextLine();

        String reg = "[!@#$%^&* ]";
        
        String[] result = str.split(reg);

        for (int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }
}
