package iit.du.ac.bd;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciMainTest {

	@Test
	public void testFibonacci() {
		Fibonacci test = new Fibonacci();
		
		test.fibonacciSeries(5);
		
		equals(5);
	}

}
