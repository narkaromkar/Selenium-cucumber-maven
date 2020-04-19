package testUtil;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
		
	public static WebDriver driver;
	public static Properties prop;
	
	
	public BaseClass() {
		try {
			prop = new Properties();
			FileInputStream config = new FileInputStream(
					"C:\\Users\\Omkar\\eclipse-workspace\\Selenium-cucumber-maven\\src\\main\\java\\configurations\\Config.properties");
			prop.load(config);
		}
		catch(IOException e){
			e.getMessage();
		}
	}
	
	public static void initialization() {
		new BaseClass();
		String browerName= prop.getProperty("browser");
		if(browerName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Omkar\\eclipse-workspace\\Selenium-cucumber-maven\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else {
			System.out.println("Entered driver is not available");
			System.exit(0);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
}
