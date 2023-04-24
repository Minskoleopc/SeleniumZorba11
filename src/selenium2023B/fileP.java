package selenium2023B;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fileP {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
		FileInputStream input = new FileInputStream("C:\\Users\\ankurjain\\Desktop\\eclispe-workspace2\\selenium2023B\\src\\selenium2023B\\test.properties");
		prop.load(input);
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		
//		if(browser == "chrome") {
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankurjain\\Desktop\\browsers\\chromedriver.exe");
//			ChromeDriver driver = new ChromeDriver();
//			driver.get(prop.getProperty("baseurl"));
//			
//		}
//		else {
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankurjain\\Desktop\\browsers\\chromedriver.exe");
//			FirefoxDriver driver = new FirefoxDriver();
//		}
		
		
		FileOutputStream output = new FileOutputStream("C:\\Users\\ankurjain\\Desktop\\eclispe-workspace2\\selenium2023B\\src\\selenium2023B\\test.properties");
		prop.setProperty("country", "india");		
		prop.store(output,"storing the country");
		
		
		
		
		
	}

}
