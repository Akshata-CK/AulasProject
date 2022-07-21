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



public class AulasCare_DataOperatorTest  extends BaseTest{
    LoginClass LC;
    HomePage1 HP;
	AulasCarePage1 AC;

	
	public AulasCare_DataOperatorTest () {
		super();
	}
	
	@BeforeSuite
	public void setup()throws InterruptedException{
		initilization();
		

		AC=new  AulasCarePage1();

		LC = new LoginClass();
		
		HP = LC.DataOperatorMobileLogin(prop.getProperty("DataOperator"),prop.getProperty("OTP"));
		
		}
	
	@Test(priority=1)
	public void ChatWithInstitute() throws InterruptedException, AWTException 
	{
		Thread.sleep(2000);
		AC.ChatwithInstituteDOp();
	}
	@Test(priority=2)
	public void CallInstitute() throws InterruptedException
	{
		Thread.sleep(2000);
		AC.CallYourInstitute() ;
	}
	
	@Test(priority=3)
	public void FAQs() throws InterruptedException
	{

		Thread.sleep(2000);
		AC.FAQs();
	}
	
	@Test(priority=4)
	public void ChatWithTeam() throws InterruptedException, AWTException
	{
		Thread.sleep(2000);
		AC.ChatwithAulasTeamTeacher() ;
	}
	
	@Test(priority=5)
	public void CallAulas() throws InterruptedException
	{
		Thread.sleep(2000);
		AC.callaulasTeam();
	}
	@Test(priority=6)
	public void Covid19Resource() throws InterruptedException
	{
		Thread.sleep(2000);
		AC.Covid19resource();
	}
	
}
