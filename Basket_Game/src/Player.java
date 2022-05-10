/**
 * The Player class creates one player object storing all player related data.
 * 
 * @author Anaberdi Meredov
 * @since 2022.05.09
 * @version 2.2 beta
 * @github https://github.com/sherlock59/Basket_Game.git
 */
public class Player {
	
	/**
	 * The player's name
	 */
	private String name;
	
	/**
	 * The player's jersey number
	 */
	private int number;
	
	/**
	 * The player's foul throws
	 */
	private int fouls;
	
	/**
	 * The player's FreeThrow attempt
	 */
	private int attempts_1pt;
	
	/**
	 * The player's second attempt
	 */
	private int attempts_2pt;
	
	/**
	 * The player's third attempt
	 */
	private int attempts_3pt;
	
	/**
	 * The player's FreeThrow
	 */
	private int fieldGoals_1pt;
	
	/**
	 * The player's second ThrowGoal
	 */
	private int fieldGoals_2pt;
	
	/**
	 * The player's third ThrowGoal
	 */
	private int fieldGoals_3pt;
	
	/**
	 * Default constructor initializes all the player's fields to null and zero
	 */
	public Player() {
		this.name = null;
		this.number = 0;
		this.fouls = 0;
		
		this.attempts_1pt = 0;
		this.attempts_2pt = 0;
		this.attempts_3pt = 0;
		
		this.fieldGoals_1pt = 0;
		this.fieldGoals_2pt = 0;
		this.fieldGoals_3pt = 0;
		this.fouls = 0;
	}
	
	/**
	 * This method combines player's name and number 
	 * @param name and number of Player's 
	 */
	public Player(String name, int number) {
		this();
		this.name = name;
		this.number = number;
	}
	
	/**
	 * @return This method return's Player's name
	 * @param getName
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method sets the Player's name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return Returns player's jersey number
	 */
	public int getNumber() {
		return number;
	}
	
	/**
	 * @param Sets the Player's jersey number
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	
	/**
	 * @return Returns Player's fols throw
	 */
	public int getFouls() {
		return fouls;
	}
	
	/**
	 * @return Returns Player's attempt FreeThrow
	 */
	public int getAttempts_1pt() {
		return attempts_1pt;
	}

	/**
	 * @return Returns Player's second attempt throw
	 */
	public int getAttempts_2pt() {
		return attempts_2pt;
	}

	/**
	 * @return Returns player's third attempt throw
	 */
	public int getAttempts_3pt() {
		return attempts_3pt;
	}

	/**
	 * @return Returns Player's FreeThrow
	 */
	public int getFieldGoals_1pt() {
		return fieldGoals_1pt;
	}

	/**
	 * @return Returns Player's second throw
	 */
	public int getFieldGoals_2pt() {
		return fieldGoals_2pt;
	}

	/**
	 * @return Returns Player's third throw
	 */
	public int getFieldGoals_3pt() {
		return fieldGoals_3pt;
	}
		
	/**
	 *  Counts PLayer's foul throw 
	 */
	public void foul() {
		this.fouls++;
	}
	
	/**
	 * First 'made' makes sure if the Player made score and then sets with calculation throws with attempts
	 * @param shotType, made
	 */
	public void shot(int shotType, boolean made) {
		
		switch (shotType) {
		case 1:
			attempts_1pt ++;
			fieldGoals_1pt += made ? 1 : 0;
			break;
		case 2:
			attempts_2pt ++;
			fieldGoals_2pt += made ? 1 : 0;
			break;
		case 3:
			attempts_3pt ++;
			fieldGoals_3pt += made ? 1 : 0;
		default:
			System.out.println("Invalid shot type = " + shotType);
		}
	}
	
	/**
	 * GetPoints return overall player's throw goals
	 * @param getpoins
	 * @return sum points 
	 */
	public int getPoints() {
		return  fieldGoals_1pt + (fieldGoals_2pt * 2) + (fieldGoals_3pt * 3);
	}
	
	/**
	 *  Presents the players points and fouls (missed "did not hit into basket" )
	 */
	public void quickStats() {
		System.out.println("#" + number + " " + name + " Fouls=" + fouls + " Points=" + getPoints());
	}
	
	/**
	 * Outlines game over initials with diagram
	 */
	public void fullStats() {
		int percent_freeThrows = (attempts_1pt != 0) ? fieldGoals_1pt * 100 / attempts_1pt : 0;
		System.out.println("               Attempts  " + "  Baskets  " + "  Percent  ");
		System.out.println("               --------  " + "  -------  " + "  -------  ");
		System.out.printf("Free Throws       %8d %8d %8d\n", attempts_1pt, fieldGoals_1pt, percent_freeThrows);
		System.out.printf("2pt Field Goals   %8d %8d %8d\n", attempts_2pt, fieldGoals_2pt, percent_freeThrows);
		System.out.printf("3pt Field Goals   %8d %8d %8d\n", attempts_3pt, fieldGoals_3pt, percent_freeThrows);
	}

}
