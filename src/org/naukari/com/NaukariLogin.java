package org.naukari.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class NaukariLogin {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //web driver is an implementaton of methods
		
		driver.get("https://www.naukri.com");
		
		
		driver.quit();
	}

}
