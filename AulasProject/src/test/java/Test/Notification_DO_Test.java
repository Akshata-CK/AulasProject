package Test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.HomePage1;
import Pages.LoginClass;
import Pages.Notification_DO_Page;

public class Notification_DO_Test  extends BaseTest{
	 LoginClass LC;
	 HomePage1 HP;
	 Notification_DO_Page NP;

		
		public  Notification_DO_Test ()
		{
			super();
		}
		
		@BeforeSuite
		public void setup()throws InterruptedException{
			initilization();
			

			NP=new  Notification_DO_Page();

			LC = new LoginClass();
			
			HP = LC.DataOperatorMobileLogin(prop.getProperty("DataOperatorPh"),prop.getProperty("OTP"));
			

}
		@Test(priority=1)
		public void AllNotification() throws InterruptedException 
		{
			Thread.sleep(2000);
			NP.AllNotification();
		
		}
		@Test(priority=2)
		public void Announcements() throws InterruptedException {
			Thread.sleep(2000);
			NP.Announcements();
			
		}
		@Test(priority=3)
		public void Assignments() throws InterruptedException {
			Thread.sleep(2000);
			NP.Assignments();
			
		}
		@Test(priority=4)
		public void Test() throws InterruptedException {
			Thread.sleep(2000);
			NP.Test();
			
			
		}
		@Test(priority=5)
		public void Practice() throws InterruptedException {
			Thread.sleep(2000);
			NP.Practice();
		
}
}
