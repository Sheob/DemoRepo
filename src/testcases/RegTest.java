package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegTest {
	SoftAssert softAssert = new SoftAssert();
@Test
public void doRegisterTest() {
String expectedTitle="xxxx";
String actualTitle="yyyy";
System.out.println("A");
//Assert.assertEquals(actualTitle, expectedTitle);
Assert.fail();
System.out.println("B");
//Assert.assertTrue(2>11, "TestFailed");
softAssert.assertEquals(actualTitle, expectedTitle);
softAssert.assertEquals("a","c");
softAssert.assertAll();

}

}
