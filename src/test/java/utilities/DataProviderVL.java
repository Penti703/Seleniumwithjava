package utilities;

import org.testng.annotations.DataProvider;

public class DataProviderVL {

	@DataProvider( name="ChatPage")
	public Object [][] dataChat(){
		Object [][] data={
				
				  {"","","","","","Fail"}, 
				  {"Test","bd","elbd","jnewd","jnewd","InvalidEmail"},
				 
				  {"Test","bd","elbd@gmail.com","jeni","jnewdtest","Pass"}
				 
			
	};return data;
}
	

}