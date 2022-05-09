import java.util.Scanner;

/**
 * This input class is a middle interpreter between end user and the basketball game. It gathers end user answer .
 * 
 * @author Anaberdi Meredov
 * @since 2022.05.09
 * @version 2.2 beta
 */
public class Input {
	
    /**
     * 
     */
    public static Scanner input = new Scanner(System.in);
    
    /**
     * @param prompt
     * @return
     */
    public static String getLine(String prompt) {
		
		System.out.print(prompt);
		return input.nextLine();
		
	} // end of getLine

    /**
     * @param prompt
     * @return
     */
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

    /**
     * @param prompt
     * @param low
     * @param high
     * @return
     */
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
