import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Video_Cons {

	public static void main(String[] args) throws InterruptedException {
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\NH - Android\\Desktop\\Selenium\\Driver\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();*/
		System.setProperty("webdriver.gecko.driver","C:\\Users\\NH - Android\\Desktop\\Selenium\\Driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://customer.nanohealthplan.com/users/sign_in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.id("user_login")).sendKeys("msatheesh434@gmail.com");
		driver.findElement(By.id("user_password")).sendKeys("satti7669");
		driver.findElement(By.name("commit")).click();
		
		//selecting Role clicking on Clinic manager Role
		driver.findElement(By.xpath("//*[@id=\"account-selection\"]/div/div[2]/a[2]/div/div/div/div[2]")).click();
		Book_Appointment c=new Book_Appointment();
		c.mouse1(driver);
		Book_Doctor.bookDoc(driver);
		driver.findElement(By.xpath("/html/body/header/nav/a[1]/img")).click();
		Thread.sleep(1000);
		Video_Cons.video(driver);
		

	}
	public static void video(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.linkText("Doctor")).click();
		//driver.findElement(By.XPath("//*[@id=\"calendar\"]/div[1]/div[2]/button[1]").click();
		driver.findElement(By.linkText("Consult")).click();
	       // selecting add prescription
		driver.findElement(By.xpath("//*[@id=\"modal_consult\"]/div/div[2]/div[2]/div[2]/div[7]/img")).click();
		driver.findElement(By.id("mobile")).clear();
		driver.findElement(By.id("mobile")).sendKeys("9949823391");
		String oldTab = driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.name("commit")).click();
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
	    newTab.remove(oldTab);
	    // change focus to new tab
	    driver.switchTo().window(newTab.get(0));
	    Thread.sleep(5000);
	    driver.switchTo().alert().accept();

	       // driver.findElement(By.xpath("//*[@id=\"modal_consult\"]/div/div[2]/div[2]/div[2]/div[5]/a/img")).click();
		driver.findElement(By.linkText("Covid 19")).click();
	      driver.findElement(By.id("accompanied_input_helper")).sendKeys("Father" );
	       //;
	       //;
	       //driver.findElement(By.XPath("//*[@id=\"example\"]/tbody/tr[2]/td/div").click();
	       //;
	      //driver.findElement(By.Id("accompanied_input_helper").sendKeys("Father" );
	       //;
	       driver.findElement(By.id("healthHistoryTxt")).sendKeys("Fever one week before");
	       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	       //;
	       // driver.findElement(By.XPath("//*[@id=\"readings-header\"]/div[2]/div[1]/div[1]/div/label").sendKeys("120");
	       driver.findElement(By.id("doctor_visit_symptoms")).click();
	        driver.findElement(By.id("doctor_visit_symptoms")).sendKeys("cold" + Keys.ENTER);
	        //;
	        driver.findElement(By.id("doctor_visit_symptoms")).sendKeys("fever" + Keys.ENTER);
	        //;
	       
	        driver.findElement(By.id("doctor_visit_diagnosis")).sendKeys("typhoid");
	        //;
	        driver.findElement(By.id("doctor_visit_diagnosis")).sendKeys(Keys.ENTER);
	        //;
	        driver.findElement(By.className("diagnosis_duration")).sendKeys("1");
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.findElement(By.xpath("//*[@id=\"doctor_visit_patient_prescription_header_attributes_patient_prescription_lines_attributes_0_brand_name\"]")).sendKeys("kolq");
	        //;
	        driver.findElement(By.xpath("//*[@id=\"test-link-0\"]/a")).click();
	        driver.findElement(By.id("hospital_name")).sendKeys("Appolo" +Keys.TAB);
		    //;
		    driver.findElement(By.xpath("//*[@id=\"referred-hospital-detail\"]/div[1]/div[2]/span/span[1]/span")).sendKeys(  Keys.ARROW_DOWN);
		    //;
		    driver.findElement(By.xpath("//*[@id=\"referred-hospital-detail\"]/div[1]/div[2]/span/span[1]/span")).sendKeys(Keys.ENTER);
		   // //;
		    driver.findElement(By.id("doctor_name")).sendKeys("Satheesh");
		    //;
		    driver.findElement(By.id("doctor_visit_referral_reason")).sendKeys("critical condition");
		    //;
		    ////;
		    //driver.findElement(By.XPath("//*[@id=\"add-prescription-form-modal\"]/div[2]/div/b/b/div/img[20]").click();
		   // //;
		   // driver.findElement(By.XPath("//*[@id=\"prescriptionNotesDiv\"]/div[2]/div/div[2]/div/div[1]/input[2]").sendKeys("Drink more water");
	        driver.findElement(By.id("doctor_visit_recommended_labs")).sendKeys("fbs" + Keys.ENTER);
	       
		    //;
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        //driver.findElement(By.ClassName("radio_label2").click();
	        driver.findElement(By.id("saveBtn")).click();
	        //;
	        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	        driver.findElement(By.xpath("//*[@id=\"prescriptionFormModal\"]/div[2]/a[4]/img")).click();
	        //;
	      //  driver.findElement(By.id("phone")).sendKeys("9949823391");
	        //;
	        
	        driver.findElement(By.name("commit")).click();
	        //;
	        //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	        Thread.sleep(5000);
	        String oldTab1 = driver.getWindowHandle();
	        driver.findElement(By.xpath("//*[@id=\"prescriptionFormModal\"]/div[2]/a[3]/img")).click();
	        ArrayList<String> newTab1 = new ArrayList<String>(driver.getWindowHandles());
		    newTab1.remove(oldTab1);
		    // change focus to new tab
		    driver.switchTo().window(newTab1.get(0));
		    Thread.sleep(5000);
		    driver.switchTo().window(oldTab1);
		    //;
		    driver.findElement(By.xpath("//*[@id=\"print_close_button\"]")).click();
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    //;
		   // driver.findElement(By.XPath("//*[@id=\"patient_timer\"]").click();
		   // //;
		    //driver.findElement(By.XPath("//*[@id=\"history_list9916\"]/div/span[2]").click();
		    Thread.sleep(5000);
	
	}

}
