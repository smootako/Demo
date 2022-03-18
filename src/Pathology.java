import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Pathology {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NH - Android\\Desktop\\Selenium\\Driver\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get("https:customer.nanohealthplan.com/users/sign_in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("user_login").sendKeys("msatheesh434@gmail.com");
		driver.findElementById("user_password").sendKeys("satti7669");
		driver.findElementByName("commit").click();
		driver.findElementByXPath("//*[@id=\"account-selection\"]/div/div[2]/a[2]/div/div/div/div[2]").click();
		Pathology.mouse2(driver);
		Pathology.pathology1(driver);
	}
		
		public static void pathology1(WebDriver driver) throws InterruptedException
		{
		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[8]/a[2]/img")).click();
		
		//driver.findElementByXPath("*[@id=\"example\"]/tbody/tr[1]/td[3]").click();
		//driver.findElementByLinkText("add").click();
		driver.findElement(By.id("myInput")).sendKeys("HbA1c" +Keys.ENTER);
		//driver.findElement(By.xpath("*[@id=\"test-link-4\"]/a/i")).click();
		driver.findElement(By.linkText("add")).click();
		driver.findElement(By.linkText("Checkout")).click();
		driver.findElement(By.xpath("//*[@id=\"labBookingForm\"]/ul/li[1]/div[2]/div[1]/div[2]/div[1]/div/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"address-88406\"]/div")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".col.s4.date.tomorrow")).click();	
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".slot")).click();
	  //  driver.findElementByXPath("*[@id=\"dt_step\"]/div[2]/div[1]/div[2]/div[2]/div[2]/div/div[3]/span").click();
		driver.findElement(By.xpath("//*[@id=\"referred_by\"]")).sendKeys("Satheesh");
		driver.findElement(By.xpath("//*[@id=\"btn-loader\"]")).click();
		}
		public static void payment(WebDriver driver) throws InterruptedException
		{
		driver.findElement(By.cssSelector("#promo_disc")).sendKeys("100");
		driver.findElement(By.cssSelector("#applyCouponModal")).click();
		driver.findElement(By.cssSelector("#comments")).sendKeys("special");
		driver.findElement(By.id("applyCouponBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("bookNowBtn")).click();
	}
	public static void mouse2(WebDriver driver)
	{
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.id("admin-reports"));
		action.moveToElement(element).perform();
		//clicking on patients
		driver.findElement(By.linkText("Patients")).click();
	}
}
