package mockitoExampleControllerLayer;

import mockitoExampleServiceLayer.AppService;

public class AppController {

	AppService service;
	
	
	public AppService getService() {
		return service;
	}

	public void setService(AppService service) {
		this.service = service;
	}

	public int print() {
		System.out.println("controller layer "+service.print());
		return service.print();
	}
}
