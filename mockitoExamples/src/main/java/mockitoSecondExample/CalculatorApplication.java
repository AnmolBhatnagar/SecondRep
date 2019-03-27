package mockitoSecondExample;

public class CalculatorApplication {

	CalculatorService service;

	public CalculatorService getService() {
		return service;
	}

	public void setService(CalculatorService service) {
		this.service = service;
	}

	public double add(double numberOne, double numberTwo) {
		return service.add(numberOne, numberTwo);
	}

	public double subtract(double numberOne, double numberTwo) {
		return service.subtract(numberOne, numberTwo);
	}

	public double multiply(double numberOne, double numberTwo) {
		return service.multiply(numberOne, numberTwo);
	}

	public double divide(double numberOne, double numberTwo) {
		return service.divide(numberOne, numberTwo);
	}
}
