import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Diet_pres {

	public static void diet(WebDriver driver) throws InterruptedException
	{           
		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[3]/div/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/main/div/div[2]/div[1]/div[3]/div/div/div/a[3]/img")).click();
		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div[1]/div/div/div[2]/div/div[2]/div[4]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"apmnt-type\"]/div[2]/div[1]/div[2]/div[2]/div/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("slot")).click();
		Thread.sleep(2000);
		//driver.findElement(By.XPath("//*[@id=\"new_appointment_tracking\"]/ul/li[4]/div[2]/div[1]/div[1]/div[2]/div[3]/label[2]").click();
		Thread.sleep(2000);
		driver.findElement(By.id("bookNowBtn")).click();
		Thread.sleep(2000);
		//driver.findElement(By.Id("promo_disc").sendKeys("100");
		driver.findElement(By.xpath("//*[@id=\"new_nanosafe_payment\"]/div[4]/div[2]/div[2]/div[2]/label")).click();
		Thread.sleep(3000);
		//driver.findElement(By.Id("applyCouponBtn").click();
		driver.findElement(By.xpath("//*[@id=\"advance_field\"]")).sendKeys("200");
	}
	public static void dietp(WebDriver driver)
	{
		driver.findElement(By.xpath("//*[@id=\"bookNowBtn\"]")).click();
		//driver.findElement(By.XPath("/html/body/header/nav/a[1]/img").click();
		driver.findElement(By.linkText("Dietitian")).click();
		//driver.findElement(By.XPath("//*[@id=\"calendar\"]/div[1]/div[2]/button[1]").click();
		/*driver.findElement(By.LinkText("Week").click();
		Thread.sleep(1000);
		driver.findElement(By.LinkText("Month").click();
		Thread.sleep(1000);
		driver.findElement(By.LinkText("Today").click(); 
		Thread.sleep(2000);*/
		driver.findElement(By.linkText("Consult")).click();
	       // selecting add prescription
	        driver.findElement(By.xpath("//*[@id=\"modal_consult\"]/div/div[2]/div[2]/div[2]/div[2]/a/img")).click();
	      driver.findElement(By.id("accompanied_input_helper")).sendKeys("Father" );
	       driver.findElement(By.id("healthHistoryTxt")).sendKeys("Fever one week before");
           //Thread.sleep(1000);
	       
	       //vitals
	      driver.findElement(By.id("bp-s")).sendKeys("120");
	       //Thread.sleep(500);
	       driver.findElement(By.id("bp-d")).sendKeys("80");
	       // Thread.sleep(500);
	        driver.findElement(By.id("pulse")).sendKeys("75");
	       // Thread.sleep(500);
	        driver.findElement(By.id("vitals_height_cms")).sendKeys("178");
	        //Thread.sleep(500);
	        driver.findElement(By.id("weight")).sendKeys("75");
	        //Thread.sleep(500);
	        driver.findElement(By.id("vitals_waist")).sendKeys("36");
	       // Thread.sleep(500);
	        driver.findElement(By.id("vitals_hip")).sendKeys("34");
	       // Thread.sleep(500);
	        driver.findElement(By.id("temp")).sendKeys("98");
	       // Thread.sleep(500);
	        driver.findElement(By.id("vitals_spo2")).sendKeys("98");
		//Adding Symptoms
	        driver.findElement(By.id("patient_prescription_header_symptoms")).sendKeys("cold" + Keys.ENTER);
	        driver.findElement(By.id("patient_prescription_header_symptoms")).sendKeys("fever" + Keys.ENTER);
	        driver.findElement(By.id("patient_prescription_header_diagnosis")).sendKeys("Hypertension" + Keys.ENTER);
	        driver.findElement(By.className("diagnosis_duration")).sendKeys("1");
	        driver.findElement(By.xpath("//*[@id=\"patient_prescription_header_patient_prescription_lines_attributes_0_brand_name\"]")).sendKeys("kolq");
	        driver.findElement(By.xpath("//*[@id=\"patient_prescription_header_patient_prescription_lines_attributes_0_brand_name\"]")).sendKeys(Keys.ENTER);
	        driver.findElement(By.id("hospital_name")).sendKeys("Appolo");
		    driver.findElement(By.xpath("//*[@id=\"referred-hospital-detail\"]/div[1]/div[2]/span/span[1]/span")).sendKeys(  Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("//*[@id=\"referred-hospital-detail\"]/div[1]/div[2]/span/span[1]/span")).sendKeys(Keys.ENTER);
		   // Thread.sleep(2000);
		    driver.findElement(By.id("referred_doctor_name")).sendKeys("vijay");
		    driver.findElement(By.id("patient_prescription_header_referral_reason")).sendKeys("critical condition");
		    driver.findElement(By.cssSelector("#recommended_lab_input_helper")).sendKeys("HbA1c" + Keys.ENTER);
		    driver.findElement(By.xpath("//*[@id=\"next_visit_type_box\"]/div[3]/label")).click();
		    driver.findElement(By.id("prescriptionComments")).sendKeys("as established By. Jawaharlal Nehru under the Department of Atomic Energy (DAE) in 1962,\r\n"
		    		+ " on the urging of scientist Vikram Sarabhai recognising the need in space research. \r\n"
		    		+ "INCOSPAR grew and became ISRO in 1969, within DAE.[9] In 1972, \r\n"
		    		+ "the Government of India had set up\r\n"
		    		+ "was established By. Jawaharlal Nehru under the Department,\r\n"
		    		+ " of Atomic Energy (DAE) in 1962,\r\n"
		    		+ " on the urging of scientist Vikram Sarabhai recognising the need in space research. \r\n"
		    		+ "INCOSPAR grew and became ISRO in 1969, within DAE.[9] In 1972, \r\n"
		    		+ "the Government of India had set up");
	        driver.findElement(By.cssSelector("#saveBtn")).click();

	}

}
