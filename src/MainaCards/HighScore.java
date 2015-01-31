package MainaCards;

public class HighScore {
	private String name;
	private int score;
	
	public HighScore(String n, int s){
		name = n;
		score = s;
	}
	public int getScore(){
		return score;
	}
	
	public String getName(){
		return name;
	}
	
	
}
