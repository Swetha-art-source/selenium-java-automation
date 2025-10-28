import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BetterApprochForWebDriver {
	 private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	 
	 public static WebDriver getDriver() {
	 if (driver.get() == null) {
	 WebDriverManager.chromedriver().setup();
	 driver.set(new ChromeDriver());
	 }
	 return driver.get();
	 }
	}