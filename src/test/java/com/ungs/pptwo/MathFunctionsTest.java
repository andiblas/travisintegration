package com.ungs.pptwo;

import org.junit.Test;

import junit.framework.TestCase;

public class MathFunctionsTest extends TestCase {

	public void test_Sum() {
		MathFunctions math = new MathFunctions();
		Integer result = math.Sum(10, 10);
		assertEquals(20, (int) result);
	}

	@Test(expected = IllegalArgumentException.class)
	public void sum_WrongParameters() {
		MathFunctions math = new MathFunctions();
		math.Sum(null, 10);	
	}
	
	
	
}
