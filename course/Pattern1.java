public class Pattern1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // outer loop for to print number of lines
			for (int j = 1; j <= i; j++) { // inner loop to print the values based on condition value of outer loop
				System.out.print("*");
			}
			System.out.println();
    }
}
}
