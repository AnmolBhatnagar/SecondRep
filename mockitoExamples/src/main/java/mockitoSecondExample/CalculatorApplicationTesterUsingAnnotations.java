package mockitoSecondExample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorApplicationTesterUsingAnnotations {

	@InjectMocks
	CalculatorApplication calcapp = new CalculatorApplication();

	@Mock
	CalculatorService service;

	@Test
	public void testAdd() {
		when(service.add(10.0, 20.0)).thenReturn(30.00);

		assertEquals(service.add(10.0, 20.0), 30.0, 0);
		
		verify(service,times(1)).add(10.0, 20.0);
	}

	@Test
	public void testSubtract() {
		when(service.subtract(10.0, 20.0)).thenReturn(-10.00);

		assertEquals(service.subtract(10.0, 20.0), -10.00, 0);
	}

	@Test
	public void testMultiply() {
		when(service.multiply(10.0, 20.0)).thenReturn(200.00);

		assertEquals(service.multiply(10.0, 20.0), 200.00, 0);
	}

	@Test
	public void testDivideByNonZero() {
		when(service.divide(10.0, 20.0)).thenReturn(0.5);

		assertEquals(service.divide(10.0, 20.0), 0.5, 0);
	}

	@Test(expected=ArithmeticException.class)
	public void testDivideByZero() {
		doThrow(new ArithmeticException("Divide by zero")).when(service).divide(10.0, 0);
		service.divide(10.0, 0);
	}

}
