import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class appointment_types {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NH - Android\\Desktop\\Selenium\\Driver\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://customer.nanohealthplan.com/users/sign_in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("user_login")).sendKeys("msatheesh434@gmail.com");
		driver.findElement(By.id("user_password")).sendKeys("satti7669");
		driver.findElement(By.name("commit")).click();
		//selecting Role clicking on Clinic manager Role
		driver.findElement(By.xpath("//*[@id=\"account-selection\"]/div/div[2]/a[2]/div/div/div/div[2]")).click();
		appointment_types m=new appointment_types();
		m.mse(driver);
		m.Doc(driver);
		m.mse(driver);
		m.diet(driver);
	}
		//hover the mouse on Reports
		public static void mse(WebDriver driver)
		{
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"admin-apmnts\"]"));
		action.moveToElement(element).perform();
		}
		public static void Doc(WebDriver driver) throws InterruptedException
		{
		//list view
		driver.findElement(By.linkText("Doctor")).click();	
		driver.findElement(By.cssSelector("#status_link_Consulted")).click();
		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[10]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".btn.green.modal-close.waves-effect.btn-loader.right")).click();
		}
		public static void diet(WebDriver driver) throws InterruptedException
		{
		driver.findElement(By.linkText("Dietitian")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#status_link_Consulted")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[9]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".btn.green.modal-close.waves-effect.btn-loader.right")).click();
		driver.findElement(By.linkText("4")).click();
		

	}

}
