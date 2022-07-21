package Test;



import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.AulasCarePage1;
import Pages.HomePage1;
import Pages.LoginClass;



public class AluasCareAdmin  extends BaseTest{
    LoginClass LC;
    HomePage1 HP;
	AulasCarePage1 AC;

	
	public AluasCareAdmin () {
		super();
	}
	
	@BeforeSuite
	public void setup()throws InterruptedException{
		initilization();
		

		AC=new  AulasCarePage1();

		LC = new LoginClass();
		
		HP = LC.DataOperatorMobileLogin(prop.getProperty("Admin"),prop.getProperty("OTP"));
		
		}
	
	@Test(priority=1)
	public void Support() throws InterruptedException, AWTException
	{
		WaitTil(2000);
		AC.AulascareSupport();
		AC.calendarPart();
	}
	@Test(priority=2)
	public void ViewAll() throws InterruptedException, AWTException {
		WaitTil(2000);
		AC.ViewAll();
		wait(2000);
		AC.AllRoles();
			
	}
	@Test(priority=3)
	public void chat() throws InterruptedException, AWTException
	{
		wait(2000);
		AC.rolesname("Teacher");
	}
	@Test(priority=4)
	public void FAQs() throws InterruptedException
	{
		wait(2000);
		AC.FAQs();
	}


	@Test(priority=5)
	public void chatwithAulasteam() throws InterruptedException, AWTException
	{
		wait(2000);
		AC.chatwithAulasteam();
	}
	@Test(priority=6)
	public void callaulasTeam() throws InterruptedException
	{
		wait(2000);
		AC.callaulasTeam();
	}
	@Test(priority=7)
	public void Covid19resource() throws InterruptedException
	{
		wait(2000);
		AC.Covid19resource();
	}
	
	
}


