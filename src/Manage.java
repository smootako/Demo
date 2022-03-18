import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Manage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NH - Android\\Desktop\\Selenium\\Driver\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://customer.nanohealthplan.com/users/sign_in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElementById("user_login").sendKeys("msatheesh434@gmail.com");
		driver.findElementById("user_password").sendKeys("satti7669");
		Thread.sleep(2000);
		driver.findElementByName("commit").click();
		Thread.sleep(2000);
		//selecting Role clicking on Clinic manager Role
		driver.findElementByXPath("//*[@id=\"account-selection\"]/div/div[2]/a[2]/div/div/div/div[2]").click();
		//hover the mouse on Reports
		Actions action = new Actions(driver);
		WebElement element = driver.findElementByXPath("//*[@id=\"admin-apmnts\"]");
		action.moveToElement(element).perform();
		Thread.sleep(2000);
		driver.findElementByLinkText("Doctor").click();
		Thread.sleep(2000);
		//list view
		//driver.findElementByXPath("/html/body/main/div/div[2]/div/div[1]/div/div/div/div/span[3]/a/i").click();
		Thread.sleep(2000);
		//confirmed
		driver.findElementById("status_link_Confirmed").click();
		Thread.sleep(2000);
		//clicking on Id
		driver.findElementByXPath("//*[@id=\"example\"]/tbody/tr[2]/td[2]/a").click();
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.findElementByLinkText("Reschedule").click();
	   //html/body/main/div[1]/div[2]/div/div[7]/div[3]/center/div/div/button[3]
		Thread.sleep(2000);
		//date in Calendar
		driver.findElement(By.cssSelector("#slot-date")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(".is-today")).click();
		//Reschedule Reason
		//driver.findElementByClassName("resResn").click();
		driver.findElementByClassName("resResn").sendKeys("Not available");
		Thread.sleep(2000);
		//clicking on time
		driver.findElementByCssSelector(".slot").click();
		Thread.sleep(2000);
		//REschedule button
		driver.findElementByXPath("//*[@id=\"rescheduleButton\"]").click();
	}

}
