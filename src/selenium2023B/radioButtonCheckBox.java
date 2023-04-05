package selenium2023B;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButtonCheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankurjain\\Desktop\\browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		// radio
		
		WebElement greenElement = driver.findElement(By.cssSelector("input[value ='green']"));
		WebElement blueElement = driver.findElement(By.cssSelector("input[value ='blue']"));
		greenElement.click();
		if(greenElement.isSelected()) {
			System.out.println("Testcase 1 pass");
			if(!(blueElement.isSelected())) {
				System.out.println("Test case pass");
			}
			else {
				System.out.println("Test case fail");
			}
		}
		
		// radio buttons
		
		WebElement box3 = driver.findElement(By.id("radio-buttons"));
		List <WebElement> rd = box3.findElements(By.cssSelector("input[type='radio']"));
		for(int i = 0 ; i < rd.size() ; i++) {
			//System.out.println(rd.get(i).getAttribute("value"));
			rd.get(i).click();
		}
		
		
		// home work - other radio buttons are disabled , iterator
		// Checbox
		List <WebElement> cb = driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
		for(int i = 0 ; i < cb.size() ; i++) {
			if(cb.get(i).isSelected()) {
				System.out.println("Already selected");
			}
			else {
				cb.get(i).click();
			}
			
		}
		
		for(int i = 0 ; i < cb.size() ; i++) {
			System.out.println(cb.get(i).isSelected());
			
		}
		
		
		
		
		
	    Thread.sleep(5000);
		driver.quit();

	}

}
