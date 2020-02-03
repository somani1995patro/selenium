import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
@Test
public class mouse_movements {
    public void mouse_keys() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "C:\\seleniumdriver\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://demowebshop.tricentis.com/");
    WebElement element=driver.findElement(By.xpath("//a[@href='/computers']"));
    WebElement subelement=driver.findElement(By.xpath("//a[@href='/notebooks']"));
    
    Actions a= new Actions(driver);
    a.moveToElement(element).build().perform();
    WebDriverWait wait=new WebDriverWait(driver,30);
    wait.until(ExpectedConditions.visibilityOf(subelement));
    a.moveToElement(subelement).click().build().perform();
    Thread.sleep(3000);
    System.out.println("url:-"+driver.getCurrentUrl());
    driver.close();
    
    
     }
}
