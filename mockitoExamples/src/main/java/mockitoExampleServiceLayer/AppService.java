package mockitoExampleServiceLayer;

import mockitoExampleDaoLayer.AppDao;

public class AppService {

	AppDao dao=new AppDao();
	public int print()
	{
		int value=dao.value();
		System.out.println("service layer "+value);
		return value;
	}
}
