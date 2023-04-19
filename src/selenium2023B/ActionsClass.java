package selenium2023B;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankurjain\\Desktop\\browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Actions/index.html");
		driver.manage().window().maximize();

		// DoubleClick
		Actions a = new Actions(driver);
//		WebElement e = driver.findElement(By.cssSelector("#double-click"));
//		a.doubleClick(e).build().perform();
//		if (e.getAttribute("class").equals("div-double-click double")) {
//			System.out.println("testcase case pass");
//		}

		// Drag and Drop option

//		WebElement draggable = driver.findElement(By.cssSelector("#draggable"));
//		WebElement droppable = driver.findElement(By.cssSelector("#droppable"));
//		System.out.println(droppable.getText());
//		a.dragAndDrop(draggable, droppable).build().perform();
//		System.out.println(droppable.getText());
//		

		// click and hold

//		WebElement e = driver.findElement(By.cssSelector("#click-box"));
//		a.clickAndHold(e).build().perform();
//		System.out.println(e.getText());
//		if(e.getText().equals("Well done! keep holding that click now.....")) {
//			System.out.println("Test case pass");
//		}

//		e.click();
//		if(e.getText().equals("Dont release me!!!")) {
//			System.out.println("Testcase pass");
//		}

		// Hover over element

//		WebElement ee = driver.findElement(By.cssSelector("#div-hover > div:nth-child(3) > button"));
//		a.moveToElement(ee).build().perform();
//		Thread.sleep(5000);

//		WebElement e = driver.findElement(By.cssSelector("#main-header"));
//		a.contextClick(e).build().perform();
//		Thread.sleep(5000);
		
		
		
		
		driver.quit();

	}

}
