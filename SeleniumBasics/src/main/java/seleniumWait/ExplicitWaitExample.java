package seleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) {
String state="Hawaii";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(600));
		driver.navigate().to("https://the-internet.herokuapp.com/dynamic_loading/2");
		WebElement startBtn=driver.findElement(By.xpath("//button[text()='Start']"));
		//explicit
		wait.until(ExpectedConditions.elementToBeClickable(startBtn));//starts to wait to click the start button
		startBtn.click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h4[contains(text(),'Hello World')]")));
		//wait.until(ExpectedConditions.vivisibilityOfElementLocated(By.xpath("//h4[contains(text(),'Hello World')]")));
		WebElement helloWorld=driver.findElement(By.xpath("//h4[contains(text(),'Hello World')]"));
		
		String hello=helloWorld.getText();
		System.out.println(hello);
	}

}
