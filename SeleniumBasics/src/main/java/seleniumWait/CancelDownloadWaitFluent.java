package seleniumWait;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class CancelDownloadWaitFluent {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		Wait<WebDriver> wait = new FluentWait<>(driver) .
				withTimeout(Duration.ofSeconds(60)) .
				pollingEvery(Duration.ofSeconds(2)) .
				ignoring(TimeoutException.class);
		driver.get("https://selenium.qabible.in/jquery-progress-bar.php");
		driver.manage().window().maximize();
		WebElement startButton=driver.findElement(By.xpath("//button[@id='downloadButton']"));
		startButton.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[text()='Cancel Download']")));
		WebElement cancelButton=driver.findElement(By.xpath("//button[text()='Cancel Download']"));
		WebElement textmsg=driver.findElement(By.xpath("//div[text()='Complete!']"));
		System.out.println(textmsg.getText());

	}

}
