
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
	
	public Player() {
		name = null;
		number = 0;
		fouls = 0;
		
		attempts_1pt = 0;
		attempts_2pt = 0;
		attempts_3pt = 0;
		
		fieldGoals_1pt = 0;
		fieldGoals_2pt = 0;
		fieldGoals_3pt = 0;
	}
	
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
	
	int percent_freeThrows = (getAttempts_1pt)
	public int getPoints() {
		return  getFie
	Q}
	
	public void quickStats() {
		System.out.println("#" + number + " " + name + " Fouls=" + fouls + " Points=" + getTotalPoints
	
	//public void fullStats();

}
