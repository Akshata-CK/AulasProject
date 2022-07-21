package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Aulas_Base.BaseTest;

public class NotificationsPage extends BaseTest{
	
	
	public void Notification() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement Communication = driver.findElement(By.xpath("//div[text()='Communication']"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView(true)", Communication);
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='ant-menu-title-content'])[12]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@style='color: rgb(16, 137, 255); font-weight: 700; font-size: 14px;'])[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='anticon anticon-arrow-left']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@class='ant-input']")).sendKeys("Test");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[3]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[4]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[5]")).click();
	    Thread.sleep(2000);
	    
	   }
	public void Announcement() throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement Communication = driver.findElement(By.xpath("//div[text()='Communication']"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView(true)", Communication);
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='ant-menu-title-content'])[12]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='r-c-c-c '])[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@style='color: rgb(16, 137, 255); font-weight: 700; font-size: 12px;'])[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='anticon anticon-arrow-left']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@class='ant-input']")).sendKeys("Announcement");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[3]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[4]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[5]")).click();
	    Thread.sleep(2000);
	    
	}
	public void Assignments() throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement Communication = driver.findElement(By.xpath("//div[text()='Communication']"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView(true)", Communication);
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='ant-menu-title-content'])[12]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='r-c-c-c '])[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[3]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[4]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[5]")).click();
	    Thread.sleep(2000);
	    
	    }
	
	public void Test() throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement Communication = driver.findElement(By.xpath("//div[text()='Communication']"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView(true)", Communication);
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='ant-menu-title-content'])[12]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='r-c-c-c '])[3]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//text[@class='cursor-pointer'])[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='anticon anticon-arrow-left']")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//input[@class='ant-input']")).sendKeys("Test");
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[3]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[4]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[5]")).click();
	    Thread.sleep(2000);
	    
	    	}
	public void PracticeTest() throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement Communication = driver.findElement(By.xpath("//div[text()='Communication']"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView(true)", Communication);
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='ant-menu-title-content'])[12]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='r-c-c-c '])[4]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@style='color: rgb(16, 137, 255); font-weight: 700; font-size: 12px;'])[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='anticon anticon-arrow-left']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@class='ant-input']")).sendKeys("Test reviewed");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[3]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[4]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[5]")).click();
	    Thread.sleep(2000);
	    
     }
	public void DigitalLibrary() throws InterruptedException 
	{
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement Communication = driver.findElement(By.xpath("//div[text()='Communication']"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView(true)", Communication);
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='ant-menu-title-content'])[12]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='r-c-c-c '])[5]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[3]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[4]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[5]")).click();
	    Thread.sleep(2000);
	}
	public void FeeManagement() throws InterruptedException 
	{
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement Communication = driver.findElement(By.xpath("//div[text()='Communication']"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView(true)", Communication);
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='ant-menu-title-content'])[12]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='r-c-c-c '])[6]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[3]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[4]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[5]")).click();
	    Thread.sleep(2000);
	}
      public void Others() throws InterruptedException
      {
    	Thread.sleep(2000);
  		JavascriptExecutor js= (JavascriptExecutor)driver;
  		Thread.sleep(1000);
  		WebElement Communication = driver.findElement(By.xpath("//div[text()='Communication']"));
  		Thread.sleep(1000);
  		js.executeScript("arguments[0].scrollIntoView(true)", Communication);
  		Thread.sleep(4000);
  		driver.findElement(By.xpath("(//span[@class='ant-menu-title-content'])[12]")).click();
  	    Thread.sleep(2000);
  	    driver.findElement(By.xpath("(//div[@style='display: flex; width: calc(100% - 30px);'])[7]")).click();
  	    Thread.sleep(2000);
  	    driver.findElement(By.xpath("(//div[@style='color: rgb(16, 137, 255); font-weight: 700; font-size: 12px;'])[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='anticon anticon-arrow-left']")).click();
  	    Thread.sleep(2000);
  	    driver.findElement(By.xpath("//input[@class='ant-input']")).sendKeys("ko has been Registered");
	    Thread.sleep(2000);
  	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
  	    Thread.sleep(2000);
  	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[1]")).click();
  	    Thread.sleep(2000);
  	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
  	    Thread.sleep(2000);
  	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[2]")).click();
  	    Thread.sleep(2000);
  	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
  	    Thread.sleep(2000);
  	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[3]")).click();
  	    Thread.sleep(2000);
  	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
  	    Thread.sleep(2000);
  	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[4]")).click();
  	    Thread.sleep(2000);
  	    driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
  	    Thread.sleep(2000);
  	    driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[5]")).click();
  	    Thread.sleep(2000);
      }
     
}
