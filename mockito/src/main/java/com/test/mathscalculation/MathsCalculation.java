package com.test.mathscalculation;

import com.test.calculator.CalculatorServices;

public class MathsCalculation implements CalculatorServices {

	/*private CalculaterServices calculator;
	
	public MathsCalculation(CalculaterServices calculator) {
		super();
		this.calculator = calculator;
	}*/

	public double add(double num1, double num2) {
		return num1 + num2;
	}

	public double subtract(double num1, double num2) {
		return num1 - num2;
	}

	public double multiply(double num1, double num2) {
		return num1 * num2;
	}

	public double divide(double num1, double num2) {
		return num1 / num2;
	}

}
