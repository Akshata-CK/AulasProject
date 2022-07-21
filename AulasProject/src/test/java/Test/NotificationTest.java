package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.HomePage1;
import Pages.LoginClass;
import Pages.NotificationPage;

public class NotificationTest extends BaseTest{
	NotificationPage NP;
	LoginClass LC;
    HomePage1 HP;
	
	public NotificationTest() {
		super();
	}
	
	@BeforeSuite
	public void setup() throws InterruptedException{
		initilization();
		
		NP=new NotificationPage();

		LC = new LoginClass();
		
	
	  HP = LC.newLogin(prop.getProperty("username"),prop.getProperty("password"));
		
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(2000);
		WebElement Notification1 = driver.findElement(By.xpath("//span[text()='Notification']"));
		Thread.sleep(2000);
      	js.executeScript("arguments[0].scrollIntoView(true)", Notification1);
      	
		
	}
	//*********************Super Admin *****************//
	
   @Test(priority=1,groups="Notification Module")
	public void Notification() throws InterruptedException
	{
		Thread.sleep(2000);
		NP.Notification();
		
		
	}
   
	@Test(priority=2,groups="Notification Module")
	public void Announcement() throws InterruptedException
	{
		Thread.sleep(2000);
		NP.Announcements();
		
	}
	@Test(priority=3,groups="Notification Module")
	public void Assignment() throws InterruptedException
	{
		Thread.sleep(2000);
		NP.Assignments();
		
	}
	@Test(priority=4,groups="Notification Module")
	public void Test() throws InterruptedException
	{
		Thread.sleep(2000);
		NP.Test();
		
	}
	@Test(priority=5,groups="Notification Module")
	public void PracticeTest() throws InterruptedException
	{
		Thread.sleep(2000);
		NP.PracticeTest();
	}
	
	@Test(priority=6,groups="Notification Module")
	public void DigitalLibrary() throws InterruptedException
	{
		Thread.sleep(2000);
		NP.DigitaLibrary();
	}
	@Test(priority=7,groups="Notification Module")
	public void FeeManagement() throws InterruptedException
	{
		Thread.sleep(2000);
		NP.FeeManagement();
	}
	@Test(priority=8,groups="Notification Module")
	public void Others() throws InterruptedException
	{
		Thread.sleep(2000);
		NP.Others();
	}
	
	
	@Test(priority=9)
	public void SuperAdminLogOut() throws InterruptedException{
	Thread.sleep(2000);
	LC.LogOut();
	Thread.sleep(2000);
	}
	
	//****************Data Operator********************
	@Test(priority=10)
	public void DataOperatorLogIn() throws InterruptedException{
	WaitTil(2000);
	HP = LC.DataOperatorMobileLogin(prop.getProperty("DataOperatorPh"), prop.getProperty("OTP"));
	WaitTil(2000);
	JavascriptExecutor js= (JavascriptExecutor)driver;
	Thread.sleep(2000);
	WebElement Notification1 = driver.findElement(By.xpath("//span[text()='Notification']"));
	Thread.sleep(2000);
  	js.executeScript("arguments[0].scrollIntoView(true)", Notification1);

	}
	
	@Test(priority=11,groups="Notification Module")
	public void Notification1() throws InterruptedException
	{
		Thread.sleep(2000);
		NP.Notification();
		
	}
	@Test(priority=12,groups="Notification Module")
	public void Announcement1() throws InterruptedException
	{
		Thread.sleep(2000);
		NP.Announcements();
		
	}
	@Test(priority=14,groups="Notification Module")
	public void Assignment1() throws InterruptedException
	{
		Thread.sleep(2000);
		NP.Assignments();
		
	}
	@Test(priority=15,groups="Notification Module")
	public void Test1() throws InterruptedException
	{
		Thread.sleep(2000);
		NP.Test();
		
	}
	@Test(priority=16,groups="Notification Module")
	public void PracticeTest1() throws InterruptedException
	{
		Thread.sleep(2000);
		NP.PracticeTest1();
	}
	
	@Test(priority=17)
	public void DataOperatorLogOut() throws InterruptedException{
	Thread.sleep(2000);
	LC.LogOut();
	Thread.sleep(2000);
	}
	
	
	//********************Teacher***********************
	@Test(priority=18)
	public void TeacherLogIn() throws InterruptedException{
	WaitTil(2000);
	HP = LC.TeacherMobileLogin(prop.getProperty("Teacher"), prop.getProperty("OTP"));
	WaitTil(2000);
	JavascriptExecutor js= (JavascriptExecutor)driver;
	Thread.sleep(2000);
	WebElement Notification1 = driver.findElement(By.xpath("//span[text()='Notification']"));
	Thread.sleep(2000);
  	js.executeScript("arguments[0].scrollIntoView(true)", Notification1);

}

	@Test(priority=19,groups="Notification Module")
	public void Notification2() throws InterruptedException
	{
		Thread.sleep(2000);
		NP.Notification();
		
	}
	@Test(priority=20,groups="Notification Module")
	public void Announcement2() throws InterruptedException
	{
		Thread.sleep(2000);
		NP.Announcements();
		
	}
	@Test(priority=21,groups="Notification Module")
	public void Assignment3() throws InterruptedException
	{
		Thread.sleep(2000);
		NP.Assignments();
		
	}
	@Test(priority=22,groups="Notification Module")
	public void Test2() throws InterruptedException
	{
		Thread.sleep(2000);
		NP.Test();
		
	}
	@Test(priority=23,groups="Notification Module")
	public void PracticeTest3() throws InterruptedException
	{
		Thread.sleep(2000);
		NP.PracticeTest1();
	}

	@Test(priority=24,groups="Notification Module")
	public void DigitalLibrary1() throws InterruptedException
	{
		Thread.sleep(2000);
		NP.DigitaLibrary();
		Thread.sleep(2000);
	}
	
	@Test(priority=25)
	public void TeacherLogOut() throws InterruptedException{
	Thread.sleep(2000);
	LC.LogOut();
	Thread.sleep(2000);
	
	}
	
	//**************** Admin ********************
	
	@Test(priority=26)
	public void AdminLogIn() throws InterruptedException{
	WaitTil(2000);
	HP = LC.AdminMobileLogin(prop.getProperty("Admin"), prop.getProperty("OTP"));
	WaitTil(2000);
	JavascriptExecutor js= (JavascriptExecutor)driver;
	Thread.sleep(2000);
	WebElement Notification1 = driver.findElement(By.xpath("//span[text()='Notification']"));
	Thread.sleep(2000);
  	js.executeScript("arguments[0].scrollIntoView(true)", Notification1);
}
	@Test(priority=27,groups="Notification Module")
	public void Notification3() throws InterruptedException
	{
		Thread.sleep(2000);
		NP.Notification();
		
	}
	@Test(priority=28,groups="Notification Module")
	public void Announcement3() throws InterruptedException
	{
		Thread.sleep(2000);
		NP.Announcements();
		
	}
	@Test(priority=29,groups="Notification Module")
	public void Assignment4() throws InterruptedException
	{
		Thread.sleep(2000);
		NP.Assignments();
		
	}
	@Test(priority=30,groups="Notification Module")
	public void Test3() throws InterruptedException
	{
		Thread.sleep(2000);
		NP.Test();
		
	}
	@Test(priority=31,groups="Notification Module")
	public void PracticeTest4() throws InterruptedException
	{
		Thread.sleep(2000);
		NP.PracticeTest1();
	}
	@Test(priority=32,groups="Notification Module")
	public void Other1() throws InterruptedException
	{
		Thread.sleep(2000);
		NP.Other1();
	}
	
	
	@Test(priority=33)
	public void AdminLogOut() throws InterruptedException{
	Thread.sleep(2000);
	LC.LogOut();
	Thread.sleep(2000);
	}
	
	//*************Operation ****************
	
	@Test(priority=34)
	public void OperationLogIn() throws InterruptedException{
	WaitTil(2000);
	HP = LC.OperationMobileLogin(prop.getProperty("Operation"), prop.getProperty("OTP"));
	WaitTil(2000);
	JavascriptExecutor js= (JavascriptExecutor)driver;
	Thread.sleep(2000);
	WebElement Notification1 = driver.findElement(By.xpath("//span[text()='Notification']"));
	Thread.sleep(2000);
  	js.executeScript("arguments[0].scrollIntoView(true)", Notification1);
}
	@Test(priority=35,groups="Notification Module")
	public void Notification4() throws InterruptedException
	{
		Thread.sleep(2000);
		NP.Notification();
		
	}
	@Test(priority=36,groups="Notification Module")
	public void Announcement4() throws InterruptedException
	{
		Thread.sleep(2000);
		NP.Announcements();
		
	}
	@Test(priority=37)
	public void OperationLogOut() throws InterruptedException{
	Thread.sleep(2000);
	LC.LogOut();
	Thread.sleep(2000);
	}
	
	//****************Student ******************
	@Test(priority=38)
	public void StudentLogIn() throws InterruptedException{
	WaitTil(2000);
	HP = LC.OperationMobileLogin(prop.getProperty("Student"), prop.getProperty("OTP"));
	WaitTil(2000);
	JavascriptExecutor js= (JavascriptExecutor)driver;
	Thread.sleep(2000);
	WebElement Notification1 = driver.findElement(By.xpath("//span[text()='Notification']"));
	Thread.sleep(2000);
  	js.executeScript("arguments[0].scrollIntoView(true)", Notification1);
	}
	
	 @Test(priority=39,groups="Notification Module")
		public void Notification5() throws InterruptedException
		{
			Thread.sleep(2000);
			NP.Notification();
			
			
		}
	   
		@Test(priority=40,groups="Notification Module")
		public void Announcement5() throws InterruptedException
		{
			Thread.sleep(2000);
			NP.Announcements();
			
		}
		@Test(priority=41,groups="Notification Module")
		public void Assignment5() throws InterruptedException
		{
			Thread.sleep(2000);
			NP.Assignments();
			
		}
		@Test(priority=42,groups="Notification Module")
		public void Test5() throws InterruptedException
		{
			Thread.sleep(2000);
			NP.Test();
			
		}
		@Test(priority=43,groups="Notification Module")
		public void PracticeTest5() throws InterruptedException
		{
			Thread.sleep(2000);
			NP.PracticeTest2();
		}
		
		
		@Test(priority=44,groups="Notification Module")
		public void FeeManagement4() throws InterruptedException
		{
			Thread.sleep(2000);
			NP.FeeManagement();
}
		@Test(priority=45,groups="Notification Module")
		public void DigitalLibrary4() throws InterruptedException
		{
			Thread.sleep(2000);
			NP.DigitaLibrary();
		}
		@Test(priority=46)
		public void StudentLogOut() throws InterruptedException{
		Thread.sleep(2000);
		LC.LogOut();
		Thread.sleep(2000);
		}
}

