
public class Player {
	
	private String name;
	
	private int number;
	
	private  int fouls;
	
	private int attempts_1pt;

	private int attempts_2pt;
	
	private int attempts_3pt;
	
	private int fieldGoals_1pt;
	
	private int fieldGoals_2pt;
	
	private int fieldGoals_3pt;
	
	public Player() {}
	
	public Player(String Player1, int number) {}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getFouls() {
		return fouls;
	}
	
	public int getAttempts_1pt() {
		return attempts_1pt;
	}

	public int getAttempts_2pt() {
		return attempts_2pt;
	}

	public int getAttempts_3pt() {
		return attempts_3pt;
	}

	public int getFieldGoals_1pt() {
		return fieldGoals_1pt;
	}

	public int getFieldGoals_2pt() {
		return fieldGoals_2pt;
	}

	public int getFieldGoals_3pt() {
		return fieldGoals_3pt;
	}
		
	public void foul() {}
	
	public void shot(int attempt, boolean field) {}
	
	public int getPoints() {
		return  getPoints();
	}
	
	public void quickStats();
	
	public void fullStats();

}
