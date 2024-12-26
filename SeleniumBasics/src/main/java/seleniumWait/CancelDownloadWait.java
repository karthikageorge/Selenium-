package seleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CancelDownloadWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/jquery-progress-bar.php");
		driver.manage().window().maximize();
		//declare obj of class WebDriverWait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		WebElement startBtn=driver.findElement(By.xpath("//button[@id='downloadButton']"));
		startBtn.click();
		
		
		//invisibilityOfAllElementsLocatedBy
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[contains(text(),'Cancel')]")));
		//WebElement cancelDownloadBtn=driver.findElement(By.xpath("//button[contains(text(),'Cancel')]"));
		
		WebElement completeText=driver.findElement(By.xpath("//div[text()='Complete!']"));
		String text=completeText.getText();
		System.out.println(text);
		
	}

}
