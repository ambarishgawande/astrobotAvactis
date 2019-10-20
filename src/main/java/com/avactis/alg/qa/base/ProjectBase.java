package com.avactis.alg.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.avactis.alg.qa.util.TestUtil;

public class ProjectBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static WebDriverWait wait;
	public static Actions action;
	
	static String configPath = "src\\main\\java\\com\\avactis\\alg\\qa\\config\\config.properties";
//	static String configPath = "C:\\Users\\AstrobotHP\\eclipse-workspace\\avactis\\src\\main\\java\\com\\avactis\\alg\\qa\\config\\config.properties";
	
	public ProjectBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(configPath);
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initializationOfBrowser(String page) {
		
		if (prop.getProperty("browser").equals("chrome") ) {
			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver_ver77.exe");
			driver = new ChromeDriver();
		}
		else if (prop.getProperty("browser").equals("FirFox") ) {
			System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\geckodriver-64bit.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		wait = new WebDriverWait(driver, 30);
		action = new Actions(driver);
		
		// if page = "userUrl" then goto user page
		// if page = "adminUrl" then goto admin page
		driver.get(prop.getProperty(page));
		
	}

}
