package seleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitExample {

	public static void main(String[] args) {
		String state="Hawaii";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/dynamic_loading/2");
		WebElement startBtn=driver.findElement(By.xpath("//button[text()='Start']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		startBtn.click();
		
		WebElement helloWorld=driver.findElement(By.xpath("//h4[contains(text(),'Hello World')]"));
		
		String hello=helloWorld.getText();
		System.out.println(hello);

	}

}
