package com.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void test_addtwonumber_should_return_result() {
		
		Calculator calculator = new Calculator();
		int result = calculator.add(12, 13);
		int expectedResult = 25;
		//boolean check = result == 25;
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void test_subtracttwonumber_should_return_result() {
		
		Calculator calculator = new Calculator();
		int result = calculator.sub(12, 13);
		int expectedResult = -1;
		//boolean check = result == 25;
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void test_multiplytwonumber_should_return_result() {
		
		Calculator calculator = new Calculator();
		int result = calculator.mul(12, 13);
		int expectedResult = 156;
		//boolean check = result == 25;
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void test_dividetwonumber_should_return_result() {
		
		Calculator calculator = new Calculator();
		int result = calculator.div(39, 13);
		int expectedResult = 3;
		//boolean check = result == 25;
		assertEquals(expectedResult, result);
	}

}
