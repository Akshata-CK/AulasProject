package PracticeTest;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.HomePage1;
import Pages.LoginClass;
import Pages.PracticeTestPage;

public class PracticeTestStudent  extends BaseTest{
	LoginClass LC;
    HomePage1 HP;
    PracticeTestPage PC;
  

	
	public PracticeTestStudent () {
		super();
	}
	
	@BeforeSuite
	public void setup()throws InterruptedException{
		initilization();
		

		PC=new  PracticeTestPage();

		LC = new LoginClass();
		
		HP = LC.DataOperatorMobileLogin(prop.getProperty("Student"),prop.getProperty("OTP"));
		
		}
	@Test(priority=1)
	public void Overview() throws InterruptedException
	{
	//	PC.Overview();
		wait(2000);
		//PC. AllTypeTest("Chapter Test");
		PC.TestType();
	}

}
