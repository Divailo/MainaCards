package MainaCards;

public class HighScore {
	
	private String username;
	private int score;
	
	public HighScore(String n, int s){
		username = n;
		score = s;
	}
	public int getScore(){
		return score;
	}
	
	public String getName(){
		return username;
	}
	
	public String toString(){
		return "Name: " + username + " Score: " + score;
	}
}
