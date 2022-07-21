package FeeManagementTest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.FeeManagementPage;
import Pages.HomePage1;
import Pages.LoginClass;

public class FeeManagementAdmin extends BaseTest{
LoginClass LC;
	
    HomePage1 HP;
	
    FeeManagementPage FM;

	
	public FeeManagementAdmin () {
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
	public void OperatorLogIn() throws InterruptedException{
	WaitTil(2000);
	HP = LC.TeacherMobileLogin(prop.getProperty("Admin1"), prop.getProperty("OTP"));
	WaitTil(2000);
	}
	@Test(priority=2)
	public void  OperationSettings() throws InterruptedException
	{
		Thread.sleep(2000);
		FM.settings();
	}
	
	
	
	@Test(priority=3)
	public void  OperationGenerateOnlineRequest() throws InterruptedException {
		Thread.sleep(2000);
		FM.GeneratePaymentRequest();
		
	}
	@Test(priority=4)
	public void  OperationEntireClass() throws InterruptedException
	{
		Thread.sleep(2000);
		FM.PaymentRequestForClass();
	}
	@Test(priority=5)
	public void  OperationFeeManagementpage() throws InterruptedException
	{
		Thread.sleep(2000);
		FM.FeemanagementPage();
	}
	@Test(priority=6)
	public void  OperationAddOfflinePaymnet() throws InterruptedException
	{
		Thread.sleep(2000);
		FM.AddOfflinePaymnet();
		
		
	}
    @Test(priority=7)
	public void  OperationTransaction() throws InterruptedException {
		Thread.sleep(2000);
		FM.Transaction();
	}
	@Test(priority=8)
	
		public void  OperationAllStudents() throws InterruptedException {
		Thread.sleep(2000);
		FM.StudentAll();
	
	}
	
	@Test(priority=9)
	public void OperationRecentActivityLogs() {
		
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
	public void OperationLogOut() throws InterruptedException{
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