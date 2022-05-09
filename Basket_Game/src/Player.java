/**
 * Player class does include functions to run the basketball game. 
 * 
 * @author Anaberdi Meredov
 * @since 2022.05.09
 * @version 2.2 beta
 */
public class Player {
	
	/**
	 * declares name
	 */
	private String name;
	/**
	 * declares number
	 */
	private int number;
	/**
	 * declares fouls
	 */
	private  int fouls;
	
	/**
	 * declares attempts or freethrow attempt in another word
	 */
	private int attempts_1pt;
	/**
	 * attempt 2
	 */
	private int attempts_2pt;
	/**
	 * attempt 3
	 */
	private int attempts_3pt;
	
	/**
	 * declares field goals or freethrow in another word
	 */
	private int fieldGoals_1pt;
	/**
	 * fieldgoals
	 */
	private int fieldGoals_2pt;
	/**
	 * fieldgoals
	 */
	private int fieldGoals_3pt;
	
	/**
	 * connects player with its credentials that belongs to them 
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
	 * @param name
	 * @param number
	 */
	public Player(String name, int number) {
		this();
		this.name = name;
		this.number = number;
	}
	
	/**
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return
	 */
	public int getNumber() {
		return number;
	}
	
	/**
	 * @param number
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	
	/**
	 * @return
	 */
	public int getFouls() {
		return fouls;
	}
	
	/**
	 * @return
	 */
	public int getAttempts_1pt() {
		return attempts_1pt;
	}

	/**
	 * @return
	 */
	public int getAttempts_2pt() {
		return attempts_2pt;
	}

	/**
	 * @return
	 */
	public int getAttempts_3pt() {
		return attempts_3pt;
	}

	/**
	 * @return
	 */
	public int getFieldGoals_1pt() {
		return fieldGoals_1pt;
	}

	/**
	 * @return
	 */
	public int getFieldGoals_2pt() {
		return fieldGoals_2pt;
	}

	/**
	 * @return
	 */
	public int getFieldGoals_3pt() {
		return fieldGoals_3pt;
	}
		
	/**
	 * 
	 */
	public void foul() {
		this.fouls++;
	}
	
	/**
	 * @param shotType
	 * @param made
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
	 * @param getpoins
	 * @return sum points 
	 */
	public int getPoints() {
		return  fieldGoals_1pt + (fieldGoals_2pt * 2) + (fieldGoals_3pt * 3);
	}
	
	/**
	 * quickstats does present the players points and fouls(missed"did not hit into circle blackhole")
	 */
	public void quickStats() {
		System.out.println("#" + number + " " + name + " Fouls=" + fouls + " Points=" + getPoints());
	}
	
	/**
	 * outcome of all gamers with scores
	 */
	public void fullStats() {
		int percent_freeThrows = (attempts_1pt != 0) ? fieldGoals_1pt * 100 / attempts_1pt : 0;
		System.out.println("                    Attempts  " + " Baskets  " + "  Percent  ");
		System.out.println("                    --------  " + " -------  " + "  -------  ");
		System.out.printf("Free Throws       %8d %8d %8d\n", attempts_1pt, fieldGoals_1pt, percent_freeThrows);
		System.out.printf("2pt Field Goals   %8d %8d %8d\n", attempts_2pt, fieldGoals_2pt, percent_freeThrows);
		System.out.printf("3pt Field Goals   %8d %8d %8d\n", attempts_3pt, fieldGoals_3pt, percent_freeThrows);
	}

}
