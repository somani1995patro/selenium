import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframss {
     public static void main(String args[]) throws InterruptedException
     {
    	  System.setProperty("webdriver.chrome.driver", "C:\\seleniumdriver\\chromedriver.exe");
    	  WebDriver driver=new ChromeDriver();
    	  driver.manage().window().maximize();
    	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    	  driver.get("https://paytm.com/");
    	  Thread.sleep(3000);
    	  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div[4]")).click();
    	  Thread.sleep(5000);
    	  
    	  int totalframes=driver.findElements(By.tagName("iframe")).size();
    	  System.out.println("total frames:"+totalframes);
    	  
    	  for(int i=0; i<totalframes;i++)
    	  {
    		  driver.switchTo().frame(i);
    		  int s=driver.findElements(By.xpath("//*[@id=\"wallet-container-new qr-bg-white\"]/qr-code-login/div[2]/div[2]/div[3]/span")).size();
    		  System.out.println("size:"+s);
    		  
    		  if(s==0)
    		  
    			  driver.switchTo().defaultContent();
    		  
    		  else
    		  
    			  break;
    		  }
    		  driver.findElement(By.xpath("/*[@id=\"wallet-container-new qr-bg-white\"]/qr-code-login/div[2]/div[2]/div[3]/span")).click();
    		  driver.findElement(By.xpath("//*[@id=\"input_0\"]")).sendKeys("123123123");
    		  driver.switchTo().defaultContent();
    	  }
    		  
     }

