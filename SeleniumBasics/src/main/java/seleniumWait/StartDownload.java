package seleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StartDownload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(600));
		driver.navigate().to("https://selenium.qabible.in/jquery-progress-bar.php");
		WebElement startBtn=driver.findElement(By.xpath("//button[@id='downloadButton']"));
		wait.until(ExpectedConditions.elementToBeClickable(startBtn));//starts to wait to click the start button
		startBtn.click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[text()='Complete!']")));
		
		WebElement completeText=driver.findElement(By.xpath("//div[text()='Complete!']"));
		String text=completeText.getText();
		System.out.println(text);
		

	}

}
