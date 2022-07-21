package Pages;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Aulas_Base.BaseTest;

public class AulasCarePage1  extends BaseTest{
	public void ScrollDown() throws InterruptedException {
		wait(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		wait(2000);
		WebElement Communication = driver.findElement(By.xpath("//div[text()='Communication']"));
		wait(2000);
		js.executeScript("arguments[0].scrollIntoView(true)", Communication);
		wait(2000);
	}
	public void ClickonAulas() throws InterruptedException
	{
		ScrollDown();
		wait(4000);
		driver.findElement(By.xpath("//a[contains(@href, '/care')]")).click();
		wait(6000);
		WebElement ele=driver.findElement(By.xpath("//div[@class='careCard cursor-pointer']"));
		Wait(ele);
		ele.click();
		
	}

	public void  AulascareSupport() throws InterruptedException, AWTException
	{
		ScrollDown();
		ClickonAulas();
		WebElement Totalconversation = driver.findElement(By.xpath("(//div[@class='adminStatusCard-rows'])[1]"));
		String Total=Totalconversation.getText();
		System.out.println("totla conversation:------"+Total);
		wait(2000);
		WebElement ClosedConversation = driver.findElement(By.xpath("(//div[@class='adminStatusCard-rows'])[2]"));
		String TotalClose=ClosedConversation.getText();
		System.out.println("totla  closed conversation:------"+TotalClose);
		wait(2000);
		WebElement OpeanConversation = driver.findElement(By.xpath("(//div[@class='adminStatusCard-rows'])[2]"));
		String TotalOpen=OpeanConversation.getText();
		System.out.println("totla  opened conversation:------"+TotalOpen);
		wait(2000);
		//all latest conversation 
		List<WebElement> latestconversation =driver.findElements(By.xpath("//div[@class='careUserCard']"));
		int size=latestconversation.size();
		System.out.println(" total size of the conversation :--------"+size);
		 for (int i = 1; i < size; i++) {
	            String conversationName = driver
	                    .findElement(By.xpath("(//div[@class='careUserCard'])[" + i + "]")).getText();
	            System.out.println("all the latest conversation list:-------"+conversationName);
		
		}
	}
	public void calendarPart()
	{
		wait(2000);
		//click on calendar
		driver.findElement(By.cssSelector(".ant-select-selector")).click();
		wait(2000);
		driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[1]")).click();
		wait(2000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-calendar antCalenderIcon']")).click();
		wait(2000);
		driver.findElement(By.xpath("//div[@class='ant-picker-input ant-picker-input-active']")).click();
		wait(2000);
		driver.findElement(By.xpath("(//div[@class='ant-picker-cell-inner'])[2]")).click();
		wait(2000);
		driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-sm']")).click();
		wait(2000);
		driver.findElement(By.xpath("(//div[@class='ant-picker-cell-inner'])[8]")).click();
		wait(2000);
		driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-sm']")).click();
		wait(2000);
	}
	public void ViewAll() throws InterruptedException
	{
		 ClickonAulas();
		//click on view all 
		wait(2000);
		driver.findElement(By.xpath("//h3[@class='userCards_viewAll']")).click();
		wait(2000);
		List<WebElement> Allconversation =driver.findElements(By.xpath("//div[@class='careUserCard']"));
		int size=Allconversation.size();
		System.out.println(" total size of the conversation :--------"+size);
		 for (int i = 1; i < size; i++) {
	            String conversation = driver
	                    .findElement(By.xpath("(//div[@class='careUserCard'])[" + i + "]")).getText();
	            System.out.println("all the latest conversation list:-------"+conversation);
		
	}
}
	public void AllRoles() 
	{
		wait(2000);
		//click on all
		driver.findElement(By.xpath("//div[@class='ant-select-selector']")).click();
		wait(2000);
		List<WebElement> AllRoles=driver.findElements(By.xpath("//div[@class='ant-select-item-option-content']"));
		int size1=AllRoles.size();
		System.out.println(" all the roles size:-----"+size1);
		for(int i=1;i<=size1;i++)
		{
			wait(2000);
			String RoleNames = driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[" + i + "]"))
					.getText();
			System.out.println("All the roles name :-------"+RoleNames);
			
		}
	}
		public void rolesname(String names) throws InterruptedException, AWTException
		{
			wait(2000);
			driver.findElement(By.xpath("//span[@class='ant-input-affix-wrapper']")).click();
			wait(2000);
			//click on all
			driver.findElement(By.xpath("//div[@class='ant-select-selector']")).click();
			wait(2000);
			//driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[1]")).click();
		//	wait(2000);
			if(names.equalsIgnoreCase("Teacher"))
			{
				
				//click on teacher
				wait(2000);
				driver.findElement(By.xpath("//*[@class='rc-virtual-list-holder-inner']/div[2]")).click();
				wait(2000);
				List<WebElement>teacher=driver.findElements(By.xpath("//div[@class='careUserCard']"));
				int teasize=teacher.size();
				System.out.println("all the teacher name size:-----"+teasize);
				for(int i=1;i<=teasize;i++)
				{
					String teachername =driver.findElement(By.xpath("(//div[@class='careUserCard'])[" + i + "]"))
							.getText();
					System.out.println("all the teachers name :----"+teachername);
				}
				 Msgpart();
				 wait(3000);
				 copyFileLocation();
				// driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary']")).click();
					wait(3000);
				 driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary']")).sendKeys(Keys.ENTER);
				
			}
					
		}
		public void Msgpart()
		{
			wait(2000);
			//click on name 
			driver.findElement(By.xpath("(//div[@class='careUserCard'])[1]")).click();
			wait(2000);
			//click on type msg filed
			driver.findElement(By.xpath("//textarea[@placeholder='Type a message...']")).sendKeys("hai good morning");
			wait(3000);
			//click on send button 
			driver.findElement(By.xpath("//div[@style='margin-bottom: 10px; margin-top: 10px; margin-right: 10px;']"))
			.click();
			wait(2000);
			//click on image 
			driver.findElement(By.xpath("//div[@class='imgUploader']")).click();
			wait(2000);
			
		}
		
	
	public void copyFileLocation() throws InterruptedException, AWTException {
	    // File Location
	    StringSelection select = new StringSelection("C:\\Users\\Brigosha_Guest\\Pictures\\Camera Roll\\ss.png");
	    // Copy to clipboard
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
	    Thread.sleep(6000);
	    // Create object of Robot class
	    Robot robot = new Robot();
	    Thread.sleep(1000);

	    // Press CTRL+V
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);

	    // Wait
	    Thread.sleep(1000);

	    // Release CTRL+V
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyRelease(KeyEvent.VK_V);

	    // Wait
	    Thread.sleep(1000);
	    // Press Enter
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
        System.out.println("---successfull upload---");
	}
	public void FAQs() throws InterruptedException {
		ScrollDown();
		wait(2000);
		driver.findElement(By.xpath("//a[contains(@href, '/care')]")).click();
		wait(2000);
		driver.findElement(By.xpath("//div[@class='careCard cursor-pointer ']")).click();
		wait(2000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-arrow-left']")).click();
		driver.navigate().back();
	}
	public void Covid19resource() throws InterruptedException
	{
		ScrollDown();
		wait(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//a[contains(@href, '/care')]")).click();
		Thread.sleep(4000);
		WebElement Resources = driver.findElement(By.xpath("(//h1[@class='careHeading_h2'])[2]"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView(true)", Resources);
		Thread.sleep(4000);
		 //click on covid 19 resource
		 driver.findElement(By.xpath("//div[@class='careCard ']"))
		 .click();
		 wait(2000);
		 driver.findElement(By.xpath("//button[text()='FIND A VACCINATION CENTER']")).click();
		 wait(2000);
		 //click on health id
		 driver.findElement(By.xpath("(//*[contains(@href,'https://healthid.ndhm.gov.in/')])[1]")).click();
		 wait(3000);
		 String oldTab = driver.getWindowHandle();
		 driver.switchTo().window(oldTab);
		 wait(3000);
		 //click on dashboard
		 driver.findElement(By.xpath("(//*[@class='dropdwnbtn accessibility-plugin-ac newMenu'])[1]")).click();
		 wait(3000);
		 String oldTab1 = driver.getWindowHandle();
		 driver.switchTo().window(oldTab1);
		 wait(3000);
		 //click on verify certificate 
		 driver.findElement(By.xpath("(//*[@class='dropdwnbtn accessibility-plugin-ac newMenu'])[2]")).click();
		 wait(3000);
		 String oldTab2 = driver.getWindowHandle();
		 driver.switchTo().window(oldTab2);
		 wait(3000);
		 //click on FA2
		 driver.findElement(By.xpath("(//*[@class='dropdwnbtn accessibility-plugin-ac newMenu'])[3]")).click();
		 wait(3000);
		 String oldTab3 = driver.getWindowHandle();
		 driver.switchTo().window(oldTab3);
		 wait(3000);
		 //click on partners 
		 driver.findElement(By.xpath("(//*[@class='dropdwnbtn accessibility-plugin-ac newMenu'])[4]")).click();
		 wait(3000);
		 String oldTab4 = driver.getWindowHandle();
		 driver.switchTo().window(oldTab4);
		 wait(3000);
		 driver.navigate().back();
		 wait(2000);
		 driver.navigate().refresh();
		 
		 wait(3000);
		/* driver.findElement(By.xpath("//span[@class='anticon anticon-arrow-left']")).click();*/
		 
	}
	
	public void chatwithAulasteam() throws InterruptedException, AWTException
	{
		ScrollDown();
		wait(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//a[contains(@href, '/care')]")).click();
		wait(4000);
		WebElement Resources = driver.findElement(By.xpath("(//h1[@class='careHeading_h2'])[2]"));
		wait(4000);
		js.executeScript("arguments[0].scrollIntoView(true)", Resources);
		wait(4000);
		//click on chat with aulas team 
		driver.findElement(By.xpath("(//div[@class='careCard'])[1]")).click();
		wait(2000);
		//click on msg field
		driver.findElement(By.xpath("//textarea[@placeholder='Type your question here...']"))
		.sendKeys("hai good morning ");
		 wait(3000);
		 //click on send button
			driver.findElement(By.xpath("//div[@style='margin-bottom: 10px; margin-top: 10px; margin-right: 10px;']"))
			.click();
			wait(2000);
			//click on image 
			driver.findElement(By.xpath("//div[@class='imgUploader']")).click();
			wait(2000);
		 copyFileLocation();
		 wait(3000);
		 driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary']")).click();
			wait(3000);
		
	}
	
	public void callaulasTeam() throws InterruptedException
	{
		ScrollDown();
		wait(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//a[contains(@href, '/care')]")).click();
		wait(4000);
		WebElement Resources = driver.findElement(By.xpath("(//h1[@class='careHeading_h2'])[2]"));
		wait(4000);
		js.executeScript("arguments[0].scrollIntoView(true)", Resources);
		wait(4000);
		//click on chat with aulas team 
		WebElement AulasCarenumber = driver.findElement(By.xpath("(//div[@class='careCard'])[2]"));
		String text=AulasCarenumber.getText();
		System.out.println("aulas care number:------"+text);
	}
	public void ChatWithInstitute() throws InterruptedException, AWTException {
		ScrollDown();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(@href, '/care')]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(
				"(//h1[@style='margin-bottom: 0px; font-size: 18px; color: rgb(25, 25, 25); opacity: 1; font-family: roboto; font-weight: bold;'])[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@testid='Type your question here...']")).sendKeys("Hai Good Morning");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@style='margin-bottom: 10px; margin-top: 10px; margin-right: 10px;']"))
				.click();
		wait(2000);
	}
	public void CallYourInstitute() throws InterruptedException {
		ScrollDown();
		wait(2000);
		driver.findElement(By.xpath("//a[contains(@href, '/care')]")).click();
		wait(2000);
		WebElement callInstitute=driver.findElement(By.xpath("(//div[@class='careCard'])[1]"));
		String Text=callInstitute.getText();
		System.out.println(" Institute information :-----"+Text);
		Actions ac = new Actions(driver);
		WebElement number=driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-link text-xs bold-600']"));
		ac.moveToElement(number).build().perform();
		
		
	}
	public void ChatwithAulasTeamTeacher() throws InterruptedException
	{
		ScrollDown();
		wait(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//a[contains(@href, '/care')]")).click();
		wait(4000);
		WebElement Resources = driver.findElement(By.xpath("(//h1[@class='careHeading_h2'])[2]"));
		wait(4000);
		js.executeScript("arguments[0].scrollIntoView(true)", Resources);
		wait(4000);
		//click on chat with team
		driver.findElement(By.xpath("(//div[@class='careCard'])[2]")).click();
		wait(2000);
		driver.findElement(By.xpath("//textarea[@placeholder='Type your question here...']"))
		.sendKeys("hai good morning ");
		 wait(3000);
		 //click on send button
			driver.findElement(By.xpath("//div[@style='margin-bottom: 10px; margin-top: 10px; margin-right: 10px;']"))
			.click();
			wait(2000);

	}
	public void callaulasTeamTracher() throws InterruptedException
	{
		ScrollDown();
		wait(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//a[contains(@href, '/care')]")).click();
		wait(4000);
		WebElement Resources = driver.findElement(By.xpath("(//h1[@class='careHeading_h2'])[2]"));
		wait(4000);
		js.executeScript("arguments[0].scrollIntoView(true)", Resources);
		wait(4000);
		//click on chat with aulas team 
		WebElement AulasCarenumber = driver.findElement(By.xpath("(//div[@class='careCard'])[3]"));
		String text=AulasCarenumber.getText();
		System.out.println("aulas care number:------"+text);
	}
	public void ChatwithInstituteDOp() throws InterruptedException, AWTException
	{
		ScrollDown();
		wait(4000);
		driver.findElement(By.xpath("//a[contains(@href, '/care')]")).click();
		wait(6000);
		wait(2000);
		driver.findElement(By.xpath("//div[@class='careCard cursor-pointer']")).click();
		wait(2000);
		driver.findElement(By.xpath("//textarea[@placeholder='Type your question here...']"))
		.sendKeys("Hai good morning");
		wait(2000);
		driver.findElement(By.xpath("//div[@style='margin-bottom: 10px; margin-top: 10px; margin-right: 10px;']"))
		.click();
		wait(2000);
		driver.findElement(By.xpath("//div[@class='imgUploader']")).click();
		wait(2000);
		 copyFileLocation();
				wait(3000);
			 driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary']")).sendKeys(Keys.ENTER);
	}
	
	
}
