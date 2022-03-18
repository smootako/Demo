import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Recomendation{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NH - Android\\Desktop\\Selenium\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://customer.nanohealthplan.com/users/sign_in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("user_login").sendKeys("msatheesh434@gmail.com");
		driver.findElementById("user_password").sendKeys("satti7669");
		driver.findElementByName("commit").click();
		driver.findElementByXPath("//*[@id=\"account-selection\"]/div/div[2]/a[2]/div/div/div/div[2]").click();
		Recomendation.mouce(driver);
		Recomendation.recom(driver);
	}
	public static void recom(WebDriver driver) throws InterruptedException	
	{
		driver.findElement(By.id("q_patient_master_frst_nm_or_patient_master_lst_nm_cont")).sendKeys("vijay" + Keys.ENTER);
		driver.findElement(By.name("commit")).click();
		driver.findElement(By.id("q_patient_master_frst_nm_or_patient_master_lst_nm_cont")).clear();
		driver.findElement(By.id("q_patient_master_ptnt_rgstrtn_id_cont")).sendKeys("RDAA1632060453502");
		driver.findElement(By.name("commit")).click();
		driver.findElement(By.id("q_patient_master_ptnt_rgstrtn_id_cont")).clear();
		driver.findElement(By.xpath("//*[@id=\"patient_test_recommendation_detail_search\"]/div[1]/div[3]/span/span[1]/span/ul/li/input")).click();
		driver.findElement(By.xpath("//*[@id=\"patient_test_recommendation_detail_search\"]/div[1]/div[3]/span/span[1]/span/ul/li/input")).sendKeys(Keys.ARROW_DOWN.ENTER);
		driver.findElement(By.name("commit")).click();
		driver.findElement(By.xpath("//*[@id=\"patient_test_recommendation_detail_search\"]/div[1]/div[4]/span/span[1]/span/ul/li/input")).click();
		driver.findElement(By.xpath("//*[@id=\"patient_test_recommendation_detail_search\"]/div[1]/div[4]/span/span[1]/span/ul/li/input")).sendKeys("pending" +Keys.ENTER);
		//driver.findElement(By.name("commit")).click();
		driver.findElement(By.xpath("//*[@id=\"patient_test_recommendation_detail_search\"]/div[2]/div[1]/span/span[1]/span/ul/li/input")).sendKeys("clinic" +Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"patient_test_recommendation_detail_search\"]/div[2]/div[2]/span/span[1]/span/ul/li/input")).sendKeys("doctor" + Keys.ENTER);
		//driver.findElement(By.name("commit")).click();
		driver.findElement(By.id("q_start_date_gteq")).click();
		driver.findElement(By.cssSelector(".month-prev")).click();
		driver.findElement(By.cssSelector(".datepicker-day-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"q_start_date_lteq\"]")).click();
		driver.findElement(By.cssSelector(".is-today")).click();
		driver.findElement(By.name("commit")).click();
	}
	public static void mouce(WebDriver driver)
	{
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"admin-reports\"]"))).build().perform();
		//clicking on patients
		driver.findElement(By.id("admin-recommendations")).click();
	}

}
