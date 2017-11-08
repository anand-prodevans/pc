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
		driver = Dlib.openBrowser("phantomjs");
		lib = new LibraryForGenericFunction(driver);
		// Application link will be opened
		driver.get("http://52.172.221.191/zeno/login");
	}

	@Test(priority = 1, description="Performs an unsuccessful login and checks the resulting error message (passes)")
	public void unsuccessfullogin() throws InterruptedException, IOException {
		lib.jsSendKeysForID("username", "ROL000033", "login", "ID");
		lib.jsSendKeysForID("password", "123456", "login", "ID");
		Assert.assertTrue(lib.waitAndClickForID("login", "login", "ID"));
		Thread.sleep(2000);
		Assert.assertTrue(lib.getText("error", "login", "class").contains("Your One8 ID is incorrect"));					
	}
	
	
	@Test(priority = 2, description="Performs an successful login and checks the dashboard url (passes)")
    public void login() throws InterruptedException, IOException {
        lib.jsSendKeysForID("username", "OE-000004", "login", "ID");
        lib.jsSendKeysForID("password", "123456", "login", "ID");
        Assert.assertTrue(lib.waitAndClickForID("login", "login", "ID"));
        Thread.sleep(2000);
        //Assert.assertEquals(lib.getCurrentUrl(), "");                    
    }
	

	@Test(priority = 3,description="Checks for the welcome message (passes)")
	public void verifyWelcomeMesg() throws InterruptedException, IOException {
		Assert.assertEquals(lib.getText("welcomemesg", "dashboard", "class"), "Welcome Jayaram, to your One8 page");			
	}	
	
	@Test(priority = 4, description="Tries to navigate to privacy Page(passes)")
	public void clickPrivacy() throws InterruptedException, IOException {
		lib.waitAndClickForID("privacylink", "login", "linktext");
	}
	
	@Test(priority = 5, description="Tries to navigate to Terms And Condition (passes)")
	public void clickTerms() throws InterruptedException, IOException {
		lib.waitAndClickForID("clickTerms", "login", "linktext");
	}
	
	@Test(priority = 6, description="Tries to navigate to Refund page (passes)")
	public void clickRefund() throws InterruptedException, IOException {
		lib.waitAndClickForID("refundlink", "login", "linktext");
	}
	
	@Test(priority = 7, description="Tries to navigate to Feedback (passes)")
	public void clickfeedback() throws InterruptedException, IOException {
		lib.waitAndClickForID("feedbacklink", "login", "linktext");
	}
	
	@Test(priority = 8, description="Performs an Feedback send mail  (passes)")
	public void sendfeedback() throws InterruptedException, IOException {
		lib.jsSendKeysForID("subject", "test", "login", "ID");
		lib.jsSendKeysForID("message", "testing1feedback", "login", "ID");
		Assert.assertTrue(lib.waitAndClickForID("sendnowfeedback", "login", "ID"));
		Thread.sleep(2000);
		//Assert.assertEquals(lib.getCurrentUrl(), "http://localhost:8080/zeno/contactusPage");					
	}
	
	@Test(priority = 9, description="Tries to navigate to FAQ (passes)")
	public void clickfaq() throws InterruptedException, IOException {
		lib.waitAndClickForID("faqlink", "login", "linktext");
	}
	@Test(priority = 10, description="Tries to navigate to Know your CPE (passes)")
	public void clickknowcpe() throws InterruptedException, IOException {
		lib.waitAndClickForID("knowlink", "login", "linktext");
	}
	
	
	
	@Test(priority = 11, description="Tries to navigate to Make Payment (passes)")
	public void clickPayment() throws InterruptedException, IOException {
		lib.waitAndClickForID("paymentlink", "dashboard", "linktext");
	}

	@Test(priority = 12, description="Tries to navigate to pay Bill (passes)")
	public void clickPayBill() throws InterruptedException, IOException {
		lib.waitAndClickForID("paybilllink", "dashboard", "linktext");
	}
	
	@Test(priority = 13, description="Tries to navigate to Contact us (passes)")
	public void clickcontact() throws InterruptedException, IOException {
		lib.waitAndClickForID("contactlink", "login", "linktext");
	}
	
	@Test(priority = 14, description="Perform Send Mail for Contact US  (passes)")
	public void sendlink() throws InterruptedException, IOException {
		lib.jsSendKeysForID("subject", "Test", "login", "ID");
		lib.jsSendKeysForID("message", "Testing contsctUS", "login", "ID");
		Assert.assertTrue(lib.waitAndClickForID("sendlink", "login", "ID"));
		Thread.sleep(2000);
		//Assert.assertEquals(lib.getCurrentUrl(), "http://marcus.oneeight.co.in/zeno/dashboard");					
	}
	
	
	@Test(priority = 15, description="Tries to navigate to Top up (passes)")
	public void clickTopUp() throws InterruptedException, IOException {
		//Assert.assertEquals(lib.getText("welcomemesg", "popup", "class"), "Welcome Saravanan, to your One8 page");
		lib.waitAndClickForID("topuplink", "dashboard", "ID");
	}
	
	@Test(priority = 16, description="Tries to navigate to Your Plan(passes)")
	public void clickPlan() throws InterruptedException, IOException {
		lib.waitAndClickForID("planlink", "dashboard", "ID");
	}

	@Test(priority = 17, description="Navigates to Profile page (passes)")
	public void clickProfile() throws InterruptedException, IOException {
		lib.waitAndClickForID("profilelink", "dashboard", "linktext");
	}
	
	@Test(priority = 18, description="Navigates to Service request page (passes)")
	public void clickService() throws InterruptedException, IOException {
		lib.waitAndClickForID("servicelink", "dashboard", "linktext");
	}
	
	@Test(priority = 19, description="Performs an Service request send mail  (passes)")
	public void sendnowrequest() throws InterruptedException, IOException {
		//lib.jsSendKeysForID("check", "New connection", "login", "ID");
		lib.jsSendKeysForID("message", "tellus", "login", "ID");
		Assert.assertTrue(lib.waitAndClickForID("sendnowrequest", "login", "ID"));
		Thread.sleep(2000);
		//Assert.assertEquals(lib.getCurrentUrl(), "http://localhost:8080/zeno/contactusPage");					
	}
	

	
	
	@Test(priority = 20, description="Tries to navigate to Parental Control (passes)")
	public void parentallink() throws InterruptedException, IOException {
		lib.waitAndClickForID("parentallink", "dashboard", "linktext");
	}
	
	
	@Test(priority = 21, description="Tries to navigate to Blocked List (passes)")
	public void advancedlink() throws InterruptedException, IOException {
		lib.waitAndClickForID("advancedlink", "dashboard", "ID");
	}
	
	@Test(priority = 22, description="Tries to navigate to Advanced List (passes)")
	public void selectlink() throws InterruptedException, IOException {
		try {
			Thread.sleep(1000);
			((WebDriver) lib).findElement(By.cssSelector("label[for='auctions']")).click();
			
		}catch(Exception e) {
			System.out.println(e);
		}	
	}
	
	
	@Test(priority = 23, description="Tries to navigate to Blocked List (passes)")
	public void selectlink2() throws InterruptedException, IOException {
		try {
			Thread.sleep(1000);
			((WebDriver) lib).findElement(By.cssSelector("label[for='abortion']")).click();
			
		}catch(Exception e) {
			System.out.println(e);
		}	
	}

	
	@Test(priority = 24, description="Tries to navigate to Blocked List (passes)")
	public void blockedlink() throws InterruptedException, IOException {
		lib.waitAndClickForID("blockedlink", "dashboard", "ID");
	}
	
	@Test(priority = 25, description="Tries to navigate to Custom List (passes)")
	public void customlink() throws InterruptedException, IOException {
		lib.waitAndClickForID("customlink", "dashboard", "ID");
	}
	
	@Test(priority = 26, description="Perform Custom blocking of email (passes)")
	public void Customurl() throws InterruptedException, IOException {
		lib.jsSendKeysForID("url", "www.facebook.com", "dashboard", "ID");
		lib.waitAndClickForID("Customurl", "dashboard", "ID");
	}
	
	
	@Test(priority = 27,description="Tries to navigate to Schedule part (passes)")
	public void Schedulelink() throws InterruptedException, IOException {
		lib.waitAndClickForID("Schedulelink", "dashboard", "ID");
	}
	
	@Test(priority = 28, description="Tries to navigate to Time schedule tab (passes)")
	public void timeschedule1() throws InterruptedException, IOException {
		lib.waitAndClickForID("timeschedule1", "dashboard", "ID");
	}
	
	@Test(priority = 29, description="Tries to pass value to Time schedule tab (passes)")
	public void timeblock() throws InterruptedException, IOException {
		lib.jsSendKeysForID("timeslot1", "17:10", "dashboard", "ID");
		lib.jsSendKeysForID("timeslot2", "11:10", "dashboard", "ID");
		lib.waitAndClickForID("timeblock", "dashboard", "ID");
	}
	
	@Test(priority = 30, description="Tries to navigate to Day schedule tab (passes)")
	public void dayschedule() throws InterruptedException, IOException {
		lib.waitAndClickForID("dayschedule", "dashboard", "ID");
	}
	
	@Test(priority = 31, description="Tries to pass value to Day schedule tab (passes)")
	public void dayblock() throws InterruptedException, IOException {
		lib.jsSendKeysForID("timeslot3", "17:10", "dashboard", "ID");
		lib.jsSendKeysForID("timeslot4", "11:10", "dashboard", "ID");
		//lib.waitAndClickForID("daysslot","dashboard","ID");
		lib.waitAndClickForID("dayblock", "dashboard", "ID");
	}
		
	@Test(priority = 32, description="Tries to navigate to dates schedule tab (passes)")
	public void dateschedule() throws InterruptedException, IOException {
		lib.waitAndClickForID("dateschedule", "dashboard", "ID");
	}
	

	@Test(priority = 33, description="Tries to pass value to Day schedule tab (passes)")
	public void dateblock() throws InterruptedException, IOException {
		lib.jsSendKeysForID("dateslot1", "17:10", "dashboard", "ID");
		lib.jsSendKeysForID("dateslot2", "11:10", "dashboard", "ID");
		lib.jsSendKeysForID("dateslot3", "2017/10/25", "dashboard", "ID");
		lib.jsSendKeysForID("dateslot4", "2017/10/29", "dashboard", "ID");
		lib.waitAndClickForID("block1", "dashboard", "ID");
	}
	
	@Test(priority = 34, description="Logs out (passes)")
	public void logout() throws InterruptedException, IOException {
		lib.waitAndClickForID("logoutlink", "dashboard", "linktext");
	}

	@AfterTest()
	public void afterMethod() throws IOException {
		driver.quit();		
	}	
	
}
