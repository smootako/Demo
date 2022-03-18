import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Book_Appointment {

	public static void main(String[] args) throws InterruptedException {
		try {
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
			Thread.sleep(2000);
			
			c.mouse1(driver);
			Book_Doctor.bookDoc(driver);
			//c.mouse1(driver);
			c.mouse1(driver);
			Book_Doctor.bookDoc(driver);
			Pathology.pathology1(driver);
			Pathology.payment(driver);
			c.mouse1(driver);
			Radiology.Rad(driver);
			Pathology.payment(driver);
			c.mouse1(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Vaccine_Clinic.vaccine_clinic(driver);
		//Pathology.payment(driver);

		
	}
		
		
		
		public void mouse1(WebDriver driver)
		{
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//*[@id=\"admin-reports\"]"))).build().perform();
			//clicking on patients
			driver.findElement(By.xpath("//*[@id=\"admin-list-patients\"]")).click();
		}
		public static  void Basic(WebDriver driver)
		{
			driver.findElement(By.id("user_login")).sendKeys("msatheesh434@gmail.com");
			driver.findElement(By.id("user_password")).sendKeys("satti7669");
			driver.findElement(By.name("commit")).click();
			//driver.findElement(By.linkText("Doctor")).click();
			
			//selecting Role clicking on Clinic manager Role
			
		}

}
