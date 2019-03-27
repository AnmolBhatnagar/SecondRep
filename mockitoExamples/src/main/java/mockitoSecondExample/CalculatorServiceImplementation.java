package mockitoSecondExample;

public class CalculatorServiceImplementation implements CalculatorService {

	public double add(double numberOne, double numberTwo) {
		return numberOne + numberTwo;
	}

	public double subtract(double numberOne, double numberTwo) {
		return numberOne - numberTwo;
	}

	public double multiply(double numberOne, double numberTwo) {
		return numberOne * numberTwo;
	}

	public double divide(double numberOne, double numberTwo) {
		if (numberTwo == 0)
			return 0;
		else
			return numberOne / numberTwo;
	}

}
