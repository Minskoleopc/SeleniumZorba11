package selenium2023B;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandlesInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankurjain\\Desktop\\browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		driver.findElement(By.id("contact-us")).click();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> windows = driver.getWindowHandles(); // [Id1,Id2]
		System.out.println(windows);
		Iterator<String> s = windows.iterator();
		String parentA = s.next();
		String childA = s.next();
		
		System.out.println(parentA);
		System.out.println(childA);
		
		driver.switchTo().window(childA);
		driver.findElement(By.cssSelector("h2[name='contactme']")).isDisplayed();
		driver.switchTo().window(parentA);
		if(driver.getTitle().equals("WebDriverUniversity.com")) {
			System.out.println("Testcase passs");
		}
		

		driver.quit();
		
		
	
		
		
		
		
		
		

	}

}
