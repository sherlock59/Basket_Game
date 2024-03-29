import java.util.Scanner;

/**
 * This input class is a middle interpreter between end user and the basketball game. It gathers end user answer .
 * 
 * @author Anaberdi Meredov
 * @since 2022.05.09
 * @version 2.2 beta
 * @github https://github.com/sherlock59/Basket_Game.git
 */
public class Input {
	
    public static Scanner input = new Scanner(System.in);
    
    /**
     * @param prompt
     * @return
     */
    public static String getLine(String prompt) {
		
		System.out.print(prompt);
		return input.nextLine();
		
	} 

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
		input.nextLine();
		
		return userInput;
		
	}

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
				} 
				
    		} else {
    			input.next();	
    		} 
			
			System.out.printf("Invalid input! Please enter a number between (%d - %d): ", low, high);
			
		}
		
		input.nextLine(); 

		return userInput;
	}
} 
