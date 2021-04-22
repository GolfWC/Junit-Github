package shopping;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

public class JunitFailExampleTest {
	
	@Test
	public void towPlustwoEqual4() {
		assertEquals("2+2 = 4",4,2+2);
	}
	
	
	
	boolean result = true;
	@Test
	public void testingAssertTrue() {
		assertTrue(result);
	}
	
	
	
}
