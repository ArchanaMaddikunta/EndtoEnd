package Resourses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public WebDriver driver;
	
	public  WebDriver  driverinitialize ()throws IOException {
		Properties prop =new Properties();
		FileInputStream fs= new FileInputStream(System.getProperty("user.dir")+"//src//main//java//Resourses//Data.properties");
		prop.load(fs);
		
		//if System.getProperty(browser)!=null ? System.getProperty(browser):prop.getProperty("browser")
		String browsername= System.getProperty("browser");
		if (browsername.equalsIgnoreCase("chrome")) {
			 WebDriverManager.chromedriver().setup();
			 driver= new ChromeDriver();
			 
		}
				
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		return  driver;
		
		
		
		
	
}
}
