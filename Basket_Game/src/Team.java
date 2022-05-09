
/**
 * This class has necessary functions to show outcome of the game such as statistics of the game with players and scores of two teams
 * @author Anaberdi Meredov
 * @since 2022.05.09
 * @version 2.2 beta
 */
public class Team {

	/**
	 * declares player 
	 */
	private Player Player1;
	/**
	 * declares player
	 */
	private Player Player2;
	/**
	 * name for the players
	 */
	private String name;
	
	/**
	 * teams 
	 */
	public Team() {
		name = null;
		Player1 = new Player();
		Player2 = new Player();
	}
	
	/**
	 * @param name 
	 */
	public Team(String name) {
		this(); // calling default constructor
		this.name = name;
	}

	/**
	 * @returns names 
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param names
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return
	 */
	public Player getPlayer1() {
		return Player1;
	}
	
	/**
	 * @param name
	 * @param number
	 */
	public void setPlayer1(String name , int number) {
		Player1.setName(name);
		Player1.setNumber(number);
	}
	
	/**
	 * @return
	 */
	public Player getPlayer2() {
		return Player2;
	}
	
	/**
	 * @param name
	 * @param number
	 */
	public void setPlayer2(String name, int number) {
		Player2.setName(name);
		Player2.setNumber(number);
	}
	
	/**
	 * @return
	 */
	public int getTotalPoints() {
		return Player1.getPoints() + Player2.getPoints();
	}
	
	/**
	 * @return
	 */
	public int getTotalFouls() {
		return Player1.getFouls() + Player2.getFouls();
	}
	
	/**
	 *  prints the players
	 */
	public void listPlayers() {
		System.out.println("1 = " + Player1.getName() + " # " + Player1.getNumber());
		System.out.println("2 = " + Player2.getName() + " # " + Player2.getNumber());
	}
	

	/**
	 * displays the status of the game and whoever played it 
	 */
	public void displayStats() {
		System.out.println(name + "  Fouls= " + getTotalFouls() + "  Points= " + getTotalPoints());
		
	}
	
}
