package com.ungs.pptwo;

import junit.framework.TestCase;

public class MathFunctionsTest extends TestCase {

	public void test_Sum() {
		MathFunctions math = new MathFunctions();
		Integer result = math.Sum(10, 10);
		assertEquals(20, (int) result);
	}

	public void test_Sum_WrongParameters() {
		MathFunctions math = new MathFunctions();
		try {
			math.Sum(null, 10);
			fail("MathFunctions.sum did not throw IllegalArgumentException.");
		} catch (IllegalArgumentException e) {
			
		}
	}
	
}
