package stepDefination;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Setup {
	public static WebDriver driver;
	private Properties pr;
	public static String browser;
	public static String url;

	public Setup() {

		try {
			File file = new File("./Config/config.properties");
			FileInputStream fis = new FileInputStream(file);
			pr = new Properties();
			pr.load(fis);
			browser = pr.getProperty("browser");
			url = pr.getProperty("url");

		}

		catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void initialization() throws InterruptedException {
		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Browser Not Found" + browser);
			return;
		}

		driver.get(url);
		Thread.sleep(1000);
		driver.manage().window().maximize();
	}
}
