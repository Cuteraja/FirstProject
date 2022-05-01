package org.base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
     
	// 1.Browser Launch by fixed browser
//	public static WebDriver browserLaunch() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		return driver;
//	}
	
	// 2.Browser Launch by using if else
//	public static WebDriver browserLaunch(String browserName) {
//		if(browserName.equalsIgnoreCase("chrome")) {
//		    WebDriverManager.chromedriver().setup();
//		    driver = new ChromeDriver();
//		}
//		else if(browserName.equalsIgnoreCase("edge")) {
//			WebDriverManager.edgedriver().setup();
//			driver = new EdgeDriver();
//		}
//		else if(browserName.equalsIgnoreCase("firefox")) {
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//		}	
//		else {
//			System.out.println("Invalid Browser");
//		}
//		return driver;
//	}
	
	// 3.Browser Launch by using switch case
	public static WebDriver browserLaunch(String bowserName) {
        switch (bowserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Invalid Browser");
			break;
		}
		return driver;
	}
	
	// Url Launch
	public static void urlLaunch(String url) {
		driver.get(url);
	}
	
	// maximize
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	// implicitlyWait
	public static void implicitlyWait(long sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}
	
	// WebDriver methods
	// getTitle
	public static String getTitle() {
        String title = driver.getTitle();
		return title;
	}
	
	// getCurrentUrl
	public static String getCurrenturl() {
        String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	
	// close
	public static void close() {
		driver.close();
	}
	
	// quit
	public static void quit() {
		driver.quit();

	}
	
	// findElement
	public static WebElement findElement(String locatorName, String value) {
		WebElement findElement=null;
		if(locatorName.equals("id")) {
			findElement = driver.findElement(By.id(value));
		}
		else if(locatorName.equals("name")) {
			findElement = driver.findElement(By.name(value));
		}
		else if(locatorName.equals("className")) {
			findElement = driver.findElement(By.className(value));
		}
		else if(locatorName.equals("xpath")) {
			findElement = driver.findElement(By.xpath(value));
		}
		else if(locatorName.equals("tagName")) {
			findElement = driver.findElement(By.tagName(value));
		}
		else {
			System.out.println("Invalid Locator");
		}
		return findElement;
	}
	
	// findElements
	public static List<WebElement> findElements(String locatorName, String value) {
		
		List<WebElement> findElements=null;
		if(locatorName.equals("id")) {
			findElements = driver.findElements(By.id(value));
		}
		else if(locatorName.equals("name")) {
			findElements = driver.findElements(By.name(value));
		}
		else if(locatorName.equals("className")) {
			findElements = driver.findElements(By.className(value));
		}
		else if(locatorName.equals("xpath")) {
			findElements = driver.findElements(By.xpath(value));
		}
		else if(locatorName.equals("tagName")) {
			findElements = driver.findElements(By.tagName(value));
		}
		else {
			System.out.println("Invalid Locator");
		}
		return findElements;

	}
	
	
	
	// WebElement
	
	// clear
	public static void clear(WebElement e) {
		e.clear();
	}
	
	// click
    public static void click(WebElement e) {
		e.click();
	}
    
    // sendKeys
    public static void sendKeys(WebElement e, CharSequence String) {
        e.sendKeys(String);
	}
    
    // getAttribute
    public static String getAttribute(WebElement e) {
		String attribute = e.getAttribute("value");
		return attribute;
	}
    
    // getText
    public static String getText(WebElement e) {
		String text = e.getText();
		return text;
	}
	
    // submit
    private void submit(WebElement e) {
		e.submit();
	}
    
    // JavascriptExecutor methods
    // executeScript methods
    public static void executeScript(String value, String WebElement) {
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript(value, WebElement);

	}
		
    // 1.setAttribute
    public static JavascriptExecutor js=(JavascriptExecutor)driver;
    public static void setAttribute(String WebElement) {
    	js.executeScript("arguments[0].setAttribute('value', value)", WebElement);
	}
    
    // 2.getAttribute
    public static Object getAttribute(String WebElement) {
    	Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", WebElement);
		String s=(String)executeScript;
		System.out.println(s);
		return s;
	}
    
	
    
    
    
    
    
    
    
    
    
    
    
    

}
