import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Seleniumdrivers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumdriver\\chromedriver.exe");
           ChromeDriver c= new ChromeDriver();
           c.get("http://www.google.com");
           
        // ie 
           System.setProperty("webdriver.ie.driver","C:\\seleniumdriver\\IEDriverServer.exe");
           InternetExplorerDriver f = new InternetExplorerDriver();
           f.get("http://www.google.com");
           
	}

}
