package introduction;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Attribute_DataProviderTest {

	@DataProvider(parallel = true)
	public Object DataProvider() {
		Object[][] data = new Object[3][2];
		data[0][0] = "userName1";
		data[0][1] = "Password1";
		
		data[1][0] = "userName2";
		data[1][1] = "Password2";
		
		data[2][0] = "userName3";
		data[2][1] = "Password3";
		
		return data;
	}
	
	@Test(dataProvider = "DataProvider")
	public void TestDataProvider(String userName, String password) {
		System.out.println("userName: " + userName);
		System.out.println("password: " + password);
	}
}
