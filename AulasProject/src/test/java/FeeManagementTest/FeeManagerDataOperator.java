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

public class FeeManagerDataOperator extends BaseTest{
LoginClass LC;
	
    HomePage1 HP;
	
    FeeManagementPage FM;

	
	public FeeManagerDataOperator () {
		super();
	}
	
	@BeforeSuite
	public void setup()throws InterruptedException{
		initilization();
		

		FM=new  FeeManagementPage();

		LC = new LoginClass();
		
		HP = LC.newLogin(prop.getProperty("username"),prop.getProperty("password"));
	 
	 
		
	
}
@Test(priority=20)
public void DataOperatorLogIn() throws InterruptedException{
WaitTil(2000);
HP = LC.TeacherMobileLogin(prop.getProperty("DataOperator"), prop.getProperty("OTP"));
WaitTil(2000);
}
@Test(priority=1)
public void DOPSettings() throws InterruptedException
{
	Thread.sleep(2000);
	FM.settings();
}



@Test(priority=2)
public void DOPGenerateOnlineRequest() throws InterruptedException {
	Thread.sleep(2000);
	FM.GeneratePaymentRequest();
	
}
@Test(priority=3)
public void DOPEntireClass() throws InterruptedException
{
	Thread.sleep(2000);
	FM.PaymentRequestForClass();
}
@Test(priority=4)
public void DOPFeeManagementpage() throws InterruptedException
{
	Thread.sleep(2000);
	FM.FeemanagementPage();
}
@Test(priority=5)
public void DOPAddOfflinePaymnet() throws InterruptedException
{
	Thread.sleep(2000);
	FM.AddOfflinePaymnet();
	
	
}
@Test(priority=6)
public void DOPTransaction() throws InterruptedException {
	Thread.sleep(2000);
	FM.Transaction();
}
@Test(priority=7)

	public void DOPAllStudents() throws InterruptedException {
	Thread.sleep(2000);
	FM.StudentAll();

}

@Test(priority=8)
public void DOPRecentActivityLogs() {
	
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
public void DataOperatorLogOut() throws InterruptedException{
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
