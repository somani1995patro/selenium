import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class keyboard_keys {

	@Test
	public void keys_s() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumdriver\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("http://demowebshop.tricentis.com/");
		    //driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		    
		    WebElement element=driver.findElement(By.xpath("//*[@id='small-searchterms']"));
		    Actions a=new Actions(driver);
		    a.keyDown(element,Keys.SHIFT).sendKeys("computer").keyUp(Keys.SHIFT).build().perform();
		    Thread.sleep(2000);
		    a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		   // try {
				Thread.sleep(3000);
			//} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			//}
		    Assert.assertTrue(driver.getTitle().contains("Build your own computer"));

	}

}
