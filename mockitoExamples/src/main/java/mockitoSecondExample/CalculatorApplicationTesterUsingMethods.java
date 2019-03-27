package mockitoSecondExample;

import org.mockito.Mockito;
import org.junit.Assert;

public class CalculatorApplicationTesterUsingMethods {

	CalculatorService service;
	CalculatorApplication calcapp;

	public static void main(String[] args) {

		CalculatorApplicationTesterUsingMethods tester = new CalculatorApplicationTesterUsingMethods();
		tester.setup();
		System.out.println("Status: " + (tester.testAdd() ? "pass" : "fail"));
		System.out.println("Status: "
				+ (tester.testSubtract() ? "pass" : "fail"));
		System.out.println("Status: "
				+ (tester.testMultiply() ? "pass" : "fail"));
		System.out.println("Status: "
				+ (tester.testDivideByNonZero() ? "pass" : "fail"));
		System.out.println("Status: "
				+ (tester.testDivideByZero() ? "pass" : "fail"));
	}

	public void setup() {
		calcapp = new CalculatorApplication();
		service = Mockito.mock(CalculatorService.class);
		calcapp.setService(service);
	}

	public boolean testAdd() {
		Mockito.when(service.add(10.120, 20.120)).thenReturn(30.240);
		System.out.println("Value of Add method: "
				+ service.add(10.120, 20.120));
		return service.add(10.120, 20.120) == 30.24 ? true : false;
	}

	public boolean testSubtract() {
		Mockito.when(service.subtract(10.120, 20.120)).thenReturn(-10.0);
		System.out.println("Value of Subtract method: "
				+ service.subtract(10.120, 20.120));
		return service.subtract(10.120, 20.120) == -10.0 ? true : false;
	}

	public boolean testMultiply() {
		Mockito.when(service.multiply(10.120, 20.120)).thenReturn(203.6144);
		System.out.println("Value of Multiply method: "
				+ service.multiply(10.120, 20.120));
		return service.multiply(10.120, 20.120) == 203.6144 ? true : false;
	}

	public boolean testDivideByNonZero() {
		Mockito.when(service.divide(10.120, 20.120)).thenReturn(0.5029);
		System.out.println("Value of Divide method: "
				+ service.divide(10.120, 20.120));
		return service.divide(10.120, 20.120) == 0.5029 ? true : false;
	}

	public boolean testDivideByZero() {
		Mockito.when(service.divide(10.120, 0)).thenReturn(0.0);
		System.out.println("Value of Divide method: "
				+ service.divide(10.120, 0));
		return service.divide(10.120, 0) == 0.0 ? true : false;
	}
}
