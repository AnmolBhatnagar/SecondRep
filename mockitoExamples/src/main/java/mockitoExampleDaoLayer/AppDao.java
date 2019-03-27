package mockitoExampleDaoLayer;


public class AppDao 
{
	int number=10;
	public int value(){
       System.out.println("Database layer "+number);
       return number;
    }
}
