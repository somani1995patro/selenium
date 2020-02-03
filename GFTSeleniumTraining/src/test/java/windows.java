import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class windows {
	@Test
	public void frame() {
	System.setProperty("webdriver.chrome.driver", "C:\\seleniumdriver\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    Set<String> sw=driver.getWindowHandles();
    System.out.println("Total Windows"+sw.size());
    driver.get("https://www.naukri.com/");
    System.out.println("--------------------");
    Set<String> winIds = driver.getWindowHandles();
    System.out.println("Total Windows"+winIds.size());
    
    Iterator<String> it=winIds.iterator();
   // System.out.println("winIds"+it.next());
    it=winIds.iterator();
    
    String mainWindow_id=it.next();
    String firstpopup=it.next();
    String secondpopup=it.next();
    
    System.out.println(mainWindow_id);
    System.out.println(firstpopup);
    System.out.println(secondpopup);
    
    driver.switchTo().window(firstpopup);
    driver.close();
    
    driver.switchTo().window(secondpopup);
    driver.close();
    
	}
}
