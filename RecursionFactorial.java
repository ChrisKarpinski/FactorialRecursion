import java.util.Scanner;

public class FactorialByRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int factorialNumber = 1;
		boolean validInput = false;
		
		System.out.println("Enter the number to find the factorial");
		
		while (!validInput) {
		try {
			
			factorialNumber = Integer.parseInt(read.nextLine());
			
			validInput = true;
			
		} catch (NumberFormatException e) {
			
			System.err.println("Invalid");
			
		}
		
		}
		System.out.println("The factorial value is: " + findFactorial(factorialNumber));
			
		}
		
	public static int findFactorial (int factorialIndex) {
		
		int factorialValue = 1;
		if (factorialIndex > 1) {
			factorialValue = factorialIndex * findFactorial(factorialIndex - 1);
		} 
		return factorialValue;
	}

}
