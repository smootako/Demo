import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class vaccine_appointment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NH - Android\\Desktop\\Selenium\\Driver\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://customer.nanohealthplan.com/users/sign_in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementById("user_login").sendKeys("msatheesh434@gmail.com");
		driver.findElementById("user_password").sendKeys("satti7669");
		driver.findElementByName("commit").click();
		
		//selecting Role clicking on Clinic manager Role
		driver.findElementByXPath("//*[@id=\"account-selection\"]/div/div[2]/a[2]/div/div/div/div[2]").click();
		Book_Appointment c=new Book_Appointment();
		Thread.sleep(2000);
		c.mouse1(driver);
		vaccine_appointment.camp(driver);
		Pathology.payment(driver);
		c.mouse1(driver);
		Vaccine_Clinic.vaccine_clinic(driver);
		Pathology.payment(driver);
	}
		public static void camp(WebDriver driver)
		{
		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[9]/a[10]/img")).click();
		driver.findElement(By.linkText("add")).click();
		driver.findElement(By.linkText("Checkout")).click();
		driver.findElement(By.cssSelector(".waves-effect.waves-dark.btn.green.next-step")).click();
		driver.findElement(By.xpath("//*[@id=\"apmnt_type_step\"]/div[2]/div[1]/div[2]/div[1]/div/div")).click();
		driver.findElement(By.cssSelector(".address-block")).click();
		driver.findElement(By.className("slot")).click();
		driver.findElement(By.name("commit")).click();

	}

}
