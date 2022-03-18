import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dashboard {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NH - Android\\Desktop\\Selenium\\Driver\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://customer.nanohealthplan.com/users/sign_in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("user_login").sendKeys("msatheesh434@gmail.com");
		driver.findElementById("user_password").sendKeys("satti7669");
		driver.findElementByName("commit").click();
		
		//selecting Role clicking on Clinic manager Role
		driver.findElementByXPath("//*[@id=\"account-selection\"]/div/div[2]/a[2]/div/div/div/div[2]").click();
		Dashboard m=new Dashboard();
		m.Dashboard(driver);
	}
	public static void Dashboard(WebDriver driver)
	{
		driver.findElement(By.cssSelector(".number")).click();
		driver.findElement(By.linkText("OK")).click();
		driver.findElement(By.cssSelector("#appointments")).click();
		driver.findElement(By.xpath("//*[@id=\"apmntsModal\"]/div/div[1]/span/i")).click();
		driver.findElement(By.id("from-date")).click();
		
	}

}
