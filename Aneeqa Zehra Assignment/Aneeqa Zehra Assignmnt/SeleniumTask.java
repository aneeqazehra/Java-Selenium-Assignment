import java.io.IOException;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SeleniumTask {

	//Properties
	static WebDriver webDriver;
	static String desiredURL;
	
	//Methods
	public static String accessURL()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Test\\chromedriver_win32\\chromedriver1.exe");
		RemoteWebDriver chromeDriver = new ChromeDriver();
		
		desiredURL = "http://www.yahoo.com/";
		
		//Access URL
		{
			chromeDriver.navigate().to(desiredURL);
			chromeDriver.manage().window().maximize();
			String pageObjectHandle = chromeDriver.getWindowHandle();
			System.out.println("Execution Over");
				return pageObjectHandle;
		}
		
		
	}
}
