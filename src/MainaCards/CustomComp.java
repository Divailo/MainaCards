package MainaCards;

import java.util.Comparator;

public class CustomComp implements Comparator<HighScore> {

	@Override
	public int compare(HighScore o1, HighScore o2) {
		return o1.getScore() - o2.getScore();
	}
	

}
