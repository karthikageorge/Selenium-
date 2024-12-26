package exerices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.in/");
       
      /* WebElement idLocator=driver.findElement(By.id("nav-logo-sprites"));
       System.out.println(idLocator);
       idLocator.click();
       
       WebElement classLocator=driver.findElement(By.className("a-button-input"));
       System.out.println(classLocator);
       classLocator.click();
       
       WebElement cssLocator=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
       cssLocator.sendKeys("toys");*/
       
       //WebElement linklocatorText=driver.findElement(By.partialLinkText("Today's"));
       //linklocatorText.click();
       WebElement partialLink=driver.findElement(By.linkText("Customer Service"));
       partialLink.click();
	}
	
	

}
