package MainaCards;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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
	
	public HallOfFame(ArrayList<HighScore> al){
		
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
		HoF.remove(HoF.get(HoF.size()));
	}
	
//	public void overrideResults(String writeFileName, String text){
//	        try
//	        {
//	        FileWriter fileWriter = new FileWriter(writeFileName);
//	        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//
//	        bufferedWriter.write(text);
//
//	        // Always close files.
//	        bufferedWriter.close();
//
//	        }
//	        catch(IOException ex) {
//	            System.out.println("Error writing to file '"+ writeFileName + "'");}
//	    }
}
