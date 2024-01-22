import java.util.Scanner;

public class WordinaString {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		int len=str.length();
	
		char ch[]=str.toCharArray();
	
		String word=sc.nextLine();
		boolean find=str.contains(word);
		if(find)
		{
			System.out.println("Found the word");
		}
		else
		{
			System.out.println("Did not found the word");
		}	
    }
}
