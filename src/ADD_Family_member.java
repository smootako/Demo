import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ADD_Family_member {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\NH - Android\\Desktop\\Selenium\\Driver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\NH - Android\\Desktop\\Selenium\\Driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://customer.nanohealthplan.com/users/sign_in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("user_login")).sendKeys("msatheesh434@gmail.com");
		driver.findElement(By.id("user_password")).sendKeys("satti7669");
		Thread.sleep(2000);
		driver.findElement(By.name("commit")).click();
		Thread.sleep(2000);
		 //driver.findElementByLinkText("Doctor").click();
		//selecting Role clicking on Clinic manager Role
		driver.findElement(By.xpath("//*[@id=\"account-selection\"]/div/div[2]/a[2]/div/div/div/div[2]")).click();
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"admin-reports\"]"));
		action.moveToElement(element).perform();
		//clicking on patients
		driver.findElement(By.xpath("//*[@id=\"admin-list-patients\"]")).click();   
		//clicking on Id
		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[3]/a")).click();
		//clicking on add family member
		ADD_Family_member.family(driver);
	}
	public static void family(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"base_info\"]/div[1]/div/div/div[3]/label/a[2]/i")).click();
		/*Thread.sleep(2000);
		driver.findElement(By.cssSelector("#first_name")).sendKeys("satheesh");
		Thread.sleep(1000);
		driver.findElement(By.id("lst_name")).sendKeys("krishna");
		Thread.sleep(1000);
		driver.findElement(By.id("patient_master_dob")).click();
		driver.findElement(By.xpath("//*[@id=\"new_patient_master\"]/div[2]/div[2]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"patient_master_dob_table\"]/tbody/tr[3]/td[4]/div")).click();*/
		driver.findElement(By.linkText("Registered User")).click();
		driver.findElement(By.id("register_patient_data")).sendKeys("9949823391");
		driver.findElement(By.xpath("//*[@id=\"valid_form\"]/div[1]/div[2]/div/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"relation_select_relation\"]/span/span[1]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"relation_select_relation\"]/span/span[1]/span")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"relation_select_relation\"]/span/span[1]/span")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"valid_form\"]/div[2]/input[1]")).click();
		
		
		
		
		

	}

}
