
public class Team {

	Player player1;
	
	Player player2;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Player getPlayer1() {
		return player1;
	}
	
	public void setPlayer1(String name , int number) {
		player1.setName(name);
		player1.setNumber(number);
	}
	
	public Player getPlayer2() {
		return player2;
	}
	
	public void setPlayer2(String name, int number) {
		player2.setName(name);
		player2.setNumber(number);
	}
	
	public int getTeamPoints() {
		int teamPoints = 0;
		teamPoints = player1.getPoints() + player2.getPoints();
		return teamPoints;
	}
	
	public int getTeamFouls() {
		int teamFouls = 0;
		teamFouls = player1.getFouls() + player2.getFouls();
		return teamFouls;
	}
	
	public void listPlayers() {
		System.out.println("1 = " + player1.getName() + "#" + player1.getNumber());
		System.out.println("2 = " + player2.getName() + "#" + player2.getNumber());
	}
	

	//public void displayStats() {
	//	System.out.println("0 = " + Fouls() ;
		
	//}


}
