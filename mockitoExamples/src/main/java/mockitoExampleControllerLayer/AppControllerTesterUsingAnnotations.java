package mockitoExampleControllerLayer;

import mockitoExampleServiceLayer.AppService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.junit.Assert;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AppControllerTesterUsingAnnotations {

	@InjectMocks
	public AppController app = new AppController();

	@Mock
	public AppService service;

	public AppControllerTesterUsingAnnotations(final AppController app,
			final AppService service) {
		super();
		this.app = app;
		this.service = service;
	}

	@Test
	public void testPrint() {
		Mockito.when(service.print()).thenReturn(100);
		Assert.assertEquals(app.print(), 100);
	}
}
