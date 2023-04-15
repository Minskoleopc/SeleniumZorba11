package selenium2023B;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankurjain\\Desktop\\browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
		driver.findElement(By.id("myInput")).sendKeys("p");
		List<WebElement> list = driver.findElements(By.cssSelector("#myInputautocomplete-list >div"));
		for(int i = 0 ; i < list.size() ; i++) {
			//System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("Pancakes")) {
				list.get(i).click();
				break;
			}
		}
		driver.findElement(By.id("submit-button")).click();
		if(driver.getCurrentUrl().contains("Pancakes")){
			System.out.println("Testcase pass");
		}
		
		Thread.sleep(5000);
		driver.quit();
		
		
		
		

	}

}
