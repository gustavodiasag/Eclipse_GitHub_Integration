import java.util.Scanner;

class Exercicio04 {
	
	// Chosen method to get user input
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Variables 
		int num1, num2;
		
		// Acquiring data
		System.out.println("Enter the first number");
		num1 = scanner.nextInt();
		
		System.out.println("Enter the second number");
		num2 = scanner.nextInt();
		
		// Calculating the result directly on the output
		System.out.println("Soma: " + (num1 + num2));
	}
}