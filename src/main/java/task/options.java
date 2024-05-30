package task;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class options {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\pro\\drivers\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("disable-notifications");
		opt.addArguments("disable-popups");
		opt.addArguments("start-maximized");
		opt.addArguments("--headless");
		RemoteWebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.redbus.in/");
		System.out.println("Finished");
	}
}
