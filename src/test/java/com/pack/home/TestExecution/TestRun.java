package com.pack.home.TestExecution;

import java.io.IOException;


import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import com.pack.home.Libraries.DriverLaunch;
import com.pack.home.Libraries.LibraryForGenericFunction;

public class TestRun {
	DriverLaunch Dlib = new DriverLaunch();
	public static WebDriver driver;	
	LibraryForGenericFunction lib = null;

	@BeforeTest
	public void executing() throws InterruptedException, IOException {
		driver = Dlib.openBrowser("chrome");
		lib = new LibraryForGenericFunction(driver);
		// Application link will be opened
		driver.get("http://www.oneeight.co.in/zeno/login");
	}
	
	@Test(priority = 2, description="Performs an successful login and checks the dashboard url (passes)")
    public void login() throws InterruptedException, IOException {
        lib.jsSendKeysForID("username", "OE-000003", "login", "ID");
        lib.jsSendKeysForID("password", "123456", "login", "ID");
        Assert.assertTrue(lib.waitAndClickForID("login", "login", "ID"));
        Thread.sleep(2000);
        //Assert.assertEquals(lib.getCurrentUrl(), "");                    
    }
	
	
	@Test(priority = 2, description="Tries to navigate to Parental Control (passes)")
	public void parentallink() throws InterruptedException, IOException {
		lib.waitAndClickForID("parentallink", "dashboard", "linktext");
	}
	/*
	@Test(priority = 3, description="Tries to navigate to Parental Control (passes)")
	public void advancedlink() throws InterruptedException, IOException {
		lib.waitAndClickForID("advancedlink", "dashboard", "ID");
		
		
		
		@Test(priority = 4, description="Tries to navigate to Blocked List (passes)")
	public void selectlink() throws InterruptedException, IOException {
		lib.waitAndClickForID("selectlink", "dashboard", "ID");
	}
	}*/
	
	
	@Test(priority = 4, description="Tries to navigate to Blocked List (passes)")
	public void advancedlink() throws InterruptedException, IOException {
		lib.waitAndClickForID("advancedlink", "dashboard", "ID");
	}
	
	@Test(priority = 4, description="Tries to navigate to Advanced List (passes)")
	public void selectlink() throws InterruptedException, IOException {
		try {
			Thread.sleep(1000);
			((WebDriver) lib).findElement(By.cssSelector("label[for='auctions']")).click();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		//lib.waitAndClickForID("selectlink", "dashboard", "ID");
	}
	
	
	@Test(priority = 4, description="Tries to navigate to Blocked List (passes)")
	public void selectlink2() throws InterruptedException, IOException {
		try {
			Thread.sleep(1000);
			((WebDriver) lib).findElement(By.cssSelector("label[for='abortion']")).click();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		//lib.waitAndClickForID("selectlink", "dashboard", "ID");
	}

	
	
	@Test(priority = 4, description="Tries to navigate to Blocked List (passes)")
	public void blockedlink() throws InterruptedException, IOException {
		lib.waitAndClickForID("blockedlink", "dashboard", "ID");
	}
	
	@Test(priority = 5, description="Tries to navigate to Custom List (passes)")
	public void customlink() throws InterruptedException, IOException {
		lib.waitAndClickForID("customlink", "dashboard", "ID");
	}
	
	@Test(priority = 8, description="Perform Send Mail for New Connection (passes)")
	public void Customurl() throws InterruptedException, IOException {
		lib.jsSendKeysForID("url", "www.facebook.com", "dashboard", "ID");
		lib.waitAndClickForID("Customurl", "dashboard", "ID");
	}
	/*
	@Test(priority = 1, description="Tries to navigate to About US Page (passes)")
	public void Aboutlink() throws InterruptedException, IOException {
		lib.waitAndClickForID("Aboutlink", "login", "linktext");
	}
	
	@Test(priority = 2, description="Tries to navigate to Plans Page (passes)")
	public void Planslink() throws InterruptedException, IOException {
		lib.waitAndClickForID("Planslink", "login", "linktext");
	}
	
	@Test(priority = 3, description="Tries to navigate to Pay Bill Page (passes)")
	public void Paybilllink() throws InterruptedException, IOException {
		lib.waitAndClickForID("Paybilllink", "login", "linktext");
	}
	
	
	@Test(priority = 4, description="Tries to navigate to Contact US Page (passes)")
	public void CUlink() throws InterruptedException, IOException {
		lib.waitAndClickForID("CUlink", "login", "linktext");
	}
	/*
	@Test(priority = 5, description="Tries to navigate to Myone8 Page (passes)")
	public void myone8link() throws InterruptedException, IOException {
		lib.waitAndClickForID("myone8link", "login", "linktext");
	}*/
	
/*
	@Test(priority = 6, description="Perform Send Mail for Contact US  (passes)")
	public void sendlink() throws InterruptedException, IOException {
		lib.jsSendKeysForID("name", "Test", "login", "ID");
		lib.jsSendKeysForID("email", "Test@test.com", "login", "ID");
		lib.jsSendKeysForID("subject", "Test", "login", "ID");
		lib.jsSendKeysForID("message", "Testing contsct us", "login", "ID");
		Assert.assertTrue(lib.waitAndClickForID("sendlink", "login", "ID"));
		Thread.sleep(2000);
		//Assert.assertEquals(lib.getCurrentUrl(), "http://marcus.oneeight.co.in/zeno/dashboard");					
	}
	

	@Test(priority = 7, description="Tries to navigate to New Connection Page (passes)")
	public void NClink() throws InterruptedException, IOException {
		lib.waitAndClickForID("NClink", "login", "linktext");
	}

	@Test(priority = 8, description="Perform Send Mail for New Connection (passes)")
	public void Nconlink() throws InterruptedException, IOException {
		lib.jsSendKeysForID("name", "Test", "login", "ID");
		lib.jsSendKeysForID("email", "Test@test.com", "login", "ID");
		lib.jsSendKeysForID("mobile", "9876543210", "login", "ID");
		lib.jsSendKeysForID("city", "Testin", "login", "ID");
		lib.jsSendKeysForID("pincode", "560076", "login", "ID");
		lib.waitAndClickForID("Nconlink", "login", "ID");
	}
	
		
	@Test(priority = 9, description="Tries to navigate to privacy (passes)")
	public void clickPrivacy() throws InterruptedException, IOException {
		lib.waitAndClickForID("privacylink", "login", "linktext");
	}
	
	@Test(priority = 10, description="Tries to navigate to Terms And Condition (passes)")
	public void clickTerms() throws InterruptedException, IOException {
		lib.waitAndClickForID("clickTerms", "login", "linktext");
	}
	
	@Test(priority = 11, description="Tries to navigate to Refund page (passes)")
	public void clickRefund() throws InterruptedException, IOException {
		lib.waitAndClickForID("refundlink", "login", "linktext");
	}
			
	@Test(priority = 12, description="Tries to navigate to FAQ (passes)")
	public void clickfaq() throws InterruptedException, IOException {
		lib.waitAndClickForID("faqlink", "login", "linktext");
	}
	*/
	@AfterTest()
	public void afterMethod() throws IOException {
		driver.quit();		
	}	
}
