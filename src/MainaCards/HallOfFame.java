package MainaCards;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class HallOfFame {
	private ArrayList<HighScore> HoF;
	private String filename = "HallOfFame.txt";
	
	public HallOfFame(){
		HoF = new ArrayList <HighScore>();
		for(int i = 0; i<10; i++){
			HighScore hs = new HighScore("null", 0);
			HoF.add(hs);
		}
	}
	
	public void tryToAdd(HighScore hs){
		for(int i = 0; i< 10; i++){
			if(HoF.get(i).getScore() < hs.getScore()){
				HoF.add(hs);
				sort();
				break;
			}
		}
		for(HighScore h : HoF){
			overrideResults(filename, h.toString());
		}
	}
	
	public void sort(){
		CustomComp cc = new CustomComp();
		for(int i = 0; i < HoF.size()-1; i++){
			cc.compare(HoF.get(i), HoF.get(i+1));
		}
		HoF.remove(HoF.get(HoF.size()-1));
	}
	
	public void overrideResults(String writeFileName, String text){
	        try
	        {
	        FileWriter fileWriter = new FileWriter(writeFileName);
	        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
	        
	        bufferedWriter.write(text);

	        // Always close files.
	        bufferedWriter.close();

	        }
	        catch(IOException ex) {
	            System.out.println("Error writing to file '"+ writeFileName + "'");}
	    }
	
	public String toString(){
		String everything = "";
	    try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();

	        while (line != null) {
	            sb.append(line);
	            sb.append(System.lineSeparator());
	            line = br.readLine();
	        }
	        everything = sb.toString();
	    }
	    catch(IOException ex) {
            System.out.println("SOZ");}
	    return everything;
	}
}
