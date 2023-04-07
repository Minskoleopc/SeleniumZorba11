package selenium2023B;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

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
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankurjain\\Desktop\\browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
		driver.findElement(By.id("button4")).click();
		driver.switchTo().alert().dismiss();
		String textDismiss = driver.findElement(By.id("confirm-alert-text")).getText();
		System.out.println(textDismiss);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
