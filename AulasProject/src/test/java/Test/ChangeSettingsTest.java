package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.AnnouncementPage;
import Pages.HomePage1;
import Pages.LoginClass;
import Pages.UserManagementPage;

public class ChangeSettingsTest extends BaseTest{
	LoginClass LC;
	
    HomePage1 HP;
	
	AnnouncementPage AP;
	UserManagementPage UM;

	
	public ChangeSettingsTest() {
		super();
	}
	
	@BeforeMethod
	public void setup()throws InterruptedException{
		initilization();
		

		AP=new AnnouncementPage();

		LC = new LoginClass();
		UM=new  UserManagementPage();
		
		HP = LC.newLogin(prop.getProperty("username"),prop.getProperty("password"));
		
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement Communication = driver.findElement(By.xpath("//div[text()='Communication']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", Communication);
		
	}
	/*@Test()
	public void changeSettingsValidate() {
		try {
			UM.settingsValidate();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}*/
}