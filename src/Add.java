import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NH - Android\\Desktop\\Selenium\\Driver\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://customer.nanohealthplan.com/users/sign_in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("user_login").sendKeys("msatheesh434@gmail.com");
		driver.findElementById("user_password").sendKeys("satti7669");
		driver.findElementByName("commit").click();
		//selecting Role clicking on Clinic manager Role
		driver.findElementByXPath("//*[@id=\"account-selection\"]/div/div[2]/a[2]/div/div/div/div[2]").click();
		Add b=new Add();
		b.addPatient(driver);
		ADD_Family_member.family(driver);
	}
		public static void addPatient(WebDriver driver) {
			//add patient
			driver.findElement(By.xpath("//*[@id=\"search_bar_panel\"]/span[1]/li[1]/div/a")).click();
			//details
			driver.findElement(By.id("first_name")).sendKeys("Satheesh");
			driver.findElement(By.id("lst_name")).sendKeys("Krishna");
			driver.findElement(By.xpath("//*[@id=\"new_patient_master\"]/div[2]/div/ul/li/div/div[2]/div[2]/label")).click();
			driver.findElement(By.xpath("//*[@id=\"age\"]")).sendKeys("27");
			driver.findElement(By.xpath("//*[@id=\"nmbr\"]")).sendKeys("9949823391");
			//driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("satheesh.mk1468@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"address-line1\"]")).sendKeys("Hyd");
			driver.findElement(By.xpath("//*[@id=\"autocomplete-input\"]")).sendKeys("Hyderabad");
			driver.findElement(By.id("landmark")).sendKeys("Near Gachibowli");
			driver.findElement(By.xpath("//*[@id=\"update_submit\"]")).click();
	}

}
