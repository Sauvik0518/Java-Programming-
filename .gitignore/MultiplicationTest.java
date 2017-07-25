package iit.du.ac.bd;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplicationTest {

	@Test
	public void testMultiplicationTable() {
		Multiplication test = new Multiplication();
		
		test.multiplicationTable(5);
		equals(5);
	}

}
