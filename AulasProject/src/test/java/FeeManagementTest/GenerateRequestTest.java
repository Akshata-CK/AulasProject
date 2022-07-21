package FeeManagementTest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.AnnouncementPage;
import Pages.FeeManagementPage;
import Pages.HomePage1;
import Pages.LoginClass;

public class GenerateRequestTest extends BaseTest{
LoginClass LC;
	
    HomePage1 HP;
	
    FeeManagementPage FM;

	
	public GenerateRequestTest () {
		super();
	}
	
	@BeforeSuite
	public void setup()throws InterruptedException{
		initilization();
		

		FM=new  FeeManagementPage();

		LC = new LoginClass();
		
		HP = LC.newLogin(prop.getProperty("username"),prop.getProperty("password"));
	 
	 
		
	
}
	
	@Test(priority=1)
	public void Settings() throws InterruptedException
	{
		Thread.sleep(2000);
		FM.settings();
	}
	
	
	
	@Test(priority=2)
	public void GenerateOnlineRequest() throws InterruptedException {
		Thread.sleep(2000);
		FM.GeneratePaymentRequest();
		
	}
	@Test(priority=3)
	public void EntireClass() throws InterruptedException
	{
		Thread.sleep(2000);
		FM.PaymentRequestForClass();
	}
	@Test(priority=4)
	public void FeeManagementpage() throws InterruptedException
	{
		Thread.sleep(2000);
		FM.FeemanagementPage();
	}
	@Test(priority=5)
	public void AddOfflinePaymnet() throws InterruptedException
	{
		Thread.sleep(2000);
		FM.AddOfflinePaymnet();
		
		
	}
    @Test(priority=6)
	public void Transaction() throws InterruptedException {
		Thread.sleep(2000);
		FM.Transaction();
	}
	@Test(priority=7)
	
		public void AllStudents() throws InterruptedException {
		Thread.sleep(2000);
		FM.StudentAll();
	
	}
	
	@Test(priority=8)
	public void RecentActivityLogs() {
		
		System.out.println("--------The test case 5 was started------- ");
		try {
			WaitTil(3000);
			FM.recentActivity();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test(priority=9)
	public void SuperAdminLogOut() throws InterruptedException{
	Thread.sleep(2000);
	LC.LogOut();
	Thread.sleep(2000);
	}
	
	
	
	
	@AfterSuite
	public void taerDown()
	{
		driver.quit();
	}
}
