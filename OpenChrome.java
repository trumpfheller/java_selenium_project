import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {
		System.out.println("my Selenium Project");

		System.setProperty("webdriver.chrome.driver", "/Users/mikeadelenovo/projects/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.get("https://softwarequalityassurance.blog");
		System.out.println(driver.getTitle());
	
		driver.get("https://www.plangrid.com/");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.get("https://softwarequalityassurance.blog/contact/");
		driver.findElement(By.id("g2-name")).sendKeys("Test1");
		driver.findElement(By.id("g2-email")).sendKeys("test@example.com");
		driver.findElement(By.id("contact-form-comment-g2-comment")).sendKeys("ipsum");
	}

}
