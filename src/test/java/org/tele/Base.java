package org.tele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
public static WebDriver driver;
	
public WebDriver getDriver() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\thangaraj\\Telecom\\Driver\\chromedriver.exe");
driver = new ChromeDriver();
return driver;
}

public void launch(String url) {
driver.get(url);
}

public void type(WebElement ele, String name) {
ele.sendKeys(name);
}

public void clickmet (WebElement ele) {
ele.click();
}

public void Quitmet() {
	driver.quit();
}

public void closemet() {
	driver.close();
}













}
