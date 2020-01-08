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
 * THIS IS THE EXAMPLE OF HYBRID DRIVEN TEST CASE
 *
 */
public class ExecuteTest_WithDataDriven extends ApplicationTestData {

    WebDriver webdriver = new ChromeDriver();
     ReadObject object = new ReadObject();
     UIOperation operation = new UIOperation(webdriver);
     @Test(dataProvider="Login")
	public void testLogin(String Username, String Password) throws Exception {
        Properties allObjects =  object.getObjectRepository();
        //Read keyword sheet
        //operation.perform(p, operation, objectName, objectType, value);

        operation.perform(allObjects,"GOTOURL", "", "", "url");
        operation.perform(allObjects,"CLICK", "SignonLink", "link", "");
        operation.perform(allObjects,"SETTEXT", "username", "name", Username);
        operation.perform(allObjects,"SETTEXT", "password", "name", Password);
        operation.perform(allObjects,"CLICK", "loginButton", "name", "");
        operation.perform(allObjects,"CLICK", "SignOffLink", "link", "");
    }
     
}
