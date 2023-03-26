package selenium2023B;

import org.openqa.selenium.chrome.ChromeDriver;

public class dayOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// java project , add the class with main method
		//selenium client library
		//chrome driver
		//https://www.selenium.dev/downloads/
		//https://chromedriver.chromium.org/
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankurjain\\Desktop\\browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
