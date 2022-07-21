package FeeManagementTest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.FeeManagementPage;
import Pages.HomePage1;
import Pages.LoginClass;

public class FeeManagementOpearation extends BaseTest{
LoginClass LC;
	
    HomePage1 HP;
	
    FeeManagementPage FM;

	
	public FeeManagementOpearation () {
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
	public void AdminLogIn() throws InterruptedException{
	WaitTil(2000);
	HP = LC.TeacherMobileLogin(prop.getProperty("Operation1"), prop.getProperty("OTP"));
	WaitTil(2000);
	}
	@Test(priority=2)
	public void  AdminSettings() throws InterruptedException
	{
		Thread.sleep(2000);
		FM.settings();
	}
	
	
	
	@Test(priority=3)
	public void  AdminGenerateOnlineRequest() throws InterruptedException {
		Thread.sleep(2000);
		FM.GeneratePaymentRequest();
		
	}
	@Test(priority=4)
	public void AdminEntireClass() throws InterruptedException
	{
		Thread.sleep(2000);
		FM.PaymentRequestForClass();
	}
	@Test(priority=5)
	public void  AdminFeeManagementpage() throws InterruptedException
	{
		Thread.sleep(2000);
		FM.FeemanagementPage();
	}
	@Test(priority=6)
	public void AdminAddOfflinePaymnet() throws InterruptedException
	{
		Thread.sleep(2000);
		FM.AddOfflinePaymnet();
		
		
	}
    @Test(priority=7)
	public void  AdminTransaction() throws InterruptedException {
		Thread.sleep(2000);
		FM.Transaction();
	}
	@Test(priority=8)
	
		public void AdminAllStudents() throws InterruptedException {
		Thread.sleep(2000);
		FM.StudentAll();
	
	}
	
	@Test(priority=9)
	public void AdminRecentActivityLogs() {
		
		System.out.println("--------The test case 5 was started------- ");
		try {
			WaitTil(3000);
			FM.recentActivity();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test(priority=10)
	public void AdminLogOut() throws InterruptedException{
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
