/**
 * This Team class creates one team objects storing all team related data
 * 
 * @author Anaberdi Meredov
 * @since 2022.05.09
 * @version 2.2 beta
 * @github https://github.com/sherlock59/Basket_Game.git
 */
public class Team {

	/**
	 * Declares first player 
	 */
	private Player player1;
	/**
	 * Declares second player
	 */
	private Player player2;
	/**
	 * Names for the players
	 */
	private String name;
	
	/**
	 * Assigns player 1 and 2 
	 */
	public Team() {
		name = null;
		player1 = new Player();
		player2 = new Player();
	}
	
	/**
	 * Calls default constructor
	 * @param name 
	 */
	public Team(String name) {
		this();
		this.name = name;
	}

	/**
	 * 
	 * @returns Returns string name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the Player's name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the player's name from input
	 * @return player1
	 */
	public Player getPlayer1() {
		return player1;
	}
	
	/**
	 * Sets first Player's account
	 * @param number, name
	 */
	public void setPlayer1(String name , int number) {
		player1.setName(name);
		player1.setNumber(number);
	}
	
	/**
	 * Gets second player
	 * @return player2
	 */
	public Player getPlayer2() {
		return player2;
	}
	
	/**
	 * Sets second Player's account
	 * @param name, number
	 */
	public void setPlayer2(String name, int number) {
		player2.setName(name);
		player2.setNumber(number);
	}
	
	/**
	 * Returns total points for player 1 and player 2
	 * @return getTotalPoints
	 */
	public int getTotalPoints() {
		return player1.getPoints() + player2.getPoints();
	}
	
	/**
	 * Gets total fouls from Player's result
	 * @return fouls
	 */
	public int getTotalFouls() {
		return player1.getFouls() + player2.getFouls();
	}
	
	/**
	 *  Prints outline for Player's name and jersey number
	 */
	public void listPlayers() {
		System.out.println("1 = " + player1.getName() + " # " + player1.getNumber());
		System.out.println("2 = " + player2.getName() + " # " + player2.getNumber());
	}
	

	/**
	 * Displays the status of the game and whoever played it 
	 */
	public void displayStats() {
		System.out.println(name + "  Fouls= " + getTotalFouls() + "  Points= " + getTotalPoints());
	}
	
}
