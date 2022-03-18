import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Book_Doctor {

	public static void main(String[] args) {
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
		//hover the mouse on Reports
		Book_Appointment c=new Book_Appointment();
		//c.mouse1(driver);
		//Book_Doctor.bookDoc(driver);
		driver.findElementByCssSelector(".profile-data").click();
		driver.findElementByCssSelector(".waves-effect.waves-purple").click();
		driver.get("https://customer.nanohealthplan.com/users/sign_in");
		c.Basic(driver);
	}
	public static void bookDoc(WebDriver driver)
	
	{
	driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[8]/a[1]/img")).click();
	
	//selecting doctor
	driver.findElement(By.xpath("/html/body/main/div/div[3]/div/div[2]/div/div/div[2]/div/div[2]/div[4]/div/a")).click();
	//type
	driver.findElement(By.xpath("//*[@id=\"apmnt-type\"]/div[2]/div[1]/div[2]/div[2]/div/div[1]")).click();
	
	//click time
	driver.findElement(By.className("slot")).click();
	driver.findElement(By.id("bookNowBtn")).click();
	driver.findElement(By.xpath("//*[@id=\"advance_field\"]")).sendKeys("400");
	
	driver.findElement(By.xpath("//*[@id=\"new_nanosafe_payment\"]/div[4]/div[2]/div[2]/div[2]/label")).click();	
	driver.findElement(By.xpath("//*[@id=\"bookNowBtn\"]")).click();
	

}

}
