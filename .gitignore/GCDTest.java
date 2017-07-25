package iit.du.ac.bd;

import static org.junit.Assert.*;

import org.junit.Test;

public class GCDTest {

	@Test
	public void testGCD() {
		GCD test = new GCD();
		int result = test.findGCD(54,24);
		assertEquals(6,result);
		
		int result1 = test.findGCD(0,24);
		assertEquals(24,result1);
	}

}
