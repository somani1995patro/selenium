import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {
    public static void main(String args[])
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\seleniumdriver\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("http://demowebshop.tricentis.com/books");
		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		   driver.get("https://tutorialehtml.com/en/html-tutorial-radio-buttons/");
		   
		   List <WebElement> allRadioButtons=driver.findElements(By.name("citizenship"));
		   System.out.println("total radio buttons: "+allRadioButtons.size());
		   allRadioButtons.get(0).click();
		   
		   System.out.println(allRadioButtons.get(0).getAttribute("selected"));
		   System.out.println(allRadioButtons.get(1).getAttribute("selected"));
    }
}
