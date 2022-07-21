package Test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.FeeManagementPage;
import Pages.HomePage1;
import Pages.LoginClass;
import Pages.NotificationsPage;

	public class NotificationTest1 extends BaseTest{
		LoginClass LC;
			
		    HomePage1 HP;
			
		    NotificationsPage NP;

			
			public NotificationTest1 () {
				super();
			}
			
			@BeforeSuite
			public void setup()throws InterruptedException{
				initilization();
				

				NP=new   NotificationsPage();

				LC = new LoginClass();
				
				HP = LC.newLogin(prop.getProperty("username"),prop.getProperty("password"));
				
				

		}
			@Test(priority=1)
			public void Notification() throws InterruptedException
			{
				Thread.sleep(2000);
				NP.Notification();
			}
			@Test(priority=2)
			public void Announcemet() throws InterruptedException
			{
				Thread.sleep(2000);
				NP.Announcement();
			}
			@Test(priority=3)
			public void Assignments() throws InterruptedException
			{
				Thread.sleep(2000);
				NP.Assignments();
			}
			@Test(priority=4)
			public void Test() throws InterruptedException 
			{
				Thread.sleep(2000);
				NP.Test();
			}
			@Test(priority=5)
			public void PracticeTest() throws InterruptedException 
			{
				Thread.sleep(2000);
				NP.PracticeTest();
			}
          @Test(priority=6)
          public void DigitalLibrary() throws InterruptedException
          {
        	  Thread.sleep(2000);
			  NP.DigitalLibrary();
          }
          @Test(priority=7)
          public void FeeManagement() throws InterruptedException
          {
        	  Thread.sleep(2000);
			  NP.FeeManagement();
          }
          @Test(priority=8)
          public void Otheres() throws InterruptedException 
          {
        	  Thread.sleep(2000);
			  NP.Others(); 
          }
}
