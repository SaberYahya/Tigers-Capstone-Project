package core;

import java.io.BufferedReader;
//import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	public static Properties config;
	public static Logger logger;
	public static String configFilePath = ".\\src\\test\\resources\\input\\config. properties";
	public static String log4jFilePath = ".\\src\\test\\resources\\input\\log4j.properties";

	public Base() {
		try {
			 BufferedReader reader = new BufferedReader(new FileReader(configFilePath));
			// FileReader reader = new FileReader(configFilePath);
			//FileInputStream reader = new FileInputStream(configFilePath);
			 config = new Properties();
			config.load(reader);

		} catch (FileNotFoundException e) {
			System.out.println("some ERRORS happened when tried to load your file from existing path");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("some ERRORS happened when tried to read your file");
			e.printStackTrace();
		}
		logger = Logger.getLogger("Logger-File");
		PropertyConfigurator.configure(log4jFilePath);
	}

	public static String getBrowserName() {
		String browserName = config.getProperty("browser");
		return browserName;
	}

	public static String getUrl() {
		String url = config.getProperty("url");
		return url;
	}

	public static void launchUrl() {
		driver.get(getUrl());
	}

	public static void shutBrowser() {
		driver.close();
		driver.quit();
	}

	public static void obtainBrowser() {
		String browserName = getBrowserName();
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "IE":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		case "opera":
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		}
		driver.get(config.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
}
