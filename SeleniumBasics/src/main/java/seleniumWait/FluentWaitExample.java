package seleniumWait;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitExample {

	public static void main(String[] args) {
String state="Hawaii";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		//Wait<WebDriver> wait = new FluentWait<>(driver) .withTimeout(Duration.ofSeconds(2)) .pollingEvery(Duration.ofMillis(300)) .ignoring(ElementNotInteractableException.
		Wait<WebDriver> wait = new FluentWait<>(driver) .
				withTimeout(Duration.ofSeconds(60)) .
				pollingEvery(Duration.ofSeconds(2)) .
				ignoring(TimeoutException.class);
		driver.navigate().to("https://the-internet.herokuapp.com/dynamic_loading/2");
		
		WebElement startBtn=driver.findElement(By.xpath("//button[text()='Start']"));
		wait.until(ExpectedConditions.elementToBeClickable(startBtn));//starts to wait to click the start button
		
		startBtn.click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h4[contains(text(),'Hello World')]")));
		
		  WebElement helloWorld=driver.findElement(By.xpath("//h4[contains(text(),'Hello World')]"));
		
		String hello=helloWorld.getText();
		System.out.println(hello);
	}

}
