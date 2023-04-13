package selenium2023B;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class AlertsInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// program 1
		// alert 
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankurjain\\Desktop\\browsers\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
//		driver.findElement(By.id("button1")).click();
//		driver.switchTo().alert().accept();
//		Thread.sleep(3000);
//		driver.close();
		
		
		// confirm() - accept()
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankurjain\\Desktop\\browsers\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
//		driver.findElement(By.id("button4")).click();
//		driver.switchTo().alert().accept();
//		String textAccept = driver.findElement(By.id("confirm-alert-text")).getText();
//		System.out.println(textAccept);
//		driver.quit();
//		
		// confirm - dismiss()
		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankurjain\\Desktop\\browsers\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
//		driver.findElement(By.id("button4")).click();
//		driver.switchTo().alert().dismiss();
//		String textDismiss = driver.findElement(By.id("confirm-alert-text")).getText();
//		System.out.println(textDismiss);
//		driver.quit();
//		
		// Prompt alert()
		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankurjain\\Desktop\\browsers\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		driver.manage().window().maximize();
//		driver.findElement(By.cssSelector("button[onclick=\"jsPrompt()\"]")).click();
//		driver.switchTo().alert().sendKeys("Text");
//		driver.switchTo().alert().accept();
//		String textValue = driver.findElement(By.id("result")).getText();
//		if(textValue.equals("You entered: Text")) {
//			System.out.println("Testcase pass");
//		}
//		else {
//			System.out.println("Testcase Fail");
//		}
//		driver.quit();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankurjain\\Desktop\\browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("button[onclick=\"jsPrompt()\"]")).click();
		driver.switchTo().alert().dismiss();
				

		String textValue = driver.findElement(By.id("result")).getText();
		if(textValue.equals("You entered: null")) {
			System.out.println("Testcase pass");
		}
		else {
			System.out.println("Testcase Fail");
		}
		driver.quit();
		
		/*
		 * 
		 * //		Alert alert = driver.switchTo().alert();
		  //		alert.accept();
          //		alert.dismiss();
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
