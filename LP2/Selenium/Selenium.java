package Website;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class Selenium {

	static WebDriver driver;
	
	public static void scrollDown(int pixel, int dist)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		for(int i=dist; i <=pixel; i+=dist)
		{
			slp(100);
			
			js.executeScript("window.scrollBy(0,"+i+")");
		}
		
		
	}
	
	
	
	public static void scrollUp(int pixel,int dist)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		for(int i=-dist; i >=(-pixel); i-=dist)
		{
			slp(100);
			
			js.executeScript("window.scrollBy(0,"+i+")");
		}
		
		
	}
	
	
	
	
	public static void slp(int duration)
	{
		try
		{
			Thread.sleep(duration);
		}
		catch(Exception e)
		{
			
		}
	}
	
	
	
	public static void openImage(String id)
	{
		
		WebElement element = driver.findElement(By.id(""+id+""));
		element.click();
		
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
		
		slp(2000);
	    
	    driver.close();
	    driver.switchTo().window(tabs.get(0));
		
	}
	
	
	
	public static void click(String id)
	{
		
		WebElement element = driver.findElement(By.id(""+id+""));
		element.click();
		
	}
	
	
	
	public static void view()
	{
		
		slp(2000);
		scrollDown(500,100);
		slp(2000);
		scrollUp(500,100);
		slp(2000);
		
	}
	
	
	public static void Home()
	{
		
		scrollDown(75,2);
		slp(2000);
		openImage("image12");
		slp(1000);
		openImage("image9");
		slp(1000);
		scrollUp(75,2);
		slp(2000);
	}
	
	
	
	public static void Room_and_Suite()
	{
		
		click("RS");
		slp(2000);
		view();
		//slp(1000);
		click("LV");
		slp(1000);
		view();
		//slp(1000);
		click("BB");
		slp(1000);
		view();
		//slp(1000);
		click("BBP");
		slp(1000);
		view();
		driver.get("file:///C:/home/dev/Desktop/Website/ECLIPSE.html");
		slp(2000);
		
	}
	
	
	public static void Booking()
	{
		driver.get("file:///C:/home/dev/Desktop/Website/forms1.html");
		
		WebElement element = driver.findElement(By.name("Rooms"));
		Select dropdown = new Select(element);
		element.click();
		slp(2000);
		dropdown.selectByIndex(2);
		slp(1000);
		element.click();
		slp(2000);
		driver.findElement(By.id("NoR")).sendKeys("1");
		slp(1000);
		driver.findElement(By.id("NoA")).sendKeys("2");
		slp(1000);
		driver.findElement(By.id("NoC")).sendKeys("1");
		slp(1000);
		
		click("button");
		slp(2000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		slp(2000);
		
	
		driver.get("file:///C:/home/dev/Desktop/Website/ECLIPSE.html");
		slp(2000);
	}
	
	
	
	public static void BadBooking()
	{
		click("booking");
		slp(2000);
		
		WebElement element = driver.findElement(By.name("Rooms"));
		Select dropdown = new Select(element);
		element.click();
		slp(2000);
		dropdown.selectByIndex(2);
		slp(1000);
		element.click();
		slp(2000);
		driver.findElement(By.id("NoR")).sendKeys("1");
		slp(1000);
		driver.findElement(By.id("NoA")).sendKeys("0");
		slp(1000);
		driver.findElement(By.id("NoC")).sendKeys("1");
		slp(1000);
		
		click("button");
		slp(2000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		slp(2000);
		
	
		//driver.get("file:///C:/home/dev/Desktop/Website/ECLIPSE.html");
		//slp(2000);
	}
	
	
	
	public static void Wine_and_Dine()
	{
		click("WD");
		slp(2000);
		click("F");
		slp(2000);
		click("D");
		slp(2000);
		click("J");
		slp(2000);
		click("soup");
		slp(7000);
		driver.navigate().back();
		click("J");
		slp(2000);
		click("mock");
		slp(5000);
		driver.navigate().back();
		click("J");
		slp(2000);
		click("main");
		slp(5000);
		driver.get("file:///C:/home/dev/Desktop/Website/ECLIPSE.html");
		slp(2000);
	}
	
	
	
	
	public static void Gallery()
	{
		click("G");
		slp(1000);
		scrollDown(40,1);
		slp(2000);
		openImage("image11");
		slp(2000);
		driver.get("file:///C:/home/dev/Desktop/Website/ECLIPSE.html");
		slp(2000);
	}
	
	
	
	
	public static void Offer()
	{
		click("o");
		slp(2000);
		scrollDown(10, 2);
		slp(2000);
		click("right");
		slp(2000);
		click("right");
		slp(2000);
		click("right");
		slp(2000);
		click("right");
		slp(2000);
		click("right");
		slp(2000);
		driver.get("file:///C:/home/dev/Desktop/Website/ECLIPSE.html");
		slp(2000);
	}
	
	
	
	
	public static void Recreational()
	{
		click("r");
		slp(2000);
		scrollDown(15,1);
		slp(6000);
		scrollDown(25,1);
		slp(2000);
		/*
		click("flip");
		scrollDown(25,1);
		slp(2000);
		click("flip1");
		scrollDown(25,1);
		slp(2000);
		click("flip2");
		scrollDown(25,1);
		slp(2000);
		click("flip3");
		scrollDown(25,1);
		slp(2000);
		*/
		
		driver.get("file:///C:/home/dev/Desktop/Website/ECLIPSE.html");
		slp(2000);
	}
	
	
	
	
	public static void Map()
	{
		
		click("M");
		slp(2000);
		driver.get("file:///C:/home/dev/Desktop/Website/ECLIPSE.html");
		slp(2000);
		
	}
	
	
	
	public static void About_Us()
	{
		click("about");
		slp(4000);
		scrollDown(20,1);
		slp(2000);
		driver.navigate().back();
		slp(2000);
	}
	
	
	
	public static void Contact_Us()
	{
		
		click("contact");
		slp(10000);
		driver.close();
		
	}
	
	
	
	public static void LogIn()
	{
		
		driver.get("file:///C:/home/dev/Desktop/Website/index.html");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		slp(2000);
		driver.findElement(By.id("eid")).sendKeys("ayanyaduwanshi@gmail.com");
		slp(1000);
		driver.findElement(By.id("pwd")).sendKeys("ayanion");
		slp(1000);
		click("login");
		slp(2000);
		
	}
	
	public static void BadLogIn()
	{
		
		driver.get("file:///C:/home/dev/Desktop/Website/index.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		slp(2000);
		driver.findElement(By.id("eid")).sendKeys("ayanyaduwanshi@gmail.com");
		slp(1000);
		driver.findElement(By.id("pwd")).sendKeys("ayan");
		slp(1000);
		click("login");
		slp(2000);
		
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		slp(2000);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		BadLogIn();
				
		LogIn();
		
		Home();
		
		Room_and_Suite();
		
		BadBooking();
		
		Booking();
		
		Wine_and_Dine();
		
		Gallery();
		
		Offer();
		
		Recreational();
		
		Map();
		
		About_Us();
		
		Contact_Us();
		
		
	}

}
