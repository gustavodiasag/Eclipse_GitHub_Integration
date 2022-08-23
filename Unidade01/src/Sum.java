import java.util.Scanner;

public class Sum {
	
	public static void main(String args[]) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("First number: ");
		
		int a = scanner.nextInt();
		
		System.out.println("Second number: ");
		
		int b = scanner.nextInt();
		
		scanner.close();
				
		System.out.println(a + b);
	}
}
