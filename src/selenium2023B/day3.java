package selenium2023B;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class day3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		// Arrangement
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankurjain\\Desktop\\browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
		
		// Action 
	
		driver.manage().window().maximize();
		driver.findElement(By.id("userName")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("!Nw@123");
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		
		// Assertion
		boolean errorMessage = driver.findElement(By.id("name")).isDisplayed();
		
		if(errorMessage) {
			System.out.println("Testcase pass");
		}
		else {
			System.out.println("Testcase fail");
		}
		
		// comments
		
		
		
		
	

	}

}
