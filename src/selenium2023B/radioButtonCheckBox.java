package selenium2023B;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class radioButtonCheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankurjain\\Desktop\\browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		// radio

//		WebElement greenElement = driver.findElement(By.cssSelector("input[value ='green']"));
//		WebElement blueElement = driver.findElement(By.cssSelector("input[value ='blue']"));
//		greenElement.click();
//		if(greenElement.isSelected()) {
//			System.out.println("Testcase 1 pass");
//			if(!(blueElement.isSelected())) {
//				System.out.println("Test case pass");
//			}
//			else {
//				System.out.println("Test case fail");
//			}
//		}
//		

//        List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[name='color']"));
//        
//        // iterate through every radio button in the group
//        for (int i = 0; i < radioButtons.size(); i++) {
//            // click on the radio button
//            radioButtons.get(i).click();
//            
//            // check if the next radio button is not already selected
//            if (i < radioButtons.size() - 1 && !radioButtons.get(i+1).isSelected()) {
//                System.out.println("Next radio button is not selected.");
//            }
//        }
//        

		// 10 --- 3
		
		
		List<WebElement> radioButtonss = driver.findElements(By.cssSelector("input[name='color']"));

		// iterate through every radio button in the group
//		Iterator<WebElement> iterator = radioButtonss.iterator();
//		
//		
//		while (iterator.hasNext()) {
//			// click on the radio button
//			WebElement radioButton = iterator.next();
//			radioButton.click();
//			Thread.sleep(2000);
//
//			// check if the next radio button is not already selected
//			if (iterator.hasNext() && !iterator.next().isSelected()) {
//				System.out.println("Next radio button is not selected.");
//			}
//
//		}

		//////////////////////////////////////// Individual
		//////////////////////////////////////// /////////////////////////////

//		// radio buttons
//		
//		WebElement box3 = driver.findElement(By.id("radio-buttons"));
//		List <WebElement> rd = box3.findElements(By.cssSelector("input[type='radio']"));
//		for(int i = 0 ; i < rd.size() ; i++) {
//			//System.out.println(rd.get(i).getAttribute("value"));
//			rd.get(i).click();
//		}
//		

//////////////////////////////////// CHECKBOX////////////////////////////////////////////////		

		// home work - other radio buttons are disabled , iterator
		// Checbox
//		List <WebElement> cb = driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
//		for(int i = 0 ; i < cb.size() ; i++) {
//			if(cb.get(i).isSelected()) {
//				System.out.println("Already selected");
//			}
//			else {
//				cb.get(i).click();
//			}
//		}
//		
//		for(int i = 0 ; i < cb.size() ; i++) {
//			System.out.println(cb.get(i).isSelected());
//			
//		}

		// program3
//		
//		if(driver.findElement(By.cssSelector("input[value = 'lettuce']")).isEnabled()) {
//			System.out.println("Testcase pass -one");
//		}
//		
//		if(!driver.findElement(By.cssSelector("input[value = 'cabbage']")).isEnabled()) {
//			System.out.println("Testcase pass - two");
//		}
//		if(driver.findElement(By.cssSelector("input[value = 'pumpkin']")).isSelected()) {
//			System.out.println("Testcase pass - three");
//		}
//		
		
		
		///////////////////////////////// Drop  Down -----------------------------------
		// Select the element based on text 
//		WebElement e = driver.findElement(By.cssSelector("#dropdowm-menu-1"));
//		Select dropOne = new Select(e);
//		dropOne.selectByVisibleText("Python");
//		Thread.sleep(2000);
//		driver.quit();
		
//	    Select class only applies to drop down with select as tagNAme
//      We need to pass select element to constructor
//      byValue , byIndex , byText		
		

		// Select the element based on index
//		WebElement e = driver.findElement(By.cssSelector("#dropdowm-menu-1"));
//		Select dropOne = new Select(e);
//		dropOne.selectByIndex(3);
//		Thread.sleep(2000);
//		driver.quit();
		
		
//		WebElement e = driver.findElement(By.cssSelector("#dropdowm-menu-1"));
//		Select dropOne = new Select(e);
//		dropOne.selectByValue("sql");
//		Thread.sleep(2000);
//		driver.quit();
		
		

		
		WebElement e = driver.findElement(By.cssSelector("#dropdowm-menu-1"));
		Select dropOne = new Select(e);
		dropOne.selectByValue("sql");
		Thread.sleep(2000);
		System.out.println(dropOne.getOptions());
		List <WebElement>  e1 = dropOne.getOptions();
		for(int i = 0 ; i < e1.size() ;i++) {
			System.out.println(e1.get(i).getText());
		}
		
		
		
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
//		
		

		
		
		
		
		
		
		
		
		
		// Select the element based on value 
		
		
		
		
		
		
		
		
		
		
		

		Thread.sleep(5000);
		driver.quit();

	}

}
