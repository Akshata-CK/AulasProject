package FeeManagementTest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.FeeManagementPage;
import Pages.HomePage1;
import Pages.LoginClass;

public class FeemanagementTeacher extends BaseTest{
LoginClass LC;
	
    HomePage1 HP;
	
    FeeManagementPage FM;

	
	public FeemanagementTeacher () {
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
	public void Teacher1LogIn() throws InterruptedException{
	WaitTil(2000);
	HP = LC.TeacherMobileLogin(prop.getProperty("Teacher1"), prop.getProperty("OTP"));
	WaitTil(2000);
	}
	@Test(priority=2)
	public void TeacherSettings() throws InterruptedException
	{
		Thread.sleep(2000);
		FM.settings();
	}
	
	
	
	@Test(priority=3)
	public void TeacherGenerateOnlineRequest() throws InterruptedException {
		Thread.sleep(2000);
		FM.GeneratePaymentRequest();
		
	}
	@Test(priority=4)
	public void TeacherEntireClass() throws InterruptedException
	{
		Thread.sleep(2000);
		FM.PaymentRequestForClass();
	}
	@Test(priority=5)
	public void TeacherFeeManagementpage() throws InterruptedException
	{
		Thread.sleep(2000);
		FM.FeemanagementPage();
	}
	@Test(priority=6)
	public void TeacherAddOfflinePaymnet() throws InterruptedException
	{
		Thread.sleep(2000);
		FM.AddOfflinePaymnet();
		
		
	}
    @Test(priority=7)
	public void TeacherTransaction() throws InterruptedException {
		Thread.sleep(2000);
		FM.Transaction();
	}
	@Test(priority=8)
	
		public void TeacherAllStudents() throws InterruptedException {
		Thread.sleep(2000);
		FM.StudentAll();
	
	}
	
	@Test(priority=9)
	public void TeacherRecentActivityLogs() {
		
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
	public void TeacherLogOut() throws InterruptedException{
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