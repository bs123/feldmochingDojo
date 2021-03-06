package feldmochingDojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class SantaKataTest {

	private Child child;

	@Test
	public void testGoodDeed() {
		child = new Child();
		child.performGoodDeed();
		assertTrue("no present", child.getGetsPresent());
		assertEquals("should return 1 good deed", 1,
				child.getDeedAccount());
	}

	@Test
	public void testBadDeed() {
		child = new Child();
		child.performBadDeed();
		assertFalse("no present", child.getGetsPresent());
		assertEquals("should return 2 for bad deed", -2, child.getDeedAccount());
	}
	
	
	@Test
	public void test2BadDeeds() {
		child = new Child();
		child.performBadDeed();
		child.performBadDeed();
		assertFalse("no present", child.getGetsPresent());
		assertEquals("should return 2 for bad deed", -3, child.getDeedAccount());
	}
	
	// INTERATION 3
	
	@Test
	public void testReddeem2LastGoodDeedsAndTheFollowingGoodDeed() {
		child = new Child(); 
		
		child.performGoodDeed();
		child.performGoodDeed();
		child.performBadDeed();

		child.performGoodDeed();
		
		assertFalse("should not receive present", child.getGetsPresent());
		assertEquals("should return -2", -2, child.getDeedAccount());
	}
}
