package FeeManagementTest;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.FeeManagementPage;
import Pages.HomePage1;
import Pages.LoginClass;

public class FeemanagementOpration extends BaseTest{
	
LoginClass LC;
	
    HomePage1 HP;
	
    FeeManagementPage FM;

	
	public FeemanagementOpration () {
		super();
	}
	
	@BeforeSuite
	public void setup()throws InterruptedException{
		initilization();
		

		FM=new  FeeManagementPage();

		LC = new LoginClass();
		
		HP = LC.DataOperatorMobileLogin(prop.getProperty("OperationName"),prop.getProperty("OTP"));
	 
	}
	@Test(priority=1)
	public void validateFeemanagementPage() throws InterruptedException
	{
		wait(2000);
		FM.settings();
		FM.validateFeemanagementPage();
	}
	@Test(priority=2)
	public void  GeneratePaymentRequest() throws InterruptedException
	{
		wait(2000);
		FM. GeneratePaymentRequest();
	}
	@Test(priority=3)
	public void  PaymentRequestForClass() throws InterruptedException
	{
		wait(2000);
		FM. PaymentRequestForClass();
	}
	@Test(priority=4)
	public void  AddOfflinePaymnet() throws InterruptedException
	{  
		wait(2000);
		FM.AddAllOfflinePaymnets();
	}
	@Test(priority=5)
	public void  Transaction() throws InterruptedException
	{
		wait(2000);
		FM.Transaction();
	}
	@Test(priority=6)
	public void StudentAll() throws InterruptedException
	{
		wait(2000);
		FM.StudentAll();
	}
	@Test(priority=7)
	public void  recentActivity() throws InterruptedException
	{
		wait(2000);
		FM. recentActivity();
	}
	@Test(priority=8)
	public void StudentProfile()
	{
		wait(2000);
		FM.StudentProfile();
		
	}
}
