import java.util.Scanner;

public class Input {
	
    public static Scanner input = new Scanner(System.in);
    
    public static String getLine(String prompt) {
		
		System.out.print(prompt);
		return input.nextLine();
		
	} // end of getLine

    public static int getInt(String prompt) {
    	int userInput = 0;
		
		System.out.print(prompt);
		
		while (true) {
			if (input.hasNextInt()) 
				break;
			
			System.out.printf("Invalid input! Please enter a number: ");
			input.next();
			
		} // end of while
			
		userInput = input.nextInt();
		input.nextLine(); // consume newline left-over
		
		return userInput;
		
	} // end of getInt

    public static int getIntRange(String prompt, int low, int high) {
    	int userInput;
		
		System.out.print(prompt);
		
		while (true) {
			if (input.hasNextInt()) {
				userInput = input.nextInt();
				
				if (userInput >= low && userInput <= high) {
					break;
				} // end of if
				
    		} else {
    			input.next();	
    		} // end of if-else
			
			System.out.printf("Invalid input! Please enter a number between (%d - %d): ", low, high);
			
		} // end of while
		
		input.nextLine(); // consume newline left-over

		return userInput;
		
	} // end of getIntRange
	
} // end of Input class
