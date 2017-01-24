package com.davetest.maven_calc;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

	private Calculator calc;

	protected void setUp() throws Exception {
		super.setUp();
		
		this.calc = new Calculator();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testAdd() {
		assertEquals(calc.add(1, 1), 2);
		assertEquals(calc.add(-1, 1), 0);
		assertEquals(calc.add(100000, 100000), 200000);
		assertEquals(calc.add(10, -1), 9);
		assertEquals(calc.add(1, -1), 0);
		assertEquals(calc.add(5, 1), 6);
	}
	
	public void testSubtraction() {
		
		assertEquals(calc.subtract(2, 1), 1);
		assertEquals(calc.subtract(2000, 1000), 1001);
		
		
	}

}
