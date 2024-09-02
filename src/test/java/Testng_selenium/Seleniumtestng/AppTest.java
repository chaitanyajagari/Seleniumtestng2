package Testng_selenium.Seleniumtestng;


import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Class 
public class AppTest 
{
	@Test
 // Main driver method 
 public void firsttest()
 { 
     System.setProperty( 
         "webdriver.chrome.driver", 
         "C:\\Users\\Chaitanya\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 

     ChromeDriver driver = new ChromeDriver(); 

     // Maximize the browser 
     // using maximize() method 
     driver.manage().window().maximize(); 

     // Launching website 
     driver.get("https://www.geeksforgeeks.org/"); 
 } 
}