import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class google {
	@Test
	public void g_oole() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumdriver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com/");
	    WebElement g=driver.findElement(By.name("q"));
	    Actions a=new Actions(driver);
	    a.keyDown(g,Keys.SHIFT).sendKeys("old").keyUp(Keys.SHIFT).build().perform();
	    Thread.sleep(2000);
	    a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	    Thread.sleep(3000);
	    Assert.assertTrue(driver.getTitle().contains("Build your own computer"));
	}

}
