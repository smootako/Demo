import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Vaccine_Clinic {

	

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
		Book_Appointment c=new Book_Appointment();
		Vaccine_Clinic fn=new Vaccine_Clinic();
		c.mouse1(driver);
		fn.vaccine_clinic(driver);
		Pathology.payment(driver);
	}
	public static void vaccine_clinic(WebDriver driver)
	{
		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[8]/a[11]/img")).click();
		driver.findElement(By.linkText("add")).click();
		//
		driver.findElement(By.linkText("Checkout")).click();
		//
		driver.findElement(By.xpath("//*[@id=\"new_appointment_tracking\"]/ul/li[1]/div[2]/div[2]/button")).click();
		//
		driver.findElement(By.xpath("//*[@id=\"apmnt_type_step\"]/div[2]/div/div[2]/div[2]/div/div[1]")).click();
		//
		driver.findElement(By.xpath("//*[@id=\"address-88963\"]/div")).click();
		driver.findElement(By.cssSelector(".col.s4.date.tomorrow")).click();
		//
		driver.findElement(By.xpath("//*[@id=\"dt_step\"]/div[2]/div[1]/div[2]/div[1]/div[2]/div/div[1]/span")).click();
		//
		driver.findElement(By.cssSelector("#select2-hc_provider_id-container")).click();
		//
		driver.findElement(By.cssSelector(".waves-effect.waves-dark.btn.green.date-continue.next-step")).click();
		//
		driver.findElement(By.name("commit")).click();
		
	}
	

}

