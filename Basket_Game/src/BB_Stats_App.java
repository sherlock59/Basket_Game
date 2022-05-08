import java.util.Scanner;

/**
 * Basketball Stats Application
 * 
 * @author dljohnson1234
 * @since 2022.02.15
 * @version 1.0 beta
 */
public class BB_Stats_App {
	
    /**
     * First Team
     */
    private Team team1;
    
    /**
     * Second Team 
     */
    private Team team2;
    
    /**
     * Use to display a double dash line
     */
    private final static String doubleLine = "=========================================";
    
    /**
     * Used to display a single dash line 
     */
    private final static String singleLine = "-----------------------------------------"; 
    
    /**
     * Default constructor that instantiate  both teams
     */
    private BB_Stats_App() {
    	
    	team1 = new Team();
        team2 = new Team();
        
    } // end of default constructor
    
    /**
     *  Displays the BB Stats App header
     */
    private void displayAppHeading() {
    	
		System.out.println(doubleLine);
		System.out.println("Welcome to the BB Stats App");
		System.out.println(doubleLine);
		System.out.println();
		
    } // end of displayAppHeading
    
    /**
     * Sets the teams names and calls playersSetup to setup players
     */
    private void teamSetup() {
    	
    	String userInput = null;
  		
		userInput = Input.getLine("Enter the #1 TEAM name: ");
		team1.setName(userInput);
		playersSetup(team1);

		System.out.println();
		System.out.println(singleLine);
		System.out.println();

		userInput = Input.getLine("Enter the #2 TEAM name: ");
		team2.setName(userInput);
		playersSetup(team2);
    	
    } // end of teamSetup
    
    /**
     * Sets up the team's players
     * 
     * @param team The team to setup players for
     */
    private void playersSetup(Team team) {
    	String teamName = team.getName();
    	String name = null;
    	int number = 0;
    	
		System.out.println();
		name = Input.getLine("Enter " + teamName + "'s #1 player's name: ");
		number = Input.getIntRange("Enter " + name + " jersey number: ", 0, 99);		
		team.setPlayer1(name, number);
		
		System.out.println();
		name = Input.getLine("Enter " + teamName + "'s #2 player's name: ");
		number = Input.getIntRange("Enter " + name + " jersey number: ", 0, 99);		
		team.setPlayer2(name, number);
		    	
    } // end of playerSetup
    
    /**
     * Keeps the game running via menu options
     */
    private void playGame() {
    	
    	boolean playGame = true;
    	int userInput = 0;
    	
    	System.out.println();
    	System.out.println(doubleLine);    	
    	System.out.println("Game Started!");
    	System.out.println(doubleLine);
    	System.out.println();
    	
    	while (playGame) {
    		
    		System.out.println(singleLine);
    		System.out.println("Main Menu");
    		System.out.println(singleLine);
    		
    		System.out.println("0 = End Game");
    		System.out.println("1 = Enter " + team1.getName() + " Team's Stats");
    		System.out.println("2 = Enter " + team2.getName() + " Team's Stats");
    		System.out.println("3 = Display Game Stats");
    		
    		System.out.println(singleLine);
    		userInput = Input.getIntRange("Menu Choice: ", 0, 3);
    		System.out.println(singleLine);
    		
    		System.out.println();
    		
    		switch (userInput) {
    		case 0:
    			playGame = false;
    			updateScoreboard();
        		System.out.println();
        		break;
        		
    		case 1:
    			updateTeamStats(team1);
    			System.out.println();
        		updateScoreboard();
        		System.out.println();
        		break;
        		
    		case 2:
    			updateTeamStats(team2);
    			System.out.println();
        		updateScoreboard();
        		System.out.println();
        		break;
        		
    		case 3:
    			displayGameStatus();
    			break;
    			
    		default:
    			System.out.println("Invalid menu choice = " + userInput);
    			
    		} // end of switch
    	}

    } // end of playGame
    
    /**
     * Update the select team's stats
     * @param team The team to enter stats for
     */
    private void updateTeamStats(Team team) {

    	int playerNum = 0;
    	
		System.out.println(singleLine);
		System.out.println("Select Player");
		System.out.println(singleLine);
		
		team.listPlayers();
		
		System.out.println(singleLine);
		playerNum = Input.getIntRange("Enter Player: ", 1, 2);
		System.out.println(singleLine);
		
		if (playerNum == 0)
			updatePlayerStats(team.getPlayer1());
		else
			updatePlayerStats(team.getPlayer2());
		
		System.out.println();
			
    } // end of updateTeam
    
    /**
     * Update the player's stats
     * 
     * @param player The player to enter stats for
     */
    private void updatePlayerStats(Player player) {
    	int type = 0;
    	int made = 0;
    	
		System.out.println();
		
		System.out.println(singleLine);
		System.out.println("Select Stat Type");
		System.out.println(singleLine);
		
		System.out.println("0 = foul");
		System.out.println("1 = free throw");
		System.out.println("2 = 2pt field goal");
		System.out.println("3 = 3pt field goal");
		
		System.out.println(singleLine);
		type = Input.getIntRange("Enter Stat Type: ", 0, 3);
		System.out.println(singleLine);
		System.out.println();
		
		if (type == 0) {
			
			player.foul();
			
		} else {
			
			System.out.println(singleLine);
			System.out.println("Select Attempt");
			System.out.println(singleLine);

			System.out.println("#0 = Missed Shot");
			System.out.println("#1 = Made Shot");
			
    		System.out.println(singleLine);
			made = Input.getIntRange("Enter Attempt: ", 0, 1);
    		System.out.println(singleLine);
    		
			if (made == 0)
				player.shot(type, false);
			else
				player.shot(type, true);
			
			System.out.println();
		
		} // end of if-else

		player.quickStats();

    }
    
    /**
     * Display the updated Scoreboard for both teams
     */
    private void updateScoreboard() {
    	
    	team1.displayStats();
    	team2.displayStats();
    	
    }
    
    /**
     * Display all team player's full stats
     */
    private void displayGameStatus() {
    	
    	team1.getPlayer1().fullStats();
    	System.out.println();
    	
    	team1.getPlayer2().fullStats();
    	System.out.println();
    	
    	team2.getPlayer1().fullStats();
    	System.out.println();
    	
    	team2.getPlayer2().fullStats();
    	System.out.println();
    	
    } // end of playGame
    
	/**
	 * Main method that creates the BB_Stats_App object and then
	 * setups up the teams and play the game via menu options.
	 * 
	 * @param args No command line input args are used for this application
	 */
	public static void main(String[] args) {

		BB_Stats_App app = new BB_Stats_App();
		
		app.displayAppHeading();
		app.teamSetup();
		app.playGame();
		
		Input.input.close();
		
	} // end of main
	
} // end of BB_Stats_App class
