package MainaCards;

import java.util.ArrayList;

public class HallOfFame {
	private ArrayList<HighScore> HoF;
	
	public HallOfFame(){
		HoF = new ArrayList <HighScore>();
		for(int i = 0; i<10; i++){
			HighScore hs = new HighScore("null", 0);
			HoF.add(hs);
		}
	}
	
	public void checkForHS(HighScore hs){
		for(int i = 0; i< 10; i++){
			if(HoF.get(i).getScore() < hs.getScore()){
				HoF.add(hs);
				sort();
				return;
			}
		}
	}
	
	public void sort(){
		CustomComp cc = new CustomComp();
		for(int i = 0; i < HoF.size(); i++){
			cc.compare(HoF.get(i), HoF.get(i+1));
		}
	}
}
