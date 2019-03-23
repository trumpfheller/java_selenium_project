package SeleniumFF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFF {

		public static void main(String[] args) {
			System.out.println("my Selenium Project");

			System.setProperty("webdriver.chrome.driver", "/Users/mikeadelenovo/projects/geckodriver");
		
			WebDriver driver = new FirefoxDriver();
			System.out.println("FF is open");
			driver.get("http://www.google.com");
			System.out.println(driver.getTitle());
		
			driver.get("https://softwarequalityassurance.blog");
			System.out.println(driver.getTitle());
			
			driver.get("https://www.plangrid.com/");
			System.out.println(driver.getTitle());
			
			driver.get("https://login.yahoo.com/config/login?.src=fpctx&.intl=us&.lang=en-US&.done=https%3A%2F%2Fwww.yahoo.com");
			System.out.println(driver.getTitle());
			driver.findElement(By.id("login-username")).sendKeys("demoldo@yahoo.com");
			
		}

	}
