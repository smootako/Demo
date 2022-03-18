import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Procedure_Booking {

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
		Actions action = new Actions(driver);
		WebElement element = driver.findElementByXPath("//*[@id=\"admin-reports\"]");
		action.moveToElement(element).perform();
		//
		Thread.sleep(1000);
		//clicking on patients
		driver.findElementByXPath("//*[@id=\"admin-list-patients\"]").click();
		Thread.sleep(1000);            
		String oldTab = driver.getWindowHandle();
		//selecting particular id
		driver.findElementByXPath("//*[@id=\"example\"]/tbody/tr[1]/td[3]/a").click();
		//ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
	   // newTab.remove(oldTab);
	    // change focus to new tab
	    //driver.switchTo().window(newTab.get(0));
		Thread.sleep(1000);
		driver.findElementByXPath("/html/body/header/div[1]/nav[2]/div/ul/li[2]/a").click();
		Thread.sleep(2000);
		driver.findElementByXPath("/html/body/main/div/div[2]/div[1]/div[3]/div/div/div/a[4]/img").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@id=\"test-link-2\"]/a").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@id=\"checkout-block\"]/div[2]/a").click();
		Thread.sleep(2000);
		driver.findElementById("in_patient_detail_planned_operation_dt").click();
		//Select dropdown1 = new Select(driver.findElementByXPath("//*[@id=\"in_patient_detail_planned_operation_dt_root\"]/div/div/div/div/div[2]/div/select[1]"));
       // dropdown1.selectByVisibleText("Jun");
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElementByCssSelector(".picker__day.picker__day--infocus.picker__day--today.picker__day--highlighted").click();
        Thread.sleep(2000);
        driver.findElementByXPath("//*[@id=\"continue-btn\"]").click();
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElementByXPath("//*[@id=\"in_patient_detail_referred_by\"]").sendKeys("Harshitha");
        Thread.sleep(2000);
        driver.findElementByXPath("//*[@id=\"test-link-0\"]/a").click();
        Thread.sleep(2000);
        driver.findElementByXPath("//*[@id=\"continue-team\"]").click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElementByXPath("//*[@id=\"labBookingForm\"]/ul/li[4]/div[2]/div[2]/div/div[2]/span/span[1]/span").click();       
        Thread.sleep(2000);
        driver.findElementByXPath("//*[@id=\"labBookingForm\"]/ul/li[4]/div[2]/div[2]/div/div[2]/span/span[1]/span").sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        driver.findElementByXPath("//*[@id=\"labBookingForm\"]/ul/li[4]/div[2]/div[2]/div/div[2]/span/span[1]/span").sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        driver.findElementByXPath("//*[@id=\"labBookingForm\"]/ul/li[4]/div[2]/div[2]/div/div[2]/span/span[1]/span").sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElementByXPath("//*[@id=\"continue-ot\"]").click();
        Thread.sleep(2000);
        driver.findElementById("in_patient_detail_ot_chrge").sendKeys("500");
        Thread.sleep(2000);
        driver.findElementById("in_patient_detail_anaesthesia_chrge").sendKeys("200");
        Thread.sleep(2000);
        driver.findElementById("in_patient_detail_nursing_chrge").sendKeys("100");
        Thread.sleep(2000);
        driver.findElementById("btn-loader").click();
        Thread.sleep(2000);
        driver.findElementByName("promo_disc").sendKeys("100");
        driver.findElementById("applyCouponBtn").click();
        Thread.sleep(2000);
        driver.findElementByName("commit").click();

	}

}
