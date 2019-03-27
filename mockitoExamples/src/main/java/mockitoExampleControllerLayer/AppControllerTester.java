package mockitoExampleControllerLayer;

import static org.mockito.Mockito.*;

import mockitoExampleServiceLayer.AppService;

public class AppControllerTester {
	AppController app;
	AppService service;

	public static void main(String[] args) {
		AppControllerTester tester = new AppControllerTester();
		tester.setup();
		tester.testPrint();
	}

	public void setup() {
		app = new AppController();
		// service=new AppService();
		service = mock(AppService.class);
		app.setService(service);
	}

	public void testPrint() {
		when(service.print()).thenReturn(100);
		System.out.println(app.print());
	}
}
