package seleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CancelDownloadWaitImplicit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/jquery-progress-bar.php");
		driver.manage().window().maximize();
		//WebDriverWait wait=driver.wait()
		//implicit wait applicable to all web elements 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement startButton=driver.findElement(By.xpath("//button[@id='downloadButton']"));
		startButton.click();
		WebElement cancelButton=driver.findElement(By.xpath("//button[text()='Cancel Download']"));
		WebElement textmsg=driver.findElement(By.xpath("//div[text()='Complete!']"));
		System.out.println(textmsg.getText());
		
	}

}
