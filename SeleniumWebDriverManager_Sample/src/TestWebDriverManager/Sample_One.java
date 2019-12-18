package TestWebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample_One {
	
	public static void main (String [] args) {
		
		// Setup the Chrome Driver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		int length = driver.getTitle().length();
		
		System.out.println("Title is: " + title);
		System.out.println("Length :" + length);
		
		driver.close();
	}
	
}
