
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Radiology {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NH - Android\\Desktop\\Selenium\\Driver\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://customer.nanohealthplan.com/users/sign_in");
		//
		driver.manage().window().maximize();
		//
		driver.findElementById("user_login").sendKeys("msatheesh434@gmail.com");
		driver.findElementById("user_password").sendKeys("satti7669");
		//
		driver.findElementByName("commit").click();
		//
		//selecting Role clicking on Clinic manager Role
		driver.findElementByXPath("//*[@id=\"account-selection\"]/div/div[2]/a[2]/div/div/div/div[2]").click();
		//hover the mouse on Reports
		Actions action = new Actions(driver);
		WebElement element = driver.findElementByXPath("//*[@id=\"admin-reports\"]");
		action.moveToElement(element).perform();
		//
		//
		//clicking on patients
		driver.findElementByXPath("//*[@id=\"admin-list-patients\"]").click();
		Radiology.Rad(driver);
		Pathology.payment(driver);
		//       
		//String oldTab = driver.getWindowHandle();
		//selecting particular id
		//driver.findElementByClassName("loader_disabler").click();
		//ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
	    //newTab.remove(oldTab);
	    // change focus to new tab
	    //driver.switchTo().window(newTab.get(0));
		//
	}
		public static void Rad(WebDriver driver) throws InterruptedException
		{
		//clicking on lab
		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[8]/a[2]/img")).click();
		//
		//clicking on Radiology
		driver.findElement(By.xpath("//*[@id=\"tests-container\"]/div/div[1]/div/div[2]/a")).click();
		//
		driver.findElement(By.id("myInput")).sendKeys("MRI Angiogram Brain" + Keys.ENTER);
		driver.findElement(By.linkText("add")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Checkout")).click();
		//
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"labBookingForm\"]/ul/li[1]/div[2]/div[1]/div[2]/div/div/div")).click();
		driver.findElement(By.xpath("//*[@id=\"address-88406\"]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".col.s4.date.tomorrow")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".slot")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("performed_by1")).sendKeys("harshitha");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"test-link-0\"]/a")).click();
		//
		driver.findElement(By.id("referred_by")).sendKeys("self" + Keys.ENTER);
		//
		/*driver.findElement(By.cssSelector("#promo_disc")).sendKeys("100");
		//
		driver.findElement(By.cssSelector("#applyCouponModal")).click();
		//
		driver.findElement(By.cssSelector("#comments")).sendKeys("special");
		//
		driver.findElement(By.name("commit")).click();
		WebDriverWait w =new WebDriverWait(driver,5);
		w.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#bookNowBtn")));
		driver.findElement(By.cssSelector("#bookNowBtn")).click();*/
		
		
		
		

	}

}
