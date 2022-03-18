import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  class payment
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NH - Android\\Desktop\\Selenium\\Driver\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
	}
	public static void Discount(WebDriver driver)
	{
	driver.findElement(By.cssSelector("#promo_disc")).sendKeys("100");
	driver.findElement(By.cssSelector("#applyCouponModal")).click();
	driver.findElement(By.cssSelector("#comments")).sendKeys("special");
	driver.findElement(By.name("commit")).click();
	driver.findElement(By.cssSelector("#bookNowBtn")).click();
	//driver.findElement(By.xpath("/html/body/header/div[1]/nav[2]/div/ul/li[2]/a")).click();

}
	
}
