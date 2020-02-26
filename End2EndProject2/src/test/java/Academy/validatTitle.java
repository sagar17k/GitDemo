package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.*;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.Base;

public class validatTitle extends Base {
	private static Logger log = LogManager.getLogger(validatTitle.class);
	
	@BeforeTest
	public void loadDriver() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		log.info("Driver is initialized");
	}
	
	@Test
	public void basePageNavigation() throws IOException {
		
		LandingPage ld = new LandingPage(driver);
		
		//.Assert.assertEquals(ld.getTitle(), "Featured Courses");
		Assert.assertFalse(ld.getTitle().isDisplayed());
		log.info("Details are displayed");
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}