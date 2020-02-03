import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
     public static void main(String args[])
     {
    		System.setProperty("webdriver.chrome.driver", "C:\\seleniumdriver\\chromedriver.exe");
 		    WebDriver driver=new ChromeDriver();
 		    driver.manage().window().maximize();
 		    driver.get("http://portfolio.rediff.com/portfolio-login");
 		    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
 		    driver.findElement(By.xpath("//*[@name='email-id']")).sendKeys("david");
 		  Alert al=driver.switchTo().alert();
 		  al.accept();
 		  driver.findElement(By.xpath("//*[@id='emailsubmit']")).click();
 		 driver.findElement(By.xpath("//*[@name='passwd']")).sendKeys("lkmlkm");
 		 driver.findElement(By.xpath("//*[@name='loginsubmit']")).click();
 		  
     }
}
