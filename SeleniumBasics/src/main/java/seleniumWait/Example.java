package seleniumWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) throws InterruptedException {
		String state="Hawaii";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/dynamic_loading/2");
		WebElement startBtn=driver.findElement(By.xpath("//button[text()='Start']"));
		startBtn.click();
		Thread.sleep(7000);//freeze the code 7 sec hard codeing
		WebElement helloWorld=driver.findElement(By.xpath("//h4[contains(text(),'Hello World')]"));
		
		String hello=helloWorld.getText();
		System.out.println(hello);

	}

}
