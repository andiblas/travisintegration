package com.ungs.pptwo;

public class MathFunctions {

	public Integer Sum(Integer a, Integer b) {
		if (a == null || b == null)
			throw new IllegalArgumentException();
		
		return a + b;
	}

}
