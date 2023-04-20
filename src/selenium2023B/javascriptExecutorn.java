package selenium2023B;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptExecutorn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankurjain\\Desktop\\browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.webdriveruniversity.com/");
//		
//		//System.out.println(driver.getTitle());
//		
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		String jsScript = "return document.title";
//		String aa1 = (String)js.executeScript(jsScript);
//		System.out.println(aa1);
//		
//			
//		// Getting the element
//		String jsScript2 = "return document.querySelector('#contact-us')";
//		WebElement aa = (WebElement)js.executeScript(jsScript2);
//		System.out.println(aa.getText());
		
//		int x = "c";
//		let x = 10; // number
//		let x = "chinmay"// string 
//	    let x = true
		
		
		// program 2
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		WebElement e =driver.findElement(By.cssSelector("#iframeResult"));
		driver.switchTo().frame(e);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String jsScript3 = "myFunction()";
		js.executeScript(jsScript3);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
	}

}
