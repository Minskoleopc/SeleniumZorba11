package selenium2023B;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles2 {

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
		
		/////// ----> [id,id2]
		
		while(s.hasNext()) {
			String child_window = s.next();
			if(!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				if(driver.getTitle().contains("WebDriver | Contact Us")) {
					System.out.println("Testcase pass");
				}
				
			}
		}
	
	
		

		
		

	}

}
