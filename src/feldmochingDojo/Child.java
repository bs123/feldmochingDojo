package feldmochingDojo;

public class Child {
	
	private int deedSum = 0; 

	public void performGoodDeed() {
		deedSum++;
	}

	public boolean getGetsPresent() {
		if (getDeedAccount() > 0) {
			return true;
		} else return false;
	}

	int getDeedAccount() {
		return deedSum;
	}

	public void performBadDeed() {
		deedSum-=2;
	}

}
