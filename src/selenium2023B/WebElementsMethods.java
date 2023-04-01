package selenium2023B;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Database     ------ API    ----------- UI(html , css , javascript)
		// html hypertext markup language 
		// css
		// javascript
		// element - html elements
		// html will attribute and value 
		// on user actions 
		// element are created , updated , retrieve and deleted
		// based on user action 
		// html element's attribute are created , updated , retrive , deleted
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankurjain\\Desktop\\browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		
		/*1st set of methods*/
		//driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		//WebElement first_name = driver.findElement(By.name("first_name"));
		
		// sendKeys()  --- input and text area
		//first_name.sendKeys("chinmay");
		
		
		// clear()    ---- input and text area
		//first_name.clear();
		
		
		//click()
//		driver.findElement(By.name("first_name")).sendKeys("chinmay");
//		driver.findElement(By.name("last_name")).sendKeys("deshpande");
//		driver.findElement(By.name("email")).sendKeys("chinmaydeshpande");
//		driver.findElement(By.name("message")).sendKeys("I am learning js");
//		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
//		
//		//isDisplayed()
//		boolean eleAvail = driver.findElement(By.cssSelector("h2[name=\"contactme\"]")).isDisplayed();
//		System.out.println(eleAvail);
		

		/*second set of methods*/
		
//		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
//		boolean isEn = driver.findElement(By.cssSelector("input[value='cabbage']")).isEnabled();
//		boolean isEn2 = driver.findElement(By.cssSelector("input[value='pumpkin']")).isEnabled();
//		System.out.println(isEn);
//		System.out.println(isEn2);
		
		// isSelected
//		driver.findElement(By.cssSelector("input[value='green']")).click();
//		boolean isSel =driver.findElement(By.cssSelector("input[value='green']")).isSelected();
//		boolean isSel2 =driver.findElement(By.cssSelector("input[value='blue']")).isSelected();
//		System.out.println(isSel);
//		System.out.println(isSel2);
		
		
		//Submit
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		driver.findElement(By.name("first_name")).sendKeys("chinmay");
		driver.findElement(By.name("last_name")).sendKeys("deshpande");
		driver.findElement(By.name("email")).sendKeys("chinmaydeshpande");
		driver.findElement(By.name("message")).sendKeys("I am learning js");
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).submit();
		
		// <h1>Hello</h1>
		
		// getText()
		// getTagName()
		// getCssValue()
		// getArritbute()
		// getSize()
		// getLocation()
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
