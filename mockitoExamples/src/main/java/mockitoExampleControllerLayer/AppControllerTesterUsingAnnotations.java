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
	AppController app=new AppController();
	
	@Mock
	AppService service;
	
	@Test
	public void testPrint()
	{
		Mockito.when(service.print()).thenReturn(100);
		
		Assert.assertEquals(app.print(), 100);
		
	}
}
