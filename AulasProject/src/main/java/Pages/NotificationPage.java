package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Aulas_Base.BaseTest;

public class NotificationPage extends BaseTest
{
  //**************All notification*****************//
	@FindBy(xpath="//a[@href='/notifications-home']")
	WebElement Notification;
	@FindBy(xpath="//div[text()='Notifications']")
	WebElement NotificationText;
	@FindBy(xpath="//div[@class='r-c-c-c']")
	WebElement AllNotifications;
	@FindBy(xpath="//div[@class='ant-select-selector']")
	WebElement AllNotifcationsSelector;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[1]")
	WebElement SelectAll ;
	@FindBy(xpath="(//div[@style='color: rgb(16, 137, 255); font-weight: 700; font-size: 14px;'])[1]")
	WebElement ClickOnView;
	@FindBy(xpath="//span[@class='anticon anticon-arrow-left']")
	WebElement ClickOnBack;
	@FindBy(xpath="//span[@class='anticon anticon-right m-l-30']")
	WebElement NextPageArrow;
	@FindBy(xpath="//input[@class='ant-input']")
	WebElement ClickSeachButton;
	
//*********************Announcements*****************//	
	
	@FindBy(xpath="//a[@href='/notifications-home']")
	WebElement Notification1;
	@FindBy(xpath="//div[text()='Notifications']")
	WebElement NotificationText1;
	@FindBy(xpath="(//div[@class='r-c-c-c '])[1]")
	WebElement Announcements;
	@FindBy(xpath="//div[@class='ant-select-selector']")
	WebElement AllAnnouncemtSelector;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[1]")
	WebElement SelectAll1 ;
	@FindBy(xpath="(//div[@style='color: rgb(16, 137, 255); font-weight: 700; font-size: 12px;'])[1]")
	WebElement ClickOnView1;
	@FindBy(xpath="//span[@class='anticon anticon-arrow-left']")
	WebElement ClickOnBack1;
	@FindBy(xpath="//span[@class='anticon anticon-right m-l-30']")
	WebElement NextPageArrow1;
	@FindBy(xpath="//input[@class='ant-input']")
	WebElement ClickSeachButton1;
	
	
	//***************Assignments**************//
	@FindBy(xpath="//a[@href='/notifications-home']")
	WebElement Notification2;
	@FindBy(xpath="//div[text()='Notifications']")
	WebElement NotificationText2;
	@FindBy(xpath="(//div[@class='r-c-c-c '])[2]")
	WebElement Assignments;
	@FindBy(xpath="//div[@class='ant-select-selector']")
	WebElement AllAssignmentsSelector;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[1]")
	WebElement SelectAll2 ;
	@FindBy(xpath="(//div[@style='color: rgb(16, 137, 255); font-weight: 700; font-size: 12px;'])[1]")
	WebElement ClickOnView2;
	@FindBy(xpath="//span[@class='anticon anticon-arrow-left']")
	WebElement ClickOnBack2;
	@FindBy(xpath="//span[@class='anticon anticon-right m-l-30']")
	WebElement NextPageArrow2;
	@FindBy(xpath="//input[@class='ant-input']")
	WebElement ClickSeachButton2;
	
	//*****************Test****************//
	@FindBy(xpath="//a[@href='/notifications-home']")
	WebElement Notification3;
	@FindBy(xpath="//div[text()='Notifications']")
	WebElement NotificationText3;
	@FindBy(xpath="(//div[@class='r-c-c-c '])[3]")
	WebElement Test;
	@FindBy(xpath="//div[@class='ant-select-selector']")
	WebElement AllTestSelector;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[1]")
	WebElement SelectAll3 ;
	@FindBy(xpath="(//text[@style='color: rgb(16, 137, 255); font-weight: 700; font-size: 12px;'])[1]")
	WebElement ClickOnView3;
	@FindBy(xpath="//span[@class='anticon anticon-arrow-left']")
	WebElement ClickOnBack3;
	@FindBy(xpath="//span[@class='anticon anticon-right m-l-30']")
	WebElement NextPageArrow3;
	@FindBy(xpath="//input[@class='ant-input']")
	WebElement ClickSeachButton3;
	
	//*************Practice test**************//
	@FindBy(xpath="//a[@href='/notifications-home']")
	WebElement Notification4;
	@FindBy(xpath="//div[text()='Notifications']")
	WebElement NotificationText4;
	@FindBy(xpath="(//div[@class='r-c-c-c '])[4]")
	WebElement PracticeTest;
	@FindBy(xpath="//div[@class='ant-select-selector']")
	WebElement AllPracticeTestSelector;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[1]")
	WebElement SelectAll4 ;
	@FindBy(xpath="(//div[@style='color: rgb(16, 137, 255); font-weight: 700; font-size: 12px;'])[1]")
	WebElement ClickOnView4;
	@FindBy(xpath="//span[@class='anticon anticon-arrow-left']")
	WebElement ClickOnBack4;
	@FindBy(xpath="//span[@class='anticon anticon-right m-l-30']")
	WebElement NextPageArrow4;
	@FindBy(xpath="//input[@class='ant-input']")
	WebElement ClickSeachButton4;
	
	//**************Digital Library********************//
	
	@FindBy(xpath="//a[@href='/notifications-home']")
	WebElement Notification5;
	@FindBy(xpath="//div[text()='Notifications']")
	WebElement NotificationText5;
	@FindBy(xpath="(//div[@class='r-c-c-c '])[5]")
	WebElement DigitalLibrary;
	@FindBy(xpath="//div[@class='ant-select-selector']")
	WebElement AllDigitalLibrarySelector;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[1]")
	WebElement SelectAll5 ;
	/*@FindBy(xpath="(//div[@style='color: rgb(16, 137, 255); font-weight: 700; font-size: 12px;'])[1]")
	WebElement ClickOnView4;
	@FindBy(xpath="//span[@class='anticon anticon-arrow-left']")
	WebElement ClickOnBack4;
	@FindBy(xpath="//span[@class='anticon anticon-right m-l-30']")
	WebElement NextPageArrow4;
	@FindBy(xpath="//input[@class='ant-input']")
	WebElement ClickSeachButton4;*/
	
	//************Fee management***************//
	@FindBy(xpath="//a[@href='/notifications-home']")
	WebElement Notification6;
	@FindBy(xpath="//div[text()='Notifications']")
	WebElement NotificationText6;
	@FindBy(xpath="(//div[@class='r-c-c-c '])[6]")
	WebElement FeeManagement;
	@FindBy(xpath="//div[@class='ant-select-selector']")
	WebElement AllFeeManagementSelector;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[1]")
	WebElement SelectAll6 ;
	
	//**************Others**************//
	
	@FindBy(xpath="//a[@href='/notifications-home']")
	WebElement Notification7;
	@FindBy(xpath="//div[text()='Notifications']")
	WebElement NotificationText7;
	@FindBy(xpath="(//div[@class='r-c-c-c '])[7]")
	WebElement Others;
	@FindBy(xpath="//div[@class='ant-select-selector']")
	WebElement AllOthersSelector;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[1]")
	WebElement SelectAll7 ;
	@FindBy(xpath="(//div[@style='color: rgb(16, 137, 255); font-weight: 700; font-size: 12px;'])[1]")
	WebElement ClickOnView6;
	@FindBy(xpath="//span[@class='anticon anticon-arrow-left']")
	WebElement ClickOnBack6;
	@FindBy(xpath="//span[@class='anticon anticon-right m-l-30']")
	WebElement NextPageArrow6;
	@FindBy(xpath="//input[@class='ant-input']")
	WebElement ClickSeachButton6;
	
	//***************Admin *****************//
	@FindBy(xpath="(//div[@class='r-c-c-c '])[5]")
	WebElement Other1;
	
	

	 public NotificationPage()
     {
    	 PageFactory.initElements(driver, this);
     }
	  public void Notification() throws InterruptedException
	  {
	    	 Thread.sleep(2000);
	    	 Notification.click();
	    	 Thread.sleep(2000);
	    	 WebElement ele =AllNotifications;
	    	 String  Count=ele.getText();
	    	 System.out.println("Total Notifications are :- "+Count);
	    	 ele.click();
	    	 /*
	    	 List<WebElement> Option=driver.findElements(By.xpath("//div[@class='ant-select-item ant-select-item-option']"));
	    	 int size=Option.size();
	    	 for(int i=0;i<size;i++)
	    	 {
	    		 Thread.sleep(2000);
	    		 AllNotifcationsSelector.click();
	    		 Thread.sleep(2000);
	    		 Option.get(i).click();
	    		 Thread.sleep(2000);
	    		 
	    	 }
	    	 */
	    	 AllNotifcationsSelector.click();
	    	 Thread.sleep(2000);
	    	 SelectAll.click();
	    	 Thread.sleep(2000);
	    	 ClickOnView.click();
	    	 Thread.sleep(2000);
	    	 
	    	 WebElement NotifContent=driver.findElement(By.xpath("//div[@style='padding: 20px;']"));
	    	 String text=NotifContent.getText();
	    	 System.out.println(" Content of Notification :- "+text);
	    	 Thread.sleep(2000);
	    	 ClickOnBack.click();
	    	 Thread.sleep(2000);
	    	 NextPageArrow.click();
	    	 Thread.sleep(2000);
	    	 ClickSeachButton.sendKeys("1 all");
	    	 Thread.sleep(2000);
	    	 
	   }
	
	public void Announcements() throws InterruptedException {
		 Thread.sleep(2000);
    	 Notification1.click();
    	 Thread.sleep(2000);
    	 WebElement ele =Announcements;
    	 String  Count=ele.getText();
    	 System.out.println("Total Notifications are :- "+Count);
    	 ele.click();
    	 AllAnnouncemtSelector.click();
    	 Thread.sleep(2000);
    	 SelectAll1.click();
    	 Thread.sleep(2000);
    	 ClickOnView1.click();
    	 Thread.sleep(2000);
    	 
    	 WebElement NotifContent=driver.findElement(By.xpath("//div[@style='padding: 20px;']"));
    	 String text=NotifContent.getText();
    	 System.out.println(" Content of Notification :- "+text);
    	 Thread.sleep(2000);
    	 ClickOnBack1.click();
    	 Thread.sleep(2000);
    	 NextPageArrow1.click();
    	 Thread.sleep(2000);
    	 ClickSeachButton1.sendKeys("1 all");
    	 Thread.sleep(2000);
		
	}
	public void Assignments() throws InterruptedException {
		
	 Thread.sleep(2000);
   	 Notification1.click();
   	 Thread.sleep(2000);
   	 WebElement ele =Assignments;
   	 String  Count=ele.getText();
   	 System.out.println("Total Notifications are :- "+Count);
   	 ele.click();
    AllAssignmentsSelector.click();
   	 Thread.sleep(2000);
   	 SelectAll2.click();
   	 Thread.sleep(2000);
   	 /*ClickOnView2.click();
   	 Thread.sleep(2000);
   	 
   	 WebElement NotifContent=driver.findElement(By.xpath("//div[@style='padding: 20px;']"));
   	 String text=NotifContent.getText();
   	 System.out.println(" Content of Notification :- "+text);
   	 Thread.sleep(2000);
   	 ClickOnBack2.click();
   	 Thread.sleep(2000);
   	 NextPageArrow2.click();
   	 Thread.sleep(2000);
   	 ClickSeachButton2.sendKeys("1 all");
   	 Thread.sleep(2000);*/
	}
	 
	public void Test() throws InterruptedException {
		 Thread.sleep(2000);
	   	 Notification3.click();
	   	 Thread.sleep(2000);
	   	 WebElement ele =Test;
	   	 String  Count=ele.getText();
	   	 System.out.println("Total Notifications are :- "+Count);
	   	 ele.click();
	    AllTestSelector.click();
	   	 Thread.sleep(2000);
	   	 SelectAll3.click();
	   	 Thread.sleep(2000);
	   	 ClickOnView3.click();
	   	 Thread.sleep(2000);
	   	 
	   	 WebElement NotifContent=driver.findElement(By.xpath("//div[@style='padding: 20px;']"));
	   	 String text=NotifContent.getText();
	   	 System.out.println(" Content of Notification :- "+text);
	   	 Thread.sleep(2000);
	   	 ClickOnBack3.click();
	   	 Thread.sleep(2000);
	   	 NextPageArrow3.click();
	   	 Thread.sleep(2000);
	   	 ClickSeachButton3.sendKeys("1 all");
	   	 Thread.sleep(2000);
		
	}
	public void PracticeTest() throws InterruptedException {
		 Thread.sleep(2000);
	   	 Notification4.click();
	   	 Thread.sleep(2000);
	   	 WebElement ele =PracticeTest;
	   	 String  Count=ele.getText();
	   	 System.out.println("Total Notifications are :- "+Count);
	   	 ele.click();
	    AllPracticeTestSelector.click();
	   	 Thread.sleep(2000);
	   	 SelectAll4.click();
	   	 Thread.sleep(2000);
	   	 ClickOnView4.click();
	   	 Thread.sleep(2000);
	   	 
	   	 WebElement NotifContent=driver.findElement(By.xpath("//div[@style='padding: 20px;']"));
	   	 String text=NotifContent.getText();
	   	 System.out.println(" Content of Notification :- "+text);
	   	 Thread.sleep(2000);
	   	 ClickOnBack4.click();
	   	 Thread.sleep(2000);
	   	 NextPageArrow4.click();
	   	 Thread.sleep(2000);
	   	 ClickSeachButton4.sendKeys("1 all");
	   	 Thread.sleep(2000);
		
	}
	public void DigitaLibrary() throws InterruptedException {
		 Thread.sleep(2000);
	   	 Notification5.click();
	   	 Thread.sleep(2000);
	   	 WebElement ele =DigitalLibrary;
	   	 String  Count=ele.getText();
	   	 System.out.println("Total Notifications are :- "+Count);
	   	 ele.click();
	    AllDigitalLibrarySelector.click();
	   	 Thread.sleep(2000);
	   	 SelectAll5.click();
	   	 Thread.sleep(2000);
		}
	public void FeeManagement() throws InterruptedException {
		 Thread.sleep(2000);
	   	 Notification6.click();
	   	 Thread.sleep(2000);
	   	 WebElement ele =FeeManagement;
	   	 String  Count=ele.getText();
	   	 System.out.println("Total Notifications are :- "+Count);
	   	 ele.click();
	    AllFeeManagementSelector.click();
	   	 Thread.sleep(2000);
	   	 SelectAll6.click();
	   	 Thread.sleep(2000);
		
	}
	public void  Others() throws InterruptedException {
		 Thread.sleep(2000);
	   	 Notification7.click();
	   	 Thread.sleep(2000);
	   	 WebElement ele =Others;
	   	 String  Count=ele.getText();
	   	 System.out.println("Total Notifications are :- "+Count);
	   	 ele.click();
	    AllOthersSelector.click();
	   	 Thread.sleep(2000);
	   	 SelectAll7.click();
	   	 
	   	 Thread.sleep(2000);
	   	 ClickOnView6.click();
	   	 Thread.sleep(2000);
	   	 
	   	 WebElement NotifContent=driver.findElement(By.xpath("//div[@style='padding: 20px;']"));
	   	 String text=NotifContent.getText();
	   	 System.out.println(" Content of Notification :- "+text);
	   	 Thread.sleep(2000);
	   	 ClickOnBack6.click();
	   	 Thread.sleep(2000);
	   	 NextPageArrow6.click();
	   	 Thread.sleep(2000);
	   	 ClickSeachButton6.sendKeys("1 all");
	   	 Thread.sleep(2000);
		
		
	}
	
	
	
	//******************** DATA OPERATOR *********************//
	public void PracticeTest1() throws InterruptedException {
		Thread.sleep(2000);
	   	 Notification.click();
	   	 Thread.sleep(2000);
	   	 WebElement ele =PracticeTest;
	   	 String  Count=ele.getText();
	   	 System.out.println("Total Notifications are :- "+Count);
	   	 ele.click();
	    AllPracticeTestSelector.click();
	   	 Thread.sleep(2000);
	   	 SelectAll4.click();
	   	 Thread.sleep(2000);
	   	 ClickOnView4.click();
	   	 Thread.sleep(2000);
	   	 
	   	 WebElement NotifContent=driver.findElement(By.xpath("//div[@style='padding: 20px;']"));
	   	 String text=NotifContent.getText();
	   	 System.out.println(" Content of Notification :- "+text);
	   	 Thread.sleep(2000);
	   	 ClickOnBack4.click();
	   	 Thread.sleep(2000);
	   	 ClickSeachButton4.sendKeys("1 all");
	   	 Thread.sleep(2000);
	}
	
	//*************** Admin Other **************//
	public void Other1() throws InterruptedException {
		Thread.sleep(2000);
		Other1.click();
		 WebElement ele =Other1;
	   	 String  Count=ele.getText();
	   	 System.out.println("Total Notifications are :- "+Count);
	   	 ele.click();
		
	}
	
	//**************** student **************//
	public void PracticeTest2() throws InterruptedException {
		 Thread.sleep(2000);
	   	 Notification4.click();
	   	 Thread.sleep(2000);
	   	 WebElement ele =PracticeTest;
	   	 String  Count=ele.getText();
	   	 System.out.println("Total Notifications are :- "+Count);
	   	 ele.click();
	    AllPracticeTestSelector.click();
	   	 Thread.sleep(2000);
	   	 SelectAll4.click();
	}
	
}
