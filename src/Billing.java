import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Billing {

	public static void main(String[] args) throws InterruptedException {
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\NH - Android\\Desktop\\Selenium\\Driver\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();*/
		System.setProperty("webdriver.gecko.driver","C:\\Users\\NH - Android\\Desktop\\Selenium\\Driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://customer.nanohealthplan.com/users/sign_in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("user_login")).sendKeys("msatheesh434@gmail.com");
		driver.findElement(By.id("user_password")).sendKeys("satti7669");
		driver.findElement(By.name("commit")).click();
		
		//selecting Role clicking on Clinic manager Role
		driver.findElement(By.xpath("//*[@id=\"account-selection\"]/div/div[2]/a[2]/div/div/div/div[2]")).click();
		Billing.mouse(driver);
		driver.findElement(By.id("daywise_report")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nanosafe_payment_search\"]/div[1]/div[2]/label")).click();
		Thread.sleep(2000);
		Billing.mouse(driver);
		driver.findElement(By.linkText("PatientWise Report")).click();
		Thread.sleep(2000);
		Billing.mouse(driver);
		driver.findElement(By.linkText("Monthly Report")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nanosafe_payment_search\"]/div[1]/div[2]/label")).click();
		Thread.sleep(2000);
		Billing.mouse(driver);
		driver.findElement(By.linkText("DoctorWise Report")).click();
		Thread.sleep(2000);
		Billing.mouse(driver);
		driver.findElement(By.id("dueAmount_report")).click();
		Billing.mouse(driver);
		driver.findElement(By.linkText("Promo Code Tracking")).click();

	}
	public static void mouse(WebDriver driver)
	{
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"admin-reports\"]"))).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"admin-prescription-headers\"]"))).build().perform();
		
	}

}
