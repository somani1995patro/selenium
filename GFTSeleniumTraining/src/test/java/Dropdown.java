
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String args[])
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\seleniumdriver\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("http://demowebshop.tricentis.com/books");
		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		   driver.findElement(By.xpath("//a[@href='/login.htm']")).click();
		   WebElement dropdown=driver.findElement(By.xpath("//*[@id='products-orderby']"));
		   
		   Select s=new Select(dropdown);
		   //select an item
		   //s.selectByIndex(0);
		  // s.selectByVisibleText("Name: A to Z");
		   
		   //count the total elements
		   List<WebElement> options=s.getOptions();
		   System.out.println("total elements:"+options.size());
		   for(int i=0; i<options.size();i++)
		   {
			   System.out.println(options.get(i).getText());
		   }
	 }
}
