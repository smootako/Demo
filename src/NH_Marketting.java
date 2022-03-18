import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NH_Marketting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NH - Android\\Desktop\\Selenium\\Driver\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://customer.nanohealthplan.com/diseases-management");
		//NH_Marketting.book(driver);
		NH_Marketting.Specializ(driver);
		NH_Marketting.login(driver);

	}
	public static void  book(WebDriver driver) throws InterruptedException
	{
		
		driver.findElement(By.xpath("//*[@id=\"home\"]/div[1]/div[2]/div/a/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".col.s4.date.tomorrow")).click();
		driver.findElement(By.cssSelector(".slot")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("bookNowBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"payBtn\"]/a")).click();
		//driver.findElement(By.xpath("//*[@id=\"modal_self_assessment\"]/div/div/div[2]/div/div[2]/div/div[1]/div[3]/a")).click();
		driver.findElement(By.id("user_login")).sendKeys("9949823391");
		driver.findElement(By.id("user_password")).sendKeys("123458");
		Thread.sleep(2000);
		driver.findElement(By.name("commit")).click();
		driver.findElement(By.id("promo_code")).sendKeys("NH123");
		Thread.sleep(2000);
		driver.findElement(By.id("applyCouponBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"order_package\"]/input[5]")).click();
	}
	public static void Specializ(WebDriver driver) throws InterruptedException
	
	{
		driver.findElement(By.cssSelector("[alt='Consult a Doctor Online India']")).click();
		driver.findElement(By.linkText("Book an appointment")).click();
		driver.findElement(By.cssSelector(".col.s4.date.tomorrow.active")).click();
		driver.findElement(By.cssSelector(".slot")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("bookNowBtn")).click();
		driver.findElement(By.xpath("//*[@id=\"payBtn\"]/a")).click();
		
	}
	public static void login(WebDriver driver) throws InterruptedException
	{
		//driver.findElement(By.xpath("//*[@id=\"modal_self_assessment\"]/div/div/div[2]/div/div[2]/div/div[1]/div[3]/a")).click();
		driver.findElement(By.id("user_login")).sendKeys("9398022510");
		driver.findElement(By.id("user_password")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.name("commit")).click();
		driver.findElement(By.id("promo_code")).sendKeys("NH123");
		Thread.sleep(5000);
		driver.findElement(By.id("applyCouponBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"order_package\"]/input[5]")).click();
	}

}
