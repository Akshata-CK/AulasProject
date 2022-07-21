package Aulas_Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.TestUtil;

public class BaseTest {
	
	
	public static WebDriver driver;
	public static Properties prop;
	
	public BaseTest()
	{
		try
		{
			prop=new Properties();
			FileInputStream ip=new FileInputStream (System.getProperty("user.dir") +"\\src\\main\\java\\ConfigProperties");
			prop.load(ip);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	@SuppressWarnings("deprecation")
	public static void initilization() throws InterruptedException
	{
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\Drivers\\chromedriver.exe");
		    driver= new ChromeDriver();
		}
		else if(browserName.equals("FF"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Bhargav\\eclipse-workspace\\Aulas_Project\\Drivers\\geckodriver.exe");
		    driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIME, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICT_WAIT, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.get(prop.getProperty("url"));
		
	}
	
	public void failed(String testMethodName)
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try
	{
	FileUtils.copyFile(scrFile, new File("C:\\Users\\Brigosha_Guest\\eclipse-workspace\\AulasProject\\Screenshots"+testMethodName+"_"+".jpg"));
	}
	catch(IOException e)
	{
	e.printStackTrace();
	}

	}
	
	public void WaitTil(int ele)
	{
		try {
			Thread.sleep(ele);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void Wait(WebElement ele)
	{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	public static void WaitTillClickble(WebElement ele)
	{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	public static void wait(int wait) {
		try {
		Thread.sleep(wait);
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		}
	public static void scrollByElement(WebElement element) {
		wait(3000);

		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("arguments[0].scrollIntoView();",element);
		System.out.println("--The scroll dow was done till the element--");
		}
	public static int randBetween1(int start, int end) {
		return start + (int)Math.round(Math.random() * (end - start));
		}
	
	public static int randBetween(int start, int end) {
	return start + (int)Math.round(Math.random() * (end - start));
	}
	public static void randomNumber() {
	Random rn = new Random();
	int answer = rn.nextInt(10) + 1;
	System.out.println("The Random number is :"+answer);
	}
	public void clearText(String locator) {
	wait(3000);
	WebElement toClear = driver.findElement(By.xpath(locator));
	toClear.sendKeys(Keys.CONTROL + "a");
	toClear.sendKeys(Keys.DELETE);
	}
	public void getCurrentDate() {
		wait(3000);
		Date date=new Date(0);
		System.out.println("The date is :"+" "+date);
		DateFormat dateformate=new SimpleDateFormat("yyyy/mm/dd");
		String date1=dateformate.format(date);
		System.out.println("The formate date is :"+" "+date1);
	}
	public static void scrollByElement1(WebElement element) {
		wait(3000);

		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("arguments[0].scrollIntoView();",element);
		System.out.println("--The scroll dow was done till the element--");
		}
	
}
