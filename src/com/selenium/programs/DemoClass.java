package com.selenium.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import edu.emory.mathcs.backport.java.util.Collections;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoClass 
{
	public static void main(String[] args) 
	{
		WebDriver driver;
		String browser="chrome";
 
		
		if(browser.equals("chrome"))
		{
		
		ChromeOptions options=new ChromeOptions();
		//options.setHeadless(true);      // set the browser as headless browser
		//options.addArguments("--headless"); // another way of making browser, the headless
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.navigate().to("http://www.amazon.in/");
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		System.out.println("Title of the Page: "+ driver.getTitle());
		WebElement search= driver.findElement(By.xpath(".//textarea[@class='gLFyf']"));
		search.clear();
		search.sendKeys("Seleium ");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		
		List<WebElement> al=driver.findElements(By.xpath(".//li[@class='sbct']//parent::ul[@jsname='bw4e9b']"));
		
		
		
	    for(WebElement e1:al)
	    {
	     String s1=e1.getText();
	     System.out.println(s1);
		 
	    }
		
		driver.close();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\SELENIUM\\BROWSER_DRIVERS\\geckodriver.exe");
			//FirefoxOptions options=new FirefoxOptions();
			//options.setHeadless(true);
		   // options.addArguments("--headless");
			driver = new FirefoxDriver();
			
			driver.navigate().to("http://www.amazon.in/");
			driver.manage().window().maximize();
			System.out.println("Title of the page: "+driver.getTitle());
			driver.close();
		}
		else if(browser.equals("internetExplorer"))
		{
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			driver.navigate().to("http://www.flipkart.com/");
			driver.manage().window().maximize();
		}
		else if(browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.navigate().to("http://www.selenium.dev/");
			driver.manage().window().maximize();
		}
		else
		{
			System.out.println("Non of the Browsers are Working");
		}
		/*
		 * WebElement p = driver.findElement(By.name("q")); // enter text with
		 * sendKeys() then apply submit() p.sendKeys("Selenium Java"); // Explicit wait
		 * condition for search results WebDriverWait w = new WebDriverWait(driver, 5);
		 * w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul")));
		 * p.submit(); driver.close();
		 */
	}

}
