import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class link {
 public static void main(String args[])
 {
	 System.setProperty("webdriver.chrome.driver", "C:\\seleniumdriver\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	    driver.get("http://demoaut.com");
	    
	    
	    List<WebElement> linkNames=driver.findElements(By.tagName("a"));
	    System.out.println("total links:"+linkNames.size());
	    
	    //to get the names of all the links
	    for(int i=0; i<linkNames.size();i++)
	    {
	    	System.out.println(linkNames.get(i).getText());
	    }
	    driver.findElement(By.linkText("Hotels")).click();
	    String currentURL=driver.getCurrentUrl();
	    System.out.println("current url-->"+currentURL);
 }
}
