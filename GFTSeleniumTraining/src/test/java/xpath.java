//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
	public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver", "C:\\seleniumdriver\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
    driver.get("http://demoaut.com");
    
    //driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("som");
    //driver.findElement(By.name("userName")).sendKeys("SOM");
    //driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("som");
    //driver.findElement(By.xpath("//td/input[@name='userName']")).sendKeys("som");
    
    //for password
    //driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input")).sendKeys("lkm");
    //driver.findElement(By.xpath("//tr/td/input[@name='password']")).sendKeys("lkm");
    
	}
}
