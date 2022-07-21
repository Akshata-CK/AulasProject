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



public class AulasCareTeacher  extends BaseTest{
    LoginClass LC;
    HomePage1 HP;
	AulasCarePage1 AC;

	
	public AulasCareTeacher () {
		super();
	}
	
	@BeforeSuite
	public void setup()throws InterruptedException{
		initilization();
		

		AC=new  AulasCarePage1();

		LC = new LoginClass();
		
		HP = LC.DataOperatorMobileLogin(prop.getProperty("Teacher"),prop.getProperty("OTP"));
		
		}
	
	@Test(priority=1)
	public void ChatWithInstitute() throws InterruptedException, AWTException 
	{
		Thread.sleep(2000);
		AC.ChatWithInstitute();
	}
	@Test(priority=2)
	public void CallInstitute() throws InterruptedException
	{
		Thread.sleep(2000);
		AC.CallYourInstitute();
	}
	
	@Test(priority=3)
	public void FAQs() throws InterruptedException
	{
		Thread.sleep(2000);
		AC. FAQs();
	}
	@Test(priority=4)
	public void Covid19resource() throws InterruptedException
	{
		wait(2000);
		AC.Covid19resource();
	}
	@Test(priority=5)
	public void chatwithAulasteam() throws InterruptedException, AWTException
	{
		wait(2000);
		AC.ChatwithAulasTeamTeacher();
	}
	@Test(priority=6)
	public void callaulasTeamTracher() throws InterruptedException
	{
		wait(2000);
		AC.callaulasTeamTracher();
		
	}
	
	
	
}


