package feldmochingDojo;

import java.util.ArrayList;
import java.util.List;

public class Child {
	
	private List<Deeds> listOfDeeds = new ArrayList<Deeds>();

	public void performGoodDeed() {
		listOfDeeds.add(Deeds.GOOD);
	}

	public void performBadDeed() {
		listOfDeeds.add(Deeds.BAD);
		int index = listOfDeeds.size();
		if (index >= 2) {
			Deeds deed = listOfDeeds.get(index -2);
			deed = Deeds.DELETED;
			Deeds deed2 = listOfDeeds.get(index -1);
			deed2 = Deeds.DELETED;
		}
	}

	public boolean getGetsPresent() {
		if (getDeedAccount() > 0) {
			return true;
		} else return false;
	}

	int getDeedAccount() {
		int deedSum = 0;
		for (Deeds deeds : listOfDeeds){
			if (deeds.equals(Deeds.BAD)) {
				deedSum-=2;
			}
			if (deeds.equals(Deeds.GOOD)) {
				deedSum++;
			}
		}
		
		return deedSum;
	}


}
