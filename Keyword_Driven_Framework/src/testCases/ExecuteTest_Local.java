package testCases;

import java.util.Properties;
import operation.ReadObject;
import operation.UIOperation;
import testData.ApplicationTestData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * THIS IS THE EXAMPLE OF KEYWORD DRIVEN TEST CASE
 *
 */
public class ExecuteTest_Local
{

	WebDriver webdriver = new ChromeDriver();
	ReadObject object = new ReadObject();
	UIOperation operation = new UIOperation(webdriver);
	@Test
	public void testLogin() throws Exception {
		Properties allObjects =  object.getObjectRepository();
		//Read keyword sheet
		//operation.perform(p, operation, objectName, objectType, value);

		operation.perform(allObjects,"GOTOURL", "", "", "url");
		operation.perform(allObjects,"CLICK", "SignonLink", "link", "");
		operation.perform(allObjects,"SETTEXT", "username", "name", "testing");
		operation.perform(allObjects,"SETTEXT", "password", "name", "testing");
		operation.perform(allObjects,"CLICK", "loginButton", "name", "");
		operation.perform(allObjects,"CLICK", "SignOffLink", "link", "");
	}

}
