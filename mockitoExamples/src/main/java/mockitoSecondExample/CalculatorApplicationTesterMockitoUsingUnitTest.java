package mockitoSecondExample;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import mockitoExampleControllerLayer.AppController;
import mockitoExampleServiceLayer.AppService;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorApplicationTesterMockitoUsingUnitTest {

	CalculatorApplication calc;
	CalculatorService service;

	@Before
	public void setup() {
		calc = new CalculatorApplication();
//		calculator calculat=new calculator();
//		service=Mockito.spy(calculat);
		service = Mockito.mock(CalculatorService.class);
		calc.setService(service);
	}

	@Test
	public void testCases() {
		Mockito.when(service.add(10.0, 10.0)).thenReturn(20.0);
		Mockito.when(service.subtract(10.0, 10.0)).thenReturn(0.0);

		Assert.assertEquals(calc.add(10.0, 10.0), 20.0, 0);
		Assert.assertEquals(calc.subtract(10.0, 10.0), 0.0, 0);

//		InOrder inOrder = Mockito.inOrder(service);
//
//		inOrder.verify(service).subtract(10.0, 10.0);		
//		inOrder.verify(service).add(10.0, 10.0);
		
		
		Mockito.when(service.multiply(10.0, 10.0)).then(new Answer<Double>() {

			public Double answer(InvocationOnMock invocation) throws Throwable {
				System.out.println("in answer");
				return 100.0;
			}
		});
		Assert.assertEquals(service.multiply(10.0, 10.0), 100.0,0);
//		Mockito.reset(service);
		System.out.println("------------------------");
		System.out.println("printing method: "+service.multiply(10.0, 10.0));
	}
//	
//	class calculator implements CalculatorService{
//
//		public double add(double numberOne, double numberTwo) {
//			System.out.println("in add method");
//			return numberOne+numberTwo;
//		}
//
//		public double subtract(double numberOne, double numberTwo) {
//			System.out.println("in subtract method");
//			return numberOne-numberTwo;
//		}
//
//		public double multiply(double numberOne, double numberTwo) {
//			System.out.println("in multiply method");
//			return numberOne*numberTwo;
//		}
//
//		public double divide(double numberOne, double numberTwo) {
//			System.out.println("in divide method");
//			return numberOne/numberTwo;
//		}
//		
//	}
}
