package feldmochingDojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class SantaKataUATest {

	private Child child;

 
	
	@Test
	public void testUAT_It1() {
		child = new Child();
		child.performBadDeed();
		
		child.performGoodDeed();
		child.performGoodDeed();
		child.performBadDeed();

		child.performGoodDeed();
		
		assertFalse("no present", child.getGetsPresent());
		assertEquals("should return 1", -1, child.getDeedAccount());
	}
	
	@Test
	public void testUAT_It2() {
		child = new Child(); 
		
		child.performGoodDeed();
		child.performGoodDeed();
		child.performBadDeed();

		child.performGoodDeed();
		
		assertFalse("no present", child.getGetsPresent());
		assertEquals("should return 0", 0, child.getDeedAccount());
	}

}
