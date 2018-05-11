package org.test.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
		public static WebDriver driver;
			
			public static WebDriver getDriver(String url)
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\uneab\\cucumber\\Driver\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.get(url);
				return driver;
				
			}
			public static void sendData(WebElement element, String name) {
				
		   element.sendKeys(name);
			}
			public static void click(WebElement element) {
				element.click();

			}
			public static void quit(WebDriver driver) {
				driver.quit();

		}
}
