package testcases;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ApplicationTest {
@Test(priority=1)
public void dologin(){
	throw new SkipException("Testing Skip test");
	//System.out.println("Login Test Executation");
}
@Test(priority=2, dependsOnMethods={"dologin"})
public void doPasswordChange(){
	System.out.println("Changing Password");
}
@Test(priority=3)
public void doLogout(){
	
	System.out.println("Logout from the site");
}
@BeforeTest
public void beforetest() {
	System.out.println("Before Executing Test");
}
@AfterTest
public void aftertest() {
	System.out.println("After executing all tests");
}
@BeforeMethod
public void beforeMethod() {
	System.out.println("----beforemetnod-------");
}
@AfterMethod
public void afterMethod() {
	System.out.println("----aftermethod------");
	//quit the browser after execution the test
}
@BeforeSuite
public void beforeSuit() {
	System.out.println("BEFORE SUITe");
}
@AfterSuite
public void afterSuit() {
	System.out.println("AFTER SUITe");
}
}
