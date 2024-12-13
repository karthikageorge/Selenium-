package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement Entermsg = driver.findElement(By.id("single-input-field"));
		Entermsg.sendKeys("Hello");
		WebElement SendmsgBtn =driver.findElement(By.cssSelector("#button-one"));
		SendmsgBtn.click();
		WebElement sendMsg=driver.findElement(By.xpath("//input[@id='single-input-field']"));
				sendMsg.sendKeys("Hi");
				//parent-child
				WebElement parentChild=driver.findElement(By.xpath("//div[@class='form-group']//input[@id='single-input-field']"));
				sendMsg.sendKeys("Parent");
				//index
				
				
				//text
				//tagName[text()='text content']
				//button[text()='Show Message']
				WebElement txtBtn=driver.findElement(By.xpath("//button[text()='Show Message']"));
				txtBtn.click();
				
	}

}
