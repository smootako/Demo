import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dietician_appointment_Booking {

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
		driver.findElementByXPath("//*[@id=\"account-selection\"]/div/div[2]/a[2]/div/div/div/div[2]").click();
		//hover the mouse on Reports
		Book_Appointment q=new Book_Appointment();
		q.mouse1(driver);
		Diet_pres.diet(driver);
		Diet_pres.dietp(driver);
		
	}

}
