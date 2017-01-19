package fdm.automate;
import com.machinepublishers.*;
import com.machinepublishers.jbrowserdriver.JBrowserDriver;
import com.machinepublishers.jbrowserdriver.Settings;
import com.machinepublishers.jbrowserdriver.Timezone;

import junit.framework.Assert;

import java.io.File;
import java.nio.file.Path;
import java.util.Scanner;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App {
	
	private static WebDriver driver;
	
    public static void main( String[] args ){
    	System.setProperty("webdriver.chrome.driver", "chromedriver_win32/chromedriver.exe");
    	File file = new File("chromedriver_win32/chromedriver.exe");
    	System.out.println(file.exists());
    	driver = new ChromeDriver();
    	driver.get("https://www.google.co.uk");
    	System.out.println(driver.getPageSource());
    }
}
