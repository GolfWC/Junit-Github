package shopping;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class JunitFailExampleTest {

	@Test
	public void towPlustwoEqual4() {
		assertEquals("2+2 = 4",4,2+2);
	}
	
	@Test
	public void towPlustwoEqualFour() {
		assertEquals("2+2 = 4",4,2+3);
	}
	
	boolean result = true;
	@Test
	public void testingAssertTrue() {
		assertTrue(result);
	}
	
	@Test
	public void testingAssertTrueWhitDescription() {
		assertTrue("Result is true",!result);
	}
	
}
