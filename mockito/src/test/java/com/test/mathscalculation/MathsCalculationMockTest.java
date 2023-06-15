package com.test.mathscalculation;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.test.calculator.CalculatorServices;

public class MathsCalculationMockTest {

	@Test
	public void test() {
		CalculatorServices calculators = mock(CalculatorServices.class);

		when(calculators.add(2, 3)).thenReturn(5.0);

		when(calculators.multiply(2, 3)).thenReturn(5.0);

	}

}
