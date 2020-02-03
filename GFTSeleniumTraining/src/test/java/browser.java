import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class browser {
         
	String browser="chrome";
	
	@Test
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumdriver\\chromedriver.exe");
		 System.setProperty("webdriver.ie.driver","C:\\seleniumdriver\\IEDriverServer.exe");
		 
		 WebDriver driver=null;
		 
		if(browser.contentEquals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else 
		{
			driver=new InternetExplorerDriver();
		}
		 
		 
	}
}
