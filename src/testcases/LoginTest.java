package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
@Test(dataProvider="getData")
public void doLoginTest(
		String username,
		String password,
		String browser,
		int phone
		) {
	
	
}
 @DataProvider
 public Object[][] getData(){
	Object[][] data = new Object[3][5];
	data[0][0] = "U1";
	data[0][1] = "P1";
	data[0][2] = "Pass";
	data[0][3] = "Mozilla";
	data[0][4] = 1234;
	//2nd
	data[1][0] = "U2";
	data[1][1] = "P2";
	data[1][2] = "Pass";
	data[1][3] = "Chrome";
	data[1][4] = 5678;
	//3rd
	data[2][0] = "U3";
	data[2][1] = "P3";
	data[2][2] = "Fao;";
	data[2][3] = "IE";
	data[2][4] = 0101;
	return data;
 }
}
