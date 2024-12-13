package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/ajax.html");
		driver.manage().window().maximize();
		WebElement yesRadioBtn=driver.findElement(By.xpath("//input[@value='Yes']"));
		yesRadioBtn.click();
		WebElement checkBtn =driver.findElement(By.xpath("//input[starts-with(@id,'button')]"));
		checkBtn.click();

	}

}
