package selenium2023B;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Arrange
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankurjain\\Desktop\\browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		// Test case 1
//		//Action 
		WebElement username = driver.findElement(By.cssSelector("input[placeholder='Username']"));
		WebElement password = driver.findElement(By.cssSelector("input[placeholder='Password']"));
		WebElement loginButton	=driver.findElement(By.cssSelector("button[type='submit']"));
	
//		// valid credentials 
//		username.sendKeys("Admin");
//		Password.sendKeys("admin123");
//		loginButton.click();
//		Thread.sleep(5000);
//		WebElement  logo = driver.findElement(By.cssSelector("img[alt='client brand banner']"));
//		//Assertion
//		boolean logoDisplayed = logo.isDisplayed();
//		
//		if(logoDisplayed) {
//			System.out.println("Test case pass");
//		}
//		else {
//			System.out.println("Test case fail");
//		}
//		
//		driver.close();
		
		// Test case 2 
		
		// actions
//		username.sendKeys("adin");
//		password.sendKeys("adin123");
//		loginButton.click();
//		
//		// assertion
//		Thread.sleep(3000);
//		WebElement errorMsg = driver.findElement(By.cssSelector("i[class=\"oxd-icon bi-exclamation-circle oxd-alert-content-icon\"]"));
//		boolean err = errorMsg.isDisplayed();
//		if(err) {
//			System.out.println("Testcase pass");
//		}
//		else {
//			System.out.println("Test case failed");
//		}
//		
//		driver.close();
		
		
		// Testcase3
		
	
//		WebElement ele = driver.findElement(By.cssSelector("div[class=\"orangehrm-login-branding\"]"));
//		if(ele.isDisplayed()) {
//			System.out.println("test case pass");
//		}
//		else {
//			System.out.println("testcase fail");
//		}
//		driver.quit();
		
		
		// Forgot password
		// Testcase 4
		
		
//		driver.findElement((By.cssSelector("p[class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]"))).click();
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);
//		
//		if(currentUrl.contains("requestPasswordResetCode")) {
//			System.out.println("Testcase pass");
//		}
//		else {
//			System.out.println("Testcase fail");
//		}
//		driver.close();
		
		

	}

		
}
